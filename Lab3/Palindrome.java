import java.util.*;
class Palindrome 
{
	public static void main(String[] args) 
	{	
		
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = "";
		for(int i= string1.length()-1; i>=0; i--)
		{
			string2 += string1.charAt(i);
		}
		if(string2.equals(string1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palidnrome");
		}

	}
}
