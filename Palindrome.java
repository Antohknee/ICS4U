import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		//Initializing variables necessary
		Scanner sc = new Scanner(System.in);
		String string1 = "";
		String string2 = "";
		string1 = sc.nextLine();
		string1 = string1.replaceAll("\\s","");
		boolean newresult = true;
		newresult = palin(string1);
		
		//Decides whether or not it is a palindrome
		if (newresult == true)
		{
			System.out.println("Yes it is a palindrome");
		}
		else
		{
			System.out.println("No it is not a palindrome");
		}
	}

	public static boolean palin(String string1)
	{
		boolean result = true;
		if(string1.length() > 1)
		{
			if(string1.charAt(0) != string1.charAt(string1.length()))
			{
				result = false;
			}
			else
			{
				result = palin(string1.substring(1,string1.length()-1));
			}
		}
		return result;
	
	}
}
