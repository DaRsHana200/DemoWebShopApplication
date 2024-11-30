package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//Helper Methods of @TestNG.
//priority
//invocationCount
//ThreadPoolSize
//enable
//name
//dependsOnMethod
//Groups

public class InvocationCount {
	@Test(priority = 0)
	public void rcb()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.iplt20.com/teams/royal-challengers-bangalore");
		System.out.println("rcb");
	  driver.close();
	}
	@Test(priority = 1, invocationCount = 2)
	public void csk()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		System.out.println("csk");
		driver.close();
	}
	@Test(priority = 2)
	public void dc() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.delhicapitals.in/");
		System.out.println("dc");
		
	
		driver.close();
		
	}

}
