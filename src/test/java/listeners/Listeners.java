package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import frameworkWeekdays.BuildUp;

public class Listeners extends BuildUp implements ITestListener 
{

	public void onTestStart(ITestResult result) 
	{
	
	}

	public void onTestSuccess(ITestResult result) 
	{
		
	}

	public void onTestFailure(ITestResult result)
	{
		WebDriver driver = null;
		String methodName=result.getMethod().getMethodName();
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e1) {
			
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			
			e1.printStackTrace();
		} catch (SecurityException e1) {
			
			e1.printStackTrace();
		}
		//System.out.println("Method failed"+methodName);
		try {
			   testScreenshot(driver);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context) 
	{
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
