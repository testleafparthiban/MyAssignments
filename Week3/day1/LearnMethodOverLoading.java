package Week3.day1;

public class LearnMethodOverLoading {
	public void startApp(String browser)
		
	{
		System.out.println("Browser Name:"+browser);
	
	}
	
	public void startApp(String browser,boolean headless)
	
	{
		System.out.println("Browser Name:"+browser+"\n"+"Headless Mode:"+headless);
	}
	
	public void locateElement(String Value)
	
	{
		System.out.println(Value);
	}
	
	public void locateElement(String locators,String value)
	
	{
		System.out.println(locators+""+value);
	}
	
	public static void main(String[] args) {
		LearnMethodOverLoading mo=new LearnMethodOverLoading();
		mo.startApp("Chrome");
		mo.startApp("Edge", false);
		mo.locateElement("username");
		mo.locateElement("id", "username");
		
		
	}

}
