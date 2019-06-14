/* Student Average
 * Anthony Truong
 * Mr.Reid
 * ICS4UC
 * 2/15/2019
 **/
import java.util.Scanner;

public class StudentAverage
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//Relevant Variables
		System.out.println("Please enter the number of students:");
		int students = sc.nextInt();
		int totalmarks = 0;
		double average = 0;
		
		//Create Array for Student Averages
		int[] group = new int[students];
		System.out.println("Please enter the average of the students");
		
		//Create for loop to get input from user of student marks
		for (int i=0; i<group.length; i++)
		{
			group[i] = sc.nextInt();
		}
		
		//Create another loop to add all of "i" amount of averages together
		for (int i=0; i<group.length; i++)
		{
			totalmarks = totalmarks + group[i];
		}
		
		average = totalmarks/students;
		System.out.println("The total average for "+students+" is "+average);
	}

}
