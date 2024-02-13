package Assersion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {

	// Assert Equal
	@Test
	public void m1() {

		String actual = "prachi";
		String expected = "prachi";
		Assert.assertEquals(actual, expected);
		System.out.println("This is m1");
	}
	// ---------------------------------------------------

	// Assert not Equal
	@Test
	public void m2() {
		String actual1 = "prachi";
		String expected1 = "pra";
		Assert.assertNotEquals(actual1, expected1);
		System.out.println("This is m2");
	}
	// ---------------------------------------------------

	// if assert value same that time case will be pass otherwise failed....
	// assertTrue(true)-Pass.
	// assertTrue(false)-Failed.

	@Test
	public void m3() {
		Assert.assertTrue(true);
		System.out.println("This is m3");

	}

/*	@Test
	public void m4() {
		Assert.assertTrue(false);  // failed

	}*/
	
    // ---------------------------------------------------
	// assertFalse(false)-pass
	// assertFalse(true)-failed.

	@Test
	public void m5() {
		Assert.assertFalse(false);
		System.out.println("This is m5");
	}

/*	@Test
	public void m6() {
		Assert.assertFalse(true);  // failed
	}*/
	
	
	// -----------------------------------------------------

	//Assert NUll
	@Test
	public void m7() {
		String name=null;
		Assert.assertNull(name);    // passed
		System.out.println("This is m7");
		
	}
	// -----------------------------------------------------

	//Assert not NUll
	@Test
	public void m8() {
		String name="prachi";
		Assert.assertNotNull(name); 
		System.out.println("This is m8");
		
	}
}
