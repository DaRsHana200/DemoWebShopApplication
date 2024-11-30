package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurutionAnnotation {
	@BeforeSuite
    public void beforesuite()
    {
      System.out.println("beforeSuite");	
    }
	@BeforeTest
    public void beforTest()
    {
		System.out.println("beforeTest");
    }
	@BeforeClass
    public void beforeClass()
    {
		System.out.println("beforeClass");
    }
	@BeforeMethod
	public void beforeMethod()
    {
		System.out.println("beforeMethod");
    	
    }
	@Test
	public void TestScript1()
    {
		System.out.println("TestScript1111");
    	
    }
	@AfterMethod
	public void afterMethod()
    {
		System.out.println("afterMethod");
    }
	@AfterClass
	public void afterClass()
    {
		System.out.println("afterClass");	
    }
	@AfterTest
	public void afterTest()
    {
		System.out.println("afterTest");
    	
    }
	@AfterSuite
	public void aftersuite()
    {
		System.out.println("afterSuit");
    	
    }
	@Test
	public void testScript2()
	{
		System.out.println("testScript222");
	}
	@Test
	public void testScript3()
	{
		System.out.println("testScript333");
	}
//	output--
//	beforeSuite
//	beforeTest
//	beforeClass
//	beforeMethod
//	TestScript1111
//	afterMethod
//	beforeMethod
//	testScript222
//	afterMethod
//	beforeMethod
//	testScript333
//	afterMethod
//	afterClass
//	afterTest
//	afterSuite
}
