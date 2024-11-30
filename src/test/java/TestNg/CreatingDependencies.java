package TestNg;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatingDependencies {
	//we get ThreadTimeoutException
	//run: 3, Failures: 1, Skips: 2
	@Test(timeOut = 1000)
	public void createAccount() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		System.out.println("csk");
		driver.close();
		
		System.out.println("createAccount");
		
	}
	@Test(dependsOnMethods = "createAccount")
	public void modifyAccount()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.delhicapitals.in/");
		System.out.println("dc");
	     driver.close();
		System.out.println("modifyAccount");
		
	}
	@Test(dependsOnMethods = "createAccount")
	public void deleteAccount()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.iplt20.com/teams/royal-challengers-bangalore");
		System.out.println("rcb");
	     driver.close();
		System.out.println("deleteAccount");
	}
}
