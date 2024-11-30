package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void softassert()
	{
		EdgeDriver d=null;
		String expected_url = "https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual_url, expected_url);//assertEquals this method is non static
		System.out.println("I m in dws page");
		WebElement register = driver.findElement(By.className("ico-register"));
		sa.assertTrue(register.isEnabled());
		register.click();
		sa.assertNull(d);
		driver.close();
		sa.assertAll();
		//assertAll(); this method return all records where execution is failed 
		// that we can used asserAll(); method
		//line no 29 we get exception AssertError(); execption
		
	}

}
