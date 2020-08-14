package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorScript {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.findElement(By.tagName("input")).sendKeys("Mobiles");
	 driver.findElement(By.tagName("input")).click();
	 //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
	// driver.findElement(By.name("field-keywords")).sendKeys("Mobiles");
	// driver.findElement(By.className("nav-input")).sendKeys("Mobiles");
	 
	// driver.findElement(By.linkText("actitime")).sendKeys("abcd");
	// driver.findElement(By.partialLinkText("acti")).sendKeys("abcd");
}
}
