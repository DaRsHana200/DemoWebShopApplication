package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {
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
	//parallel Executions it will open two window because thread count is 2
	//invocationCount = 2,threadPoolSize = 3)-- thread count is 3 but it will open 2 browser and execution on 2 browser.
	//threadPoolSize depends on invocationCount.
	@Test(priority = -1,invocationCount = 2,threadPoolSize = 2)
	public void csk()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		System.out.println("csk");
		driver.close();
	}
	@Test(priority = -2)
	public void dc() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.delhicapitals.in/");
		System.out.println("dc");
		
	
		driver.close();
		
	}

}
