import java.util.Scanner; 
class Leapyear 
{
	public static void main(String[] args) 
	{
		int year;
		System.out.println("Enter year: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if((year % 4==0 && year%100!=0)|| year%400==0)
		{
			System.out.println("It is leap year!!");
		}
		else
		{
			System.out.println("It is not leap year!!");
		}
	}
}

