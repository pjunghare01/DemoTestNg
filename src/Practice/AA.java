package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AA {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This Code will execute before suit");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("In a class this code will execte First");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This code will execute before every method");
	}
	
	
	@Test
	public void m1() {
		System.out.println("First Method m1");
	}
	@Test
	public void m2() {
		System.out.println("Second Method m2");
	}
	
	 
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This code will execute after every method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("In a class this code will execte last");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This code will execute after suite");
	}

}
