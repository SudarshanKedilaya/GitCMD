package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathScript {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/Sudarshan/Desktop/Demo2.html"); 
	 Thread.sleep(3000);
	 WebElement un=driver.findElement(By.xpath("html/body/input[1]"));
	 un.sendKeys("sudhi");
	 Thread.sleep(3000);
	 WebElement pass=driver.findElement(By.xpath("html/body/input[2]"));
	 pass.sendKeys("1234");
	 Thread.sleep(3000);
	 driver.quit();
}
}
