package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DWSExtentReprt implements ITestListener {
   public static ExtentSparkReporter spark;
   public static  ExtentReports report;
   public static ExtentTest test;
   
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test=report.createTest(name);
		
	     
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String name = result.getMethod().getMethodName();
		test.log(Status.INFO, "OnTestSuccesss");
		test.log(Status.PASS,name+"is pass");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.INFO, "OnTestFailure");
		test.log(Status.FAIL,name+"is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	       String name = result.getMethod().getMethodName();
	        test.log(Status.INFO, "OnTestSkipped");
	        test.log(Status.FAIL,name+"is skip");
	        
		
	}

	@Override
	public void onStart(ITestContext context) {
		//create Extent SparkRepoter
		spark=new ExtentSparkReporter(".\\src/main/resources\\TestCase1.html");
		spark.config().setDocumentTitle("Honda, kawasaki");
		spark.config().setReportName("Darshna");
		spark.config().setTheme(Theme.DARK);
		//create a report
		report=new ExtentReports();
		report.setSystemInfo("Os", "Windows-11");
		report.setSystemInfo("Browser", "linux");
		//attached
		report.attachReporter(spark);
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}
