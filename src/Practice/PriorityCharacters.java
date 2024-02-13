package Practice;

import org.testng.annotations.Test;

public class PriorityCharacters {
	@Test(priority = 'k')
	public void launchBrowser() {
		System.out.println("Browser get Launched......");
		
	}
	
	@Test(priority = 'z')
	public void getUrl() {
		System.out.println("WebPage is displayed......");
		
	}
	
	@Test(priority = 'Z')
	public void varifyLogin() {
		System.out.println("login successfull......");
		
	}
	


}
