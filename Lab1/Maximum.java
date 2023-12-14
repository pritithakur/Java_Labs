import java.util.Scanner; 
class Maximum 
{

	public static void main(String[] args) 
	{
		int num1 , num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		num1= input.nextInt();
		System.out.println("Enter 2nd number: ");
		num2 = input.nextInt();
		if(num1>num2)
		{
			System.out.println(num1);
		}
		else
		{
			System.out.println(num2);
		}
	}
}
