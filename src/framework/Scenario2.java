package framework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenario2 
{
	@Test
	public void ContactstoOrganization() throws InterruptedException
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
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.name("salutationtype"));
		Select s1=new Select(element);
		s1.selectByIndex(1);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Snow");
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/img")).click();
		Thread.sleep(5000);
		Set<String> allwin=driver.getWindowHandles();
		Iterator<String> it=allwin.iterator();
		String parentwion=it.next();
		String childwin=it.next();
		driver.switchTo().window(childwin);
		System.out.println("child win="+driver.getTitle());
		driver.findElement(By.id("search_txt")).sendKeys("qwerty_1234");
		driver.findElement(By.name("search")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='qwerty_1234']")).click();
		driver.switchTo().window(parentwion);
		driver.findElement(By.className("crmButton small save")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[8]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("search_text")).sendKeys("qwerty_1234");
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div[1]/form/table/tbody/tr[1]/td[5]/div/select"));
		s1.selectByIndex(4);
		driver.findElement(By.name("submit")).click();
	}
}
