package Week3.day1;

public class Edge extends Browser{
	public void takeSnap()
	
	{
		System.out.println("takeSnap");
	}
	
	public void clearCookies()
	
	{
		System.out.println("clearCookies");
	}
	
	public static void main(String[] args) {
		
		Edge ed=new Edge();
		ed.clearCookies();
		ed.openURL();
		ed.takeSnap();
	}
	

}
