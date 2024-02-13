package Grouping;

import org.testng.annotations.Test;

public class C {
	@Test(groups = "Regression")
	public void R1() {
		System.out.println("This is R1");
	}

	@Test
	public void R2() {
		System.out.println("This is R2");
	}
}
