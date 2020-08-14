package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorScript2 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 WebElement email=driver.findElement(By.id("email"));
	 email.sendKeys("8762919904");
	 Thread.sleep(2000);
	 WebElement pass=driver.findElement(By.id("pas"));
	 pass.sendKeys("usha053@93");
}
}
