import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
  * Example Peer to Peer code - threaded
  * @author Mr. Reid
  * Based on example from 
  * http://gpwiki.org/index.php/Java:Simple_TCP_Networking
  * https://docs.oracle.com/javase/tutorial/essential/concurrency/simple.html
  */
public class peerToPeerNetworkThreaded {
    
 static String currentMessage = null;
 static ServerSocket serverSocket = null;
 static Socket clientSocket = null;
 static PrintWriter out = null;
 static Scanner in = null;
 static int xCoords;
 static int yCoords;
 static Snek snake;
 static Snek snake2;
 static int length;
 static int xFood;
 static int yFood;

 private static String getMyIp() throws SocketException
 {
     String ip = "";
     Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
     while (interfaces.hasMoreElements()) {
       NetworkInterface iface = interfaces.nextElement();
       // filters out 127.0.0.1 and inactive interfaces
       if (!iface.isLoopback() && iface.isUp()) {
         Enumeration<InetAddress> addresses = iface.getInetAddresses();
         while(addresses.hasMoreElements()) {
           InetAddress addr = addresses.nextElement();
           ip = addr.getHostAddress();
           //System.out.println(iface.getDisplayName() + " " + ip);
         }
       }
     }
     return ip;
 }
 
 public static class MessageLoop implements Runnable {
  public void run() {
      String msg = "";
         
         System.out.println("Accepted connection awaiting messages...");
         while (!msg.equalsIgnoreCase("done"))
         {
          try {
           msg = in.nextLine();
           String[] parts = msg.split(" ");
           
           xCoords = Integer.parseInt(parts[0]);
           yCoords = Integer.parseInt(parts[1]);
           length  = Integer.parseInt(parts[2]);
           //xFood = Integer.parseInt(parts[3]);
           //yFood = Integer.parseInt(parts[4]);
       
          } catch (Exception e) {
                 System.out.println("Disconnected - assume done");
                 msg = "done";
             }
        
         }     
     }
 }
 
 public static void main(String[] args) throws Exception 
    {
  Scanner sc = new Scanner(System.in);
  // Pick if we are listening or connecting
  System.out.print("Are you hosting? (Y/N):");
  if (sc.next().equalsIgnoreCase("Y"))
  {  
   // Socket information
         serverSocket = null;
         String serverAddr = getMyIp();
         int portNum = 1234;
         try {
             serverSocket = new ServerSocket(portNum);
         } catch (IOException e) {
             System.err.println("Could not listen on port: "+portNum);
             System.exit(1);
         }
         System.out.println("Ip: "+serverAddr+" Port: "+portNum);
         System.out.println("Socket open awaiting connection ...");
         // Accept connections
         clientSocket = null;
         try {
             clientSocket = serverSocket.accept();
         } catch (IOException e) {
             System.err.println("Accept failed.");
             System.exit(1);
         }
  } else {
   boolean connected = false;
   while (!connected)
   {
    System.out.print("Enter IP:");
    String serverAddr = sc.next();
    System.out.print("Enter Port:");
    int portNum = sc.nextInt();
    try {
     clientSocket = new Socket(serverAddr, portNum);
     connected = true;
    } catch (UnknownHostException e) {
     System.err.println("Don't know about host");
    } catch (IOException e) {
     System.err.println("Couldn't get I/O for the connection");
    }
   }
  }
        
        System.out.println(clientSocket);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new Scanner(clientSocket.getInputStream());

        // Thread off to handle input
        System.out.println("Start Thread to handle listening");
        Thread t = new Thread(new MessageLoop());
        t.start();

        // Meanwhile do our thing
        boolean done = false;
        
        //Start the Game -------------- Create Game Object named frame -------------------//
        Game frame = new Game();
        frame.setVisible(true);
        
        //Create snake and snake2 object here to access their methods from main//
        snake = frame.getSnake();
        snake2 = frame.getSnake2();
       
        //Updating screen and keeping game alive//
        while (t.isAlive())
        { 
         
         //Send info out to user
         out.println(snake2.getSnakeX(0)+" "+snake2.getSnakeY(0)+" "+snake2.getLength());
         
         
         //The info that is received from the user is put into setters
         snake.setSnakeX(xCoords);
         snake.setSnakeY(yCoords);
         snake.setLength(length);
         
         //The info is updated every 1 millisecond 
         Thread.sleep(1);
        }
     
        // Got disconnected - shut it down                
        out.close();
        in.close();
        clientSocket.close();
        if (serverSocket != null) {
         serverSocket.close();
        }
    }
}