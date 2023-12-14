public class Bank 
{
	double amount;
	public Bank(double Givenamount)
	{
		amount = Givenamount;
	}
	public void withdraw(double withdrawalAmount)
	{
		if(withdrawalAmount <= amount)
		{
			amount -= withdrawalAmount;
			System.out.println("Withdrawal Successful1 !!");
		}
		else
		{
			System.out.println("Insufficient balance ");
		}
	}
	public void deposit(double depositAmount)
	{
		amount += depositAmount;
	}
	public void display()
	{
		System.out.println("Total Balance : " + amount);
	}
	public static void main(String args[])
	{
		Bank output = new Bank(10000);
		output.withdraw(5000);
		output.deposit(5000);
		output.display();
	}

}

