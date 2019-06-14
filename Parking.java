import java.util.Scanner;

public class Parking 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int parking = 0;
		String line1 = "";
		String line2 = "";
		int available = 0;
		
		parking = sc.nextInt();
		line1 = sc.next();
		line2 = sc.next();
		
		for (int i = 0; i<parking; i++)
		{
			if(line1.charAt(i) == 'C')
			{
				if(line2.charAt(i) == 'C')
				{
					available++;
				}
			}
		}
		
		System.out.println(available);
	}

}
