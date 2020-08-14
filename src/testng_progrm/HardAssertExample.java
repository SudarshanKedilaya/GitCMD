package testng_progrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
	@Test
	public void title() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String exp="Google Home";
		
		//Hard Assert
		Assert.assertEquals(title, exp);
		
		Assert.assertTrue(true); //TC will pass
		Assert.assertTrue(false); //TC will fail
		Assert.assertFalse(false); //TC will pass
		Assert.assertFalse(true); //TC will fail
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input")).sendKeys("Automation");
		System.out.println("Test Passed");
		driver.close();
}
}
