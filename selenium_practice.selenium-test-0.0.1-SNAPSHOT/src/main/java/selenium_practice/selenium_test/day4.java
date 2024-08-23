package selenium_practice.selenium_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@BeforeClass
	public void bclass()
	{
		System.out.println("before class 4");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("after class 4");
	}
	@Test(enabled=false)
	public void ademo4()
	{
		System.out.println("ok: 1st element of class 4");
	}
	@AfterTest
	public void atest()
	{
		System.out.println("after test class 4");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="firstname";
		data[0][1]="firstpass";
		data[1][0]="secondname";
		data[1][1]="secondpass";
		data[2][0]="thirdname";
		data[2][1]="thirdpass";
		return data;
	}
	@Test(dataProvider="getData")
	public void edemo5(String username,String password)
	{
		System.out.println("ok all right: 2nd element of class 4");
	}
	@Test(dependsOnMethods={"edemo5"})
	public void bdemo5()
	{
		System.out.println("ok all good: 3rd element of class 4");
	}
	@Parameters({"URL","numbers"})
	@BeforeTest
	public void demo6(String urlname,String numsrs)
	{
		System.out.println("ok let me go 2nd: before test of class 4");
		System.out.println(urlname);
		System.out.println(numsrs);
	}
	@BeforeMethod(groups= {"element"})
	public void bmethod()
	{
		System.out.println("execute before every element: before method class 4");
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("execute after every element: after methof class 4");
	}
	@BeforeSuite
	public void top()
	{
		System.out.println("Title: before suite class 4");
	}
	
}
