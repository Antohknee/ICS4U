import java.io.*;
import java.util.*;
public class IconScalinge 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int scale = 0;
		
		scale = sc.nextInt();
		
		String grid[][] = new String[scale][scale];
		
		while(sc.nextLine() != null)
		{
			String newword = sc.next();
			int newlength  =(newword.length()*scale);
			String[][] grid2 = new String[newlength][newlength];
			
			for(int r = 0; r < newlength; r++)
			{
				
			}
			
		}

	}

}
