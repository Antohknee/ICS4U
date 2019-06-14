import java.util.Scanner;

public class RSANumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Relevant Variables
		int lowerrange = 0;
		int upperrange = 0;
		int factors = 0;
		int rsa = 0;
		int finalrange = 0;
		
		//Receive input from User
		System.out.println("To find the RSA numbers contained between the range.");
		System.out.println("Please enter the lowest number:");
		lowerrange = sc.nextInt();
		finalrange = lowerrange;
		System.out.println("Please enter the highest number:");
		upperrange = sc.nextInt();
		
		/*Calculation
		 *Create a while loop that runs until all the numbers from the lower range increase
		 *to the upper range
	     */
		while (lowerrange != upperrange)
		{
			/*Create a for loop
			 *The for loop runs until the divisor is equal to the dividend
			 */
			for (int i=1; i < lowerrange;i++)
			{
				/*If statement with modulus checks the remainder after being divided by i
				 *If the remainder is 0, then it is a factor of the lower range
				 */
				if (lowerrange%i == 0)
				{
					factors++;
					if (factors == 4)
					{
						rsa++; 
					}
					
				}
				
				//If there are exactly 4 factors that means that it is a RSA number
			}
			factors = 0;
			lowerrange = lowerrange + 1;
			}
		//Output the RSA Numbers
		System.out.println("Between "+finalrange+" and "+upperrange+" there are "+rsa+" RSA numbers.");
	}
		
		
}
