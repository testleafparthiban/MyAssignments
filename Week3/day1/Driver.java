package Week3.day1;

public class Driver {

	public void loadurl(String url)
	{
		System.out.println("url loaded"+url);
	}
	public void loadurl(String url,boolean status)
	{
		System.out.println("url loaded"+url+"\n"+"status mode"+status);
	}
	public static void main(String[] args) {
		Driver D = new Driver();
		D.loadurl("firebox");
		D.loadurl("edge",false);
		
	}
}
