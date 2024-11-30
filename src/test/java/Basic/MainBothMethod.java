package Basic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainBothMethod {
	@Test
	public void main()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
	   

	}

}
