import java.io.*;
import java.util.*;

public class Sunflower 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(new FileReader("SunflowerIn.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("SunflowerOut.txt"));
		int rotation = 0;
		int row = 0;
		int row1 = 2;

		int dimension = 0;
		dimension = sc.nextInt();
		int[][] grid = new int[dimension][dimension];
		int [][] matrix = new int[dimension][dimension];
		for(int r = 0; r<dimension; r++)
		{
			for(int c = 0; c<dimension; c++)
			{
				grid[r][c] = sc.nextInt();
				//pw.print(grid[r][c]);
				//pw.print(" ");
			}
			//pw.println("");
		}
		
		if(grid[0][0] < grid[1][0] && grid[0][0] < grid[0][1])
		{
			for(int r = 0; r<dimension; r++)
			{
				for(int c = 0; c<dimension; c++)
				{
					pw.print(grid[r][c]);
					pw.print(" ");
				}
				pw.println(" ");
			}
		}
		else if(grid[0][0] > grid[1][0] && grid[0][0] < grid[0][1])
		{
				for(int r = 0; r<dimension; r++)
				{
					for(int c = 0; c<dimension; c++)
					{
						matrix[r][c] = grid[c][r];
						//pw.print(matrix);
						//pw.print(" ");
					}
					//pw.println("");
				}
		}
		
		
		pw.flush();
		pw.close();

	}
}
