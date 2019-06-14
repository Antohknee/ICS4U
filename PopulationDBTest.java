import java.util.*;
import java.io.*;

public class PopulationDBTest
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("DBTest.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("DBTestOut.txt"));
		int i = -1;
		
		
		//Count how many lines there are
		
		while (sc.hasNext())
		{
			String info = sc.nextLine();
			i++;
		}
		
		//Create PopulationDataBase object
		PopulationDataBase pdb = new PopulationDataBase(i);
		pdb.readDataBaseFromFile("DBTest.txt");
	
	}
 
}

