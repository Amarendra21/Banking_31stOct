import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class SalaryAccount extends Account {
	Calendar cal = Calendar.getInstance();
	Calendar future = Calendar.getInstance();
	int transMonth;
	int blockMonth;
  int minAmount;
  
  Scanner s2=new Scanner(System.in);
  
public SalaryAccount()
  {
	super();
	transMonth =cal.get(Calendar.MONTH);
	future.add(Calendar.MONTH,2);
	blockMonth = future.get(Calendar.MONTH);
	minAmount = 10000;
  }
  
  
public SalaryAccount(float amt, String name) {
	super(amt,name);

	future.add(Calendar.MONTH,2);

	this.minAmount =10000;
}


@Override
public void deposit() {
	cal.get(Calendar.MONTH); 
	if(cal.after(future))
	{
		System.out.println("Account Freezed"); 
	}
	else
	{
		System.out.println("Enter the amount to be deposited");
		int depo=s2.nextInt();
		this.amt = amt + depo;
		System.out.println("Transaction Successful");
		System.out.println("Your current balance is: " +amt);
		transactionReport(depo,"Deposit");
		future.add(Calendar.MONTH,2);
		
	}	
}
@Override
public void withdraw() {
	cal.get(Calendar.MONTH); 
	if(cal.after(future))
	{
		System.out.println("Account Freezed"); 
	}
	else
	{
		System.out.println("Enter the amount you want to withdraw");
		int wdraw=s2.nextInt();
		int check1 = (int) (amt - wdraw);
		if (check1 >= minAmount)
		{
		this.amt=amt - wdraw;
		System.out.println("Transaction Successful");
		System.out.println("Your current balance is: " +amt);
		transactionReport(wdraw,"Withdraw");
		future.add(Calendar.MONTH,2);
		}
		else
		{
			System.out.println("Sorry Low Balance!!");
		}
	}
}

}
