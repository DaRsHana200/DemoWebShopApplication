package TestNg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AssignmentGuru99 {
	
	@Test
	public void rightClickMe() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act= new Actions(driver);
		
		WebElement right_click_Me = driver.findElement(By.xpath("//span[text()='right click me']"));
	    act.moveToElement(right_click_Me).contextClick().build().perform();
	    List<WebElement> list_elments = driver.findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li"));
	    for (WebElement web : list_elments)
	    {    
	    	web.click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			act.moveToElement(right_click_Me).contextClick().perform();
	    }	
	    driver.close();
	 }
	@Test
	public void doubleClickMe()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement double_clickMe = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	     Actions act1=new Actions(driver);
	     act1.doubleClick(double_clickMe).perform();
	     driver.switchTo().alert().accept();
	
	}
	
	
}
