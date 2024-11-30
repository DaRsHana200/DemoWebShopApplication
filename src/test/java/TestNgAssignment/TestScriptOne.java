package TestNgAssignment;

import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;



public class TestScriptOne extends DwsBaseClass{
//	TestCase-1
//	• Open the browser
//	• Maximize
//	• Enter into dws page
//	• Verify the page by using url
//	• login
//	• Scroll down
//	• Click 25$ gift cart- pending
//	• Fill all the gift cart details
//	• Change the quantity to 2
//	• Click add to cart
//	• Verify the 25$ gift cart which is added successfully in shopping cart .
//	• Logout
//	• Close
	@Test
	public void testScriptone() throws InterruptedException 
	{
	  String expected_url="https://demowebshop.tricentis.com/";
	  
	  String actual_url = driver.getCurrentUrl();
	  
	    Actions act=new Actions(driver);
	    
	  if(expected_url.equals(actual_url))
	  {
		  System.out.println("I m in dws website");
		  act.keyDown(Keys.PAGE_DOWN).perform();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.linkText("$25 Virtual Gift Card")).click();
		  
		  driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Ram");
			
			driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("ram@gmail.com");
			
		  driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Tarun");
	      driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("tarun@gmail.com");
	      driver.findElement(By.id("giftcard_2_Message")).sendKeys("A little gift from your friend");
			
			WebElement qty=driver.findElement(By.id("addtocart_2_EnteredQuantity"));
			
			qty.clear();
			
			Thread.sleep(2000);
			
			qty.sendKeys("2");
			
			driver.findElement(By.id("add-to-cart-button-2")).click();
			
//			Thread.sleep(2000);
			
			driver.findElement(By.id("topcartlink")).click();
			
			WebElement giftCard = driver.findElement(By.xpath("//tr[@class='cart-item-row']/td/img[@title='Show details for $25 Virtual Gift Card']"));
			if(giftCard.isDisplayed()) {
				System.out.println("The card is visible");
			}else {
				System.out.println("Card is not visible");
			}
			
			Thread.sleep(2000);
			
		}


		  
		  
	  }
	 
	  
	  
	}


