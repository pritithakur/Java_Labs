import java.util.Scanner; 
class Armstrong 
{
	public static void main(String[] args) 
	{
		int n,rem,sum=0;
		System.out.println("Enter your number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int test =n;
		while(n>0)
		{
			rem = n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact*= i;
			}
			sum += fact;
			n=n/10;
		}
		if(sum == test)
		{
			System.out.println("It is armstrong number!!");
		}
		else
		{
			System.out.println("It is not armstrong number!!");
		}
		
	}
}
