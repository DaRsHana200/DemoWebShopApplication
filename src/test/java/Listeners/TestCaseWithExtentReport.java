package Listeners;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestNG1.Kawasaki;
@Listeners(com.crm.Listeners.DWSExtentReprt.class)
public class TestCaseWithExtentReport {
	
	@Test
	public void honda()
    {
		Reporter.log("I am honda",false);
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	driver.get("https://www.honda2wheelersindia.com/");
    }
	@Test
	public void kawasaki()
    {
		Reporter.log("I m Kawasaki");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	driver.get("https://kawasaki-india.com/");
    	assertEquals("Darshnaa", "Jaanu");
    }
	@Test(dependsOnMethods = "kawasaki")
	public void royalEnfield()
    {
		Reporter.log("I m royalEnfield");
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	driver.get("https://www.royalenfield.com/in/en/motorcycles/");
    }

}
