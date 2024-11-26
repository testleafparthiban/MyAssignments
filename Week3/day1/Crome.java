package Week3.day1;

public class Crome extends Browser {

public void openIncognito()

{
	System.out.println("openincognito");
}

public void clearCache()

{
	System.out.println("clearcache");
}

public static void main(String[] args) {
	
	Crome cb=new Crome();
	cb.clearCache();
	cb.openURL();
	cb.openIncognito();
	
}
	

	

}
