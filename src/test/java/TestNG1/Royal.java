package TestNG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Royal {
	@Test
	public void royalEnfield()
    {
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	driver.get("https://www.royalenfield.com/in/en/motorcycles/");
    }

}