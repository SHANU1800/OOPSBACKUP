class BankAccount{
	double Balance;
	String name;
	int ACNUMBER;
	String ACTYPE;
	static double rate=0.05;

	public BankAccount()
	{
		this.name="Anonymous";
		this.ACNUMBER=0;
		this.ACTYPE="Savings";
		this.Balance=0.0;
	}

public BankAccount(String name,int ACNUMBER,String ACTYPE,double Balance)
{
	    this.name=name;
		this.ACNUMBER=ACNUMBER;
		this.ACTYPE=ACTYPE;
		this.Balance=Balance;
}

public void deposit(double amount)
{
	this.Balance+=amount;
	System.out.println("Deposit successful.New Balance is:\t"+this.Balance);
}
	public void withdraw(double amount)
	{
		if(this.Balance-amount<1000)
		{
			System.out.println("Insufficient Balance.Minimum Balance should be 1000");
		}
		else
		{
			this.Balance-=amount;
			System.out.println("Withdrawal successful.New Balance is:\t"+this.Balance);
		}
	}

public static void ROI()
{
	System.out.println("Rate of interest: "+100*rate+"%");
}
public void displayDetails()
{
	System.out.println("Name:"+this.name);
		System.out.println("ACCOUNT NUMBER:"+this.ACNUMBER);
			System.out.println("ACCOUNT TYPE:"+this.ACTYPE);
				System.out.println("BALANCE:"+this.Balance);
}

}


public class L4Q3{

	public static void main(String[] args)
	{
		BankAccount AC1=new BankAccount("John",12000,"Current",5000);
		AC1.displayDetails();
		AC1.deposit(20000);
		AC1.withdraw(15000);
		AC1.displayDetails();
		BankAccount.ROI();

	}
}