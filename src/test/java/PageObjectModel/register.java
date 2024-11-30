package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSRegister;

public class register {
	@Test
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
		 DWSRegister ref=new DWSRegister(driver);
		 ref.register.click();
		 ref.female.click();
		 ref.firstname.sendKeys("Darshana");
		 ref.lastName.sendKeys("Birari");
		 ref.email.sendKeys("admin01@gmail.com");
		 ref.password.sendKeys("admin01");
		 ref.cpassword.sendKeys("admin01");
		 ref.regbutton.click();
	}

}
