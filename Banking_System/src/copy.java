
public class copy {
	System.out.println("Enter your Account number");
	int count3 = 0; 
	int accountNum = m1.nextInt();
	for( Account current: accRec )
	{
		if (current.getAnum() == accountNum)
		{
			break;
		}
		count3++;
	}

	System.out.println("Choose one option");
	System.out.println("1. Deposit");
	System.out.println("2. Withdraw");
	int choice = m1.nextInt();
	switch(choice)
	{
	case 1: accRec[count3].deposit();
	break;
	case 2: accRec[count3].withdraw();
	break;
	}
	break;
}
