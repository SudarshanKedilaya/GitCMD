package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopup 
{
@Test
public void popup() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/table/tbody/tr/td[2]/form/input")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
}
}
