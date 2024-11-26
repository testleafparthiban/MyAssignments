package Week3.day1;

public class safari extends Browser{
	
	public void readerMode()
	
	{
		System.out.println("readerMode");
	}
	
	public void fullScreenMode()
	
	{
		System.out.println("Screen");
	}
	
	public static void main(String[] args) {
		
		safari sa=new safari();
		sa.readerMode();
		sa.fullScreenMode();
		sa.closebrowser();
		sa.openURL();
	}
	
	

}
