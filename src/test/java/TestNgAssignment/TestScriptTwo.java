package TestNgAssignment;

import java.rmi.AccessException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

//• Open the browser 
//• Maximize  
//• Verify the page by using url 
//• Enter into dws page 
//• login 
//• Scroll Down 
//• Click facebook,rss,youtube,google,twitter which is present at the 
//bottom of the page by using findelements 
//• Click create new Account button in facebook 
//• Fill all the details of facebook 
//• Logout 
//• Close 

public class TestScriptTwo  extends DwsBaseClass{
	
	String  expected_url="https://www.facebook.com/nopCommerce";
	String expected_url1="https://www.facebook.com/reg/?next=%2FnopCommerce";
	 
	@Test
	public void testScriotTwo() throws InterruptedException
	{
		String rss_url = "https://demowebshop.tricentis.com/news/rss/1";
		String facebook = "https://www.facebook.com/nopCommerce";
		String twitter="https://x.com/nopCommerce";

		String expected_url = "https://demowebshop.tricentis.com/";

		String actual_url = driver.getCurrentUrl();

		String parentHandle = driver.getWindowHandle();

		if (expected_url.equals(actual_url)) {

			Actions actions = new Actions(driver);

			actions.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();

			List<WebElement> followUS = driver.findElements(By.xpath("//div[@class=\"column follow-us\"]/ul/li/a"));

			for (WebElement element : followUS) {
				Thread.sleep(1000);
				element.click();
				if (driver.getCurrentUrl().equals(rss_url)) {
					driver.navigate().back();
				}
				Thread.sleep(4000);
			}

			Set<String> handles = driver.getWindowHandles();
			
			for(String handle : handles) {
				
				driver.switchTo().window(handle);
				
				if(driver.getCurrentUrl().equals(facebook)) {
					
					driver.findElement(By.xpath("//span[text()='Create new account']")).click();

					Thread.sleep(3000);
					
				}else if(driver.getCurrentUrl().equals(twitter)) {
					
					driver.findElement(By.xpath("//span[text()='Create account']")).click();
					
					Thread.sleep(3000);
				}
			}
			
			driver.switchTo().window(parentHandle);
		}		
	}

	    
		
	
		
	}

	 
		
		
		
		
		
		
		
		
	

