package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
//AssertionError - we get
public class hardAssert {
	
	@Test
	public void main()
	{
		EdgeDriver d=null;
		 String expected_url = "https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		//if the verification is pass/Failed
		//assertEquals -static method
		assertEquals(expected_url, actual_url,"I m not in dws page");//failed- it will execute
		// pass--it will execute 
		System.out.println("I m in dws page");
	   WebElement register = driver.findElement(By.className("ico-register"));
	   //assertTrue() it will accept only one parameter
	   //if it is not enabled then it will execute statement
	   assertTrue(register.isEnabled(),"register link is not enalbled...");
	   register.click();
	   //assertNull- if it is null it will execute next steps
	   assertNull(d);	   
	   driver.close();
	   
		
	}

}
