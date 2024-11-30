package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS {

	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
  // open the browser
// maximaze
//enter into dws
	//verify the page using url;
		//do login
		// send some value inside textfield click serch button
		// do logout
		//close 
		String expected_url = "https://demowebshop.tricentis.com/";
		
		//open the browser
	  ChromeDriver driver=new ChromeDriver();
	  //maximaze the browser
	  driver.manage().window().maximize();
	  //enter into the dws
	  driver.get("https://demowebshop.tricentis.com/");
	  Thread.sleep(2000);
	  String actual_url ="https://demowebshop.tricentis.com/";
	  
	  if(actual_url.equals(actual_url))
	  {
		  System.out.println("you enter into the DWS Page");
		  
		  ///click login
		  driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(2000);
		  //fetch data from excell
		  FileInputStream fis=new FileInputStream("D:\\selenium\\ExcellFolder\\Login.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			  Sheet sheet = wb.getSheet("Sheet1");
			  Thread.sleep(2000);
		     driver.findElement(By.linkText("Log in")).click();
		     String email = sheet.getRow(0).getCell(0).toString();
		     driver.findElement(By.id("Email")).sendKeys(email);
			  String password = sheet.getRow(0).getCell(1).toString();
			  driver.findElement(By.id("Password")).sendKeys(password);
			 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		      String serchfielddata = sheet.getRow(0).getCell(2).toString();
			  driver.findElement(By.id("small-searchterms")).sendKeys(serchfielddata);
	  }
	  else {
		  System.out.println("noo sorry");
	  }
		
	}

}
