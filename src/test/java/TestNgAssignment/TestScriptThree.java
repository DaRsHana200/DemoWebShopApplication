package TestNgAssignment;

import org.testng.annotations.Test;

import com.crm.BaseClass.TSBaseClass;

public class TestScriptThree extends TSBaseClass {
	String expected_url = "https://demowebshop.tricentis.com/";
//	Create base class(cross browser testing , precondition ,postcondition ,login 
//			and logout) 
//			Task-3 
//			• Open the browser 
//			• Maximize  
//			• Enter into dws page 
//			• Verify the page by using url 
//			• login 
//			• open digital download in different window  
//			• Add all the product by using findElements 
//			• Remove the product which is having highest price (dynamic way) 
//			• Logout 
//			• Close the dws home page
	
	@Test
	public void testScriptThree() throws InterruptedException
	{
		precondition("chrome");
	    
		// Verify the page by using URL
        String actual_url = driver.getCurrentUrl();
        if (expected_url.equals(actual_url)) {
            System.out.println("I am on the DWS page");
            }

}}
