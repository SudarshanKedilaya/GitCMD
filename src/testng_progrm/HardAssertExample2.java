package testng_progrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample2 {
	@Test
	public void title() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String exp="Google";
		WebElement searchbox=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input"));
		
		//Hard Assert
		Assert.assertEquals(title, exp, "Title is not matching");
		
		Assert.assertTrue(searchbox.isDisplayed()); //TC will pass
		searchbox.sendKeys("Selenium");
		
		driver.close();
}
}
