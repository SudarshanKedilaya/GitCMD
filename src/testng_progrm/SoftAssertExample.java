package testng_progrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
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
		
		//Soft Assert
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(title, exp);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input")).sendKeys("Automation");
		System.out.println("Test Passed");
		driver.close();
		softassert.assertAll();
}
}
