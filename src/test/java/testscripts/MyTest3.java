package testscripts;

import org.testng.annotations.Test;

public class MyTest3 {
	@Test(groups="smoke")
	public void test31()  {
		System.out.println("MyTest3 test31");
	}
	
	@Test(groups="regression")
	public void test32()  {
		System.out.println("MyTest3 test32");
	}
	
	@Test(groups="ete")
	public void test33()  {
		System.out.println("MyTest3 test33");
	}
}
