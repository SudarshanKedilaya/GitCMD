package testng_progrm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example2 
{
public WebDriver driver;
	
	@Test(priority=30)
	public void logout()
	{
		System.out.println("logout successful");
	}
	
	@Test(enabled=false)
	public void postpic()
	{
		System.out.println("post a pic");
	}
	
	@Test(priority=20)
	public void sharePic()
	{
		System.out.println("share a pic");
	}
	
	@Test(priority=10)
	public void login()
	{
		System.out.println("login successful");
	}
	
	@BeforeClass
	public void browserSetup()
	{
		System.out.println("broser launched");
	}
	
	@AfterClass
	public void closebrowser()
	{
		System.out.println("broser closed");
	}
}

