package listners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListNer1 extends Base implements ITestListener
{
    @Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test strated is taking from listner");	
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
	System.out.println("Test success is taking from listner");	
	}

    @Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
	System.out.println("Test fail is taking from listner");	
	String mtdname=result.getMethod().getMethodName();
	try {
		takeScrnshot(mtdname);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}

