package selenium_practice.selenium_test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1{
	@AfterTest
	public void end()
	{
		System.out.println("everything is done in 1st class: After test of 1st class");
	}
	@Test(groups= {"element"})
	public void demo()
	{
		System.out.println("hi: 1st element of class 1");
	}
	@Test
	public void demo2() {
	System.out.println("bye: 2nd element of class 1");	
	}
	@AfterSuite
	public void ending()
	{
		System.out.println("i'm the last: After suite of 1st class ");
	}
	
	
    

}
