package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathScript2 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com"); 
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sudhi");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pass')]")).sendKeys("12345");
	 Thread.sleep(2000);
	 driver.quit();
}
}
