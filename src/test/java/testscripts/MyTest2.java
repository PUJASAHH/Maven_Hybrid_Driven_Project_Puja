package testscripts;

import org.testng.annotations.Test;

public class MyTest2 {


	@Test(groups="smoke")
	public void test21()  {
		System.out.println("MyTest2 test21");
	}
	
	@Test(groups="regression")
	public void test22()  {
		System.out.println("MyTest2 test22");
	}
	
	@Test(groups="ete")
	public void test23()  {
		System.out.println("MyTest2 test23");
	}
}
