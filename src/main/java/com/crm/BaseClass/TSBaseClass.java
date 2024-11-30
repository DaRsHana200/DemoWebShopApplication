package com.crm.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TSBaseClass {
//	Create base class(cross browser testing , precondition ,postcondition ,login 
//	and logout) 
	
	public static WebDriver driver=null;
	
	public  void precondition(String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else {
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
	
	}
	@BeforeMethod
    public void login() {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
       driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("admin01");
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
}
//	@AfterMethod
//	public void logout() {
//		
//		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
//		
//	}
//	@AfterClass
//	public void postCondition()
//	{
//		driver.quit();
//	}
//		
//	}

