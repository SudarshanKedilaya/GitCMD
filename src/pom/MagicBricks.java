package pom;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MagicBricks 
{
	@Test
	public void title() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.magicbricks.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Home page="+driver.getTitle());
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div[3]/div[2]/ul/li/div[1]/div")));
		action.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
		Thread.sleep(3000);
		Set<String> allwin=driver.getWindowHandles();
		Iterator<String> it=allwin.iterator();
		String parentwion=it.next();
		String childwin=it.next();
		driver.switchTo().window(childwin);
		System.out.println("child win="+driver.getTitle());
		POM_UserLogin p1=new POM_UserLogin(driver);
		
}
}
