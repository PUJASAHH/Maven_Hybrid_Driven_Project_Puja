package testscripts;

import org.testng.annotations.Test;

public class MyTest1 {

	@Test(groups="smoke")
	public void test11()  {
		System.out.println("MyTest1 test1");
	}
	
	@Test(groups="regression")
	public void test12()  {
		System.out.println("MyTest1 test2");
	}
	
	@Test(groups="ete")
	public void test13()  {
		System.out.println("MyTest1 test3");
	}
}
