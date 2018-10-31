
public abstract class Account {

	float amt;
	String name;
	static int num;
	int anum;
	TransReport[] TReport = new TransReport[20];
	static int count = 0;
	
	public Account()
	{
		this.amt=0.0f;
		this.name="";
	}
	
	public Account(float amt, String name)
	{
		this.amt=amt;
		this.name=name;
		num=num + 1;
		anum = num;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnum() {
		return anum;
	}
	public void setAnum(int anum) {
		this.anum = anum;
	}
	
	public abstract void deposit();
	public abstract void withdraw();
	
	
	public void transactionReport(int Tamt,String Tname)
	{
		TransReport t1 = new TransReport(Tamt,Tname);
		TReport[count] = t1;
		count = count + 1;
	}
	
	public void dispReport()
	{
		System.out.println("Transaction Report");
		int count2 = 0;
		while (count2 < count)
		{
		System.out.print(TReport[count2].Tamt );
		System.out.println("     ");
		System.out.println(TReport[count2].Tname);
		count2 ++;
		}
	}
}
	

