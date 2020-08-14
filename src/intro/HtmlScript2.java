package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlScript2 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/Sudarshan/Desktop/Demo2.html"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 WebElement email=driver.findElement(By.cssSelector("input[type='text']"));
	 email.sendKeys("8762919904");
	 Thread.sleep(2000);
	 WebElement pass=driver.findElement(By.cssSelector("input[type='password']"));
	 pass.sendKeys("usha053@93");
	 Thread.sleep(3000);
	 driver.quit();
}
}
