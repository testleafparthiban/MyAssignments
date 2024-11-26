package Week3.day1;

public class ChromiumDriverP extends RemoteWebDriverGP{
	
	public void starApp()
	{
		System.out.println("ChromiumDriver P");
	}
	
	public static void main(String[] args) {
		
		ChromiumDriverP cd=new ChromiumDriverP();
		cd.findElement();
		cd.findElements();
		cd.starApp();
		
	}

}
