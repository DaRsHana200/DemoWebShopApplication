package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSLogin;

public class login {
	
	@Test
	public void main()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/",driver.getCurrentUrl());
		DWSLogin ref=new DWSLogin(driver);
		ref.login_link.click();
		ref.email.sendKeys("admin01@gmail.com");
		ref.password.sendKeys("admin01");
		ref.remember_me.click();
		ref.login_button.click();
	   
		
		
	}

}
