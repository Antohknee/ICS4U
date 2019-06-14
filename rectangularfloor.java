import java.util.*;
import java.io.*;
public class rectangularfloor 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner (new FileReader("DATA3.txt"));
		PrintWriter pw = new PrintWriter (new PrintWriter("OUT3.txt"));
		int area = 0;
		int length = 0;
		int width = 0;
		
		
		while(sc.hasNext())
		{
			length = sc.nextInt();
			width = sc.nextInt();
			pw.println(length+" "+width);
		}
		pw.flush();
		pw.close();
		// TODO Auto-generated method stub

	}

}
