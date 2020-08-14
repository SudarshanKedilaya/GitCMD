package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenario1 
{
	@Test
	public void addOrganization() throws InterruptedException
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
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(5000);
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.name("accountname")).sendKeys("qwerty_1234");
		driver.findElement(By.name("website")).sendKeys("qwerty");
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]/a")).click();
		driver.findElement(By.name("search_text")).sendKeys("qwerty_1234");
		WebElement element=driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div[1]/form/table/tbody/tr[1]/td[5]/div/select"));
		Select s1=new Select(element);
		s1.selectByIndex(1);
		driver.findElement(By.name("submit")).click();
	}
}
