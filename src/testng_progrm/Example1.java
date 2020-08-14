package testng_progrm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Example1 {
 
	public WebDriver driver;
	
	@Test(dependsOnMethods = "sharePic")
	public void logout()
	{
		System.out.println("logout successful");
	}
	
	@Test(dependsOnMethods = "login")
	public void sharePic()
	{
		System.out.println("share a pic");
	}
	
	@Test
	public void login()
	{
		System.out.println("login successful");
	}
}

