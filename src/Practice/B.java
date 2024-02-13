package Practice;

import org.testng.annotations.Test;

public class B {
	@Test(priority = 1)
	public void launchBrowser() {
		System.out.println("Browser get Launched......");
		
	}
	
	@Test(priority = 2)
	public void getUrl() {
		System.out.println("WebPage is displayed......");
		
	}
	
	@Test(priority = 3)
	public void varifyLogin() {
		System.out.println("login successfull......");
		
	}
	

}
