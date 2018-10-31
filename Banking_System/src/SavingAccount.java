import java.util.Scanner;
public class SavingAccount extends Account {
int minLimit;

static Scanner s1=new Scanner(System.in);

public SavingAccount()
{
	super();
	this.minLimit=10000;
}

public SavingAccount(float amt, String name)
{
	super(amt,name);
	this.minLimit=10000;
}

@Override
public void deposit() {
	System.out.println("Enter the amount to be deposited");
	int depo=s1.nextInt();
	this.amt = amt + depo;
	System.out.println("Transaction Successful");
	System.out.println("Your current balance is: " +amt);
	transactionReport(depo,"Deposit");
	
}

@Override
public void withdraw() {
	System.out.println("Enter the amount you want to withdraw");
	int wdraw=s1.nextInt();
	int check1 = (int) (amt - wdraw);
	if (check1 >= minLimit)
	{
	this.amt=amt - wdraw;
	System.out.println("Transaction Successful");
	System.out.println("Your current balance is: " +amt);
	transactionReport(wdraw,"Withdraw");
	}
	else
	{
		System.out.println("Sorry Low Balance!!");
	}
	
}



}
