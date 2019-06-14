import java.util.Scanner;

public class Telemarketer 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int phone0 = 0;
		int phone1 = 0;
		int phone2 = 0;
		int phone3 = 0;
		
		phone0 = sc.nextInt();
		phone1 = sc.nextInt();
		phone2 = sc.nextInt();
		phone3 = sc.nextInt();
		
		if (phone0 == 8 || phone0 == 9)
		{
			if(phone1 == phone2)
			{
				if(phone3 == 8 || phone3 == 9)
				{
					System.out.println("ignore");
				}
				else
				{
					System.out.println("answer");
				}
			}
			
			else
			{
				System.out.println("answer");
			}
		}
		
		else
		{
			System.out.println("answer");
		}
		

	}

}
