
public class vroomvroom 
{

	static void FullThottle()
	{
		System.out.println("The car is going as fast as it can already!");
	}
	
	static void maxvelocity(int maxspeed)
	{
		System.out.println("We are currently travelling at "+maxspeed+"km/h you're insane!");
	}
	
	public static void main(String[] args) 
	{
		vroomvroom racecar = new vroomvroom();
		racecar.FullThottle();
		racecar.maxvelocity(400);

	}

}
