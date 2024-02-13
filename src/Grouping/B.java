package Grouping;

import org.testng.annotations.Test;

public class B {
	@Test(groups = "smoke")
	public void Q1() {
		System.out.println("this is Q1");
	}
	@Test(groups = "Regression")
	public void Q2() {
		System.out.println("this is Q2");
	}

}
