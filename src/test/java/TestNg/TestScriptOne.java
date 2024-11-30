package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class TestScriptOne extends DwsBaseClass {
	
	String expected_url="https://demowebshop.tricentis.com/news/rss/1";
	
	@Test
	public void testScript1() throws InterruptedException
    {
		 List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']//ul//li"));
		for (WebElement web : links) 
		{
			web.click();
			 String actual_url = driver.getCurrentUrl();
			if(actual_url.equals(expected_url))
			{
				driver.navigate().back();
			}
			Thread.sleep(1000);
		}
		
		System.out.println("TestScript1");
    }
	
	@Test
	public void testScript2()
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("testScript2");
	}
	
}
