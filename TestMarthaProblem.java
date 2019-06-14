import java.util.*;
import java.io.*; 

public class TestMarthaProblem 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(new FileReader("input1.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output1.txt"));
		int numQuarters = 0;
		int numPlays1 = 0;
		int numPlays2 = 0;
		int numPlays3 = 0;
		int totaltimesplayed = 0;
		
		pw.println("How many quarters does Martha have in the jar?");
		numQuarters = sc.nextInt();
		pw.println("How many times has the first machine been played since playing out?");
		numPlays1 = sc.nextInt();
		pw.println("How many times has the second machine been played since playing out?");
		numPlays2 = sc.nextInt();
		pw.println("How many times has the third machine been played since playing out?");
		numPlays3 = sc.nextInt();
		
		
		
		Player martha = new Player(numQuarters);
		
		SlotMachine[] machines = new SlotMachine[3];
		machines[0] = new SlotMachine(35,30,numPlays1,1);
		machines[1] = new SlotMachine(100,60,numPlays2,1);
		machines[2] = new SlotMachine(10,9,numPlays3,1);

		
		
		totaltimesplayed = martha.playTillBroke(machines);
		
		pw.println("Martha plays "+totaltimesplayed+" times before going broke.");
		
		pw.flush();
		pw.close();
		
	}

}
