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
public class peerToPeerNetworkThreading {
    
 static String currentMessage = null;
 static ServerSocket serverSocket = null;
 static Socket clientSocket = null;
 static PrintWriter out = null;
 static Scanner in = null;
 static double xCoords;
 static double yCoords;

 private static String getMyIp() throws SocketException
 {
     String ip = "error";
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
 
 private static class MessageLoop implements Runnable {
  public void run() {
      String msg = "";
      //double coordX = 0;
      //double coordY = 0;
         //int msgCount = 0;
         System.out.println("Accepted connection awaiting messages...");
         while (!msg.equalsIgnoreCase("done"))
         {
          try {
            msg = in.nextLine();
            //xCoords = in.nextDouble();
            //yCoords = in.nextDouble();
          } catch (Exception e) {
                 System.out.println("Disconnected - assume done");
                 msg = "done";
             }
          String[] parts = msg.split(" ");
          xCoords = Double.parseDouble(parts[0]);
          yCoords = Double.parseDouble(parts[1]);
          //msgCount++;
          //currentMessage = msg;
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
        /*if (serverSocket == null)
        {
         // Someone has to go first
         out.println("Boo");
        }*/
        player1player s = new player1player();
        JFrame f = new JFrame();
        f.add(s);
        f.setVisible(true);
        f.setSize(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("ghetto snake");
        while (t.isAlive())
        {   
         //if (currentMessage != null) {
          //System.out.println(s.getXcoord()+" "+s.getYcoord());
          //currentMessage = null;          
          
         
         
         out.println(s.getXcoords()+" "+s.getYcoords());
         s.setXcoords(xCoords);
         s.setYcoords(yCoords);
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