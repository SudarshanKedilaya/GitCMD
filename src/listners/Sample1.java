package listners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListNer1.class)
public class Sample1 extends Base
{
	@BeforeMethod
	public void setup()
	{
		chromedriver1();
		launchURL1();
	}
	@Test
	public void getTitle()
	{
		String title=driver.getTitle();
		String exp="Google";
		WebElement searchbox=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		
		//Hard Assert
		Assert.assertEquals(title, exp, "Title is not matching");
		
		Assert.assertTrue(searchbox.isDisplayed()); //TC will pass
		searchbox.sendKeys("Selenium");
		
		driver.close();
}
	@Test
	public void isDisplayed()
	{
		driver.get("https://www.amazon.in");	
		Assert.assertTrue(false);
	}
}
