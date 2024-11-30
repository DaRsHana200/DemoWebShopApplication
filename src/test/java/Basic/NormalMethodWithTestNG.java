package Basic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NormalMethodWithTestNG {
	@Test
	public void main()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		main1();
		driver.close();
		
	}
	//can we execute normal method -- yes
	
	public void main1()
	{
		System.out.println("hello selenium");
	}

}
