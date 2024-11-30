package Basic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoOfMainMethods {
	//execution based on alphabetical order
	@Test
	public void rcb()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.iplt20.com/teams/royal-challengers-bangalore");
		System.out.println("rcb");
	  driver.close();
	}
	@Test
	public void csk()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		System.out.println("csk");
		driver.close();
	}
	@Test
	public void dc() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.delhicapitals.in/");
		System.out.println("dc");
		
	
		driver.close();
		
	}
	
}
