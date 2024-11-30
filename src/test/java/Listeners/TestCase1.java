package Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.Listeners.DWSListeners.class)
public class TestCase1 {
	
	@Test
	public void main()
	{
		String expected_url = "Java";
		String actual_url = "Bava";
		assertEquals(expected_url, actual_url);//Both are different
		
	}
	@Test
	public void main1()
	{
		String expected_url = "Java";
		String actual_url = "Java";
		assertEquals(expected_url, actual_url);
		
		
	}
	
	//Total tests run: 2, Passes: 1, Failures: 1, Skips: 0
}
