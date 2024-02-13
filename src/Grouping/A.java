package Grouping;

import org.testng.annotations.Test;

public class A {
	@Test(groups = "smoke")
	public void launchBrowser() {
		System.out.println("Browser get Launched......");	
	}
	
	@Test
	public void getUrl() {
		System.out.println("WebPage is displayed......");	
	}
	
	@Test(groups = "smoke")
	public void varifyLogin() {
		System.out.println("login successfull......");	
	}
	

}
