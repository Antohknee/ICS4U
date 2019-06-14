import java.util.Scanner;
import java.io.*;
public class IconScaling 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(new FileReader ("IconScalingIn.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter ("IconScalingOut.txt"));
		//Declare all the variables needed
		int scale = 0;
		String x = "x";
		String space = " ";
		String asterisk = "*";
		
		//User input for scale
		pw.println("Please enter a scale between 0 and 25");
		scale = sc.nextInt();
		pw.println(" ");
		while (scale < 1 || scale > 25)
		{
			if (scale < 0 || scale > 25)
			{
				pw.println("Please enter a valid number: ");
				scale = sc.nextInt();
			}
		}
		//Duplicating the image
		
		//Line 1
		for(int i=0; i < scale; i++)
		{
			for(int a=0; a < scale; a++)
			{
				pw.print(asterisk);
			}
			
			for(int a=0; a < scale; a++)
			{
				pw.print(x);
			}
			
			for(int a=0; a < scale; a++)
			{
				pw.print(asterisk);
				
			}
			pw.println(space);
		}
		
		//Line 2
		for(int z=0; z < scale; z++)
		{
			for(int i=0; i < scale; i++)
			{
				pw.print(" ");
			}
			
			for(int i=0; i < scale; i++)
			{
				pw.print(x);
			}
			
			for(int i=0; i < scale; i++)
			{
				pw.print(x);
			}
			pw.println(space);
		}
	
		//Line 3
		for(int y=0; y < scale; y++)
		{
			for(int i=0; i < scale; i++)
			{
				pw.print(asterisk);
			}
			
			for(int i=0; i < scale; i++)
			{
				pw.print(space);
			}
			
			for(int i=0; i < scale; i++)
			{
				pw.print(asterisk);
			}
			pw.println(space);
		}
		pw.flush();
		pw.close();
	}

}
