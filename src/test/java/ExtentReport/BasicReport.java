package ExtentReport;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicReport {
	
	@Test
	public void report()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		 
		File path=new File(".\\src\\main\\resources\\SampleE4.html");
		
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
	//configure path
		spark.config().setDocumentTitle("CRM Vtiger");
		spark.config().setReportName("Darshana");
		spark.config().setTheme(Theme.DARK);
		
	//Create Extent Report
		ExtentReports report=new ExtentReports();
		
		//CONFIG
		report.setSystemInfo("Os", "windows-11");
		report.setSystemInfo("Browser", "chrome-101");
		
		//attached spark to the extent report
		report.attachReporter(spark);
		
		
		//create extent test
		ExtentTest test=report.createTest("main");
		driver.close();
		report.flush();
		
		
		
		
		
		
	}

}
