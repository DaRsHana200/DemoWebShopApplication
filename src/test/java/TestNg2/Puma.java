package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puma {
	@Test
  public void puma()
  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://in.puma.com/in/en/womens?utm_source=GGL-SEA&utm_medium=BS&utm_aud=OTH&utm_obj=OLC&utm_campaign=BS_GGL_IN_BS_GGL_SEA_TXT_Brand-Exact_agency_1000067495857508873&gad_source=1&gclid=CjwKCAiA3Na5BhAZEiwAzrfagPFDOpX6xDuIxt44i5l8ofH6ma-ZKJKXwgI0Pb1SvBoOXqLVwknj3hoCsIYQAvD_BwE");
}}
