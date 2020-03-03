package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {
	@BeforeMethod
	public void befMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("After Method");
	}
	@BeforeClass
	public void befClass()
	{
		System.out.println("Brf class");
	}
	@AfterClass
	public void aftClass()
	{
		System.out.println("After Class");
	}
	@BeforeSuite
	public void beforeDemo()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void close_browser()
	{
		System.out.println("Close Browser");
	}
	@BeforeTest
	public void BefTest()
	{
	System.out.println("Before Test");
	}
	@AfterTest
	public void AftTest()
	{
		System.out.println("After Test");
	}
	@Test(priority=0)
	public void driverInfo()
	{
		System.out.println("Driver Info");
	}
	@Test(priority=1)
	public void Launch()
	{
		System.out.println("Launch");
	}
	

}
