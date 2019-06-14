import java.util.*;
import java.io.*;

public class PopulationDataBase
{
	int numLinee;
	int numCities;
	int maxCities;
	City[] data;
	
	
	public PopulationDataBase(int numLineslmao)
	{
		this.numLinee = numLineslmao;
		this.data = new City[this.numLinee];
	}
	
	public void readDataBaseFromFile (String filename) throws Exception
	{
		Scanner sc = new Scanner(new FileReader("DBTest.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("DBTestOut.txt"));
		String info = "";
		

		info = sc.nextLine();
		while (sc.hasNext())
		{
			//Reading the data from file
			info = sc.nextLine();
			
			//pw.println(info);
			//Creating an array for to hold each line
			
		}
		//pw.flush();
		//pw.close();
			
		
	}
	
	public void saveDataBaseToFile (String filename)
	{
		
	}
	
	public void insert(String newCity, String newCountry, long newPop, String newData)
	{
		
	}
	
	public void bubbleSort()
	{
		
	}
	
	public void bubbleSort(String option)
	{
		
	}
	
	public void insertSort()
	{
		
	}
	
	public String display()
	{
		return null;
	}
	
	public String display (int numlines)
	{
		return null;
	}
	
	public String getPopulation (String city)
	{
		return null;
	}
	
	public int getPopulationByCountry (String country)
	{
		return 0;
	}
	
	public int getNumCityByYear (int year)
	{
		return 0;
	}
	
}
