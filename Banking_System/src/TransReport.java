
public class TransReport {
	int Tamt;
	String Tname;
	
	
	public int getTamt() {
		return Tamt;
	}
	public void setTamt(int tamt) {
		Tamt = tamt;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	
	public TransReport()
	{
		this.Tamt = 0;
		this.Tname = "";
	}
	
	public TransReport(int tamt, String tname) {
		Tamt = tamt;
		Tname = tname;
	}
	
}
