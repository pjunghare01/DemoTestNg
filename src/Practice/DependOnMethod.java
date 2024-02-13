package Practice;

import org.testng.annotations.Test;

public class DependOnMethod {
	
	@Test
	public void enterDetails() {
		System.out.println("Enter valid UN & PWD");
	}
	
	@Test(dependsOnMethods ="enterDetails")
	public void varifyLogin() {
		System.out.println("Code to verify successfull login");
	}

}
