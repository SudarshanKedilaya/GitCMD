package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_cmd {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 //WebElement loginbtn=driver.findElement(By.id("u_0_b"));
	 //loginbtn.click();
	 WebElement email=driver.findElement(By.id("email"));
	 email.sendKeys("8762919904");
	 Thread.sleep(2000);
	 WebElement pass=driver.findElement(By.id("pass"));
	 pass.sendKeys("usha053@93");
	 Thread.sleep(2000);
	 email.clear();
	 Thread.sleep(2000);
	 pass.clear();
	 driver.quit();
}
}
