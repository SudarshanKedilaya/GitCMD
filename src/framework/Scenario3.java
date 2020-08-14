package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario3 
{
	@Test
	public void AddProductToCampaign() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[text()='Products']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.name("productname")).sendKeys("M30s");
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/form/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
	    Thread.sleep(5000);
    	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[22]/a")).click();
		driver.findElement(By.name("Campaigns")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("campaignname")).sendKeys("Test");
	}
}
