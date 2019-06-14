import java.util.Scanner;

public class RecursionPrac 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		int test = 0;

		test = factorial(result);
		System.out.println(test);
	}
	
	public static int factorial(int result)
	{
		int test = 1; 
		if (result > 1)
		{
			test = (result*factorial(result-1));
		}
		return test;
	}

}
