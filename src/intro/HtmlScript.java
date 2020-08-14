package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlScript {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/Sudarshan/Desktop/Demo1.html"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.findElement(By.tagName("a")).click();
	 driver.findElement(By.id("a1")).click();
	 driver.findElement(By.name("n1")).click();
	 driver.findElement(By.className("c1")).click();
	 driver.findElement(By.linkText("actitime")).click();
	 driver.findElement(By.partialLinkText("acti")).click();
	 
}
}
