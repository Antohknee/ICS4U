import java.util.Scanner;

public class AreWeThereYet 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numone = sc.nextInt();
		int numtwo = sc.nextInt();
		int numthree = sc.nextInt();
		int numfour = sc.nextInt();
		
		int sum1 = numone + numtwo;
		int sum2 = numone + numtwo + numthree;
		int sum3 = numone + numtwo + numthree + numfour;
		int sum4 = numtwo + numthree;
		int sum5 = numtwo + numthree + numfour;
		int sum6 = numthree + numfour;
		
		
		//Line 1 Output
		System.out.println("0 "+numone+" "+sum1+" "+sum2+" "+sum3);
		
		//Line 2 Output
		System.out.println(numone+" 0 "+numtwo+" "+sum4+" "+sum5);
		
		//Line 3 Output
		System.out.println(sum1+" "+numtwo+" "+"0 "+numthree+" "+sum6);
		
		//Line 4 Output
		System.out.println(sum2+" "+sum4+" "+numthree+" 0 "+numfour);
		
		//Line 5 Output
		System.out.println(sum3+" "+sum5+" "+sum6+" "+numfour+" 0");
		
		
	}

}
