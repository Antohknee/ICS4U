import java.io.*;
import java.util.*;

import javax.sound.sampled.Line;
public class IconScaling2 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(new FileReader("IconScalingIN2.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("IconScalingOUT2.txt"));
		
		int scale = 0;
		scale = sc.nextInt();
		String userinput = sc.next();
		String linei = "";
		String line = "";
		int chode = (scale*userinput.length());
		char[][] str = new char[userinput.length()][userinput.length()];
		
		char[] line1 = userinput.toCharArray();
		
		for(int i = 0; i<str.length; i++)
		{
			str[0][i] = line1[i];
			//pw.print(str[0][i]);
		}
		//pw.println("");
		
		for(int i = 1; i<str.length; i++)
		{
			linei = sc.next();
			char[] line2 = linei.toCharArray();
			
			for(int x = 0; x<str.length; x++)
			{
				str[i][x] = line2[x];
				//pw.print(str[i][x]);
			}
			//pw.println("");
		}
		
		for(int i = 0; i<userinput.length(); i++)
		{
			for(int y = 0; y<scale; y++)
			{
				
				for(int x = 0; x<userinput.length(); x++)
				{
					for(int z = 0; z<scale; z++)
					{
						pw.print(str[i][x]);
					}
					
				}
				pw.println("");
			}
			
		}
		
		pw.flush();
		pw.close();
		
		
	}

}
