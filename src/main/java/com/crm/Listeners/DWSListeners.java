package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DWSListeners  implements ITestListener{
  //It is having abstract methods.
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();//Which hold test cases names
		// TODO Auto-generated method stub
		Reporter.log("onTestStart",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		// TODO Auto-generated method stub
		Reporter.log("onTestSuccess",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		// TODO Auto-generated method stub
		Reporter.log("onTestFailure",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestSkipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String name = result.getMethod().getMethodName();
		// TODO Auto-generated method stub
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String name = result.getMethod().getMethodName();
		// TODO Auto-generated method stub
		Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		Reporter.log("onStart",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("onFinish",true);
	}

}
