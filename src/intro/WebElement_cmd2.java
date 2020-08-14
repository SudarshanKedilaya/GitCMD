package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_cmd2 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 WebElement mobile=driver.findElement(By.id("u_0_r"));
	 Thread.sleep(3000);
	 Boolean a1=mobile.isDisplayed();
	 System.out.println(a1);
	 Thread.sleep(3000);
	 Boolean a2=mobile.isEnabled();
	 System.out.println(a2);
	 WebElement radiobtn=driver.findElement(By.id("u_0_6"));
	 Thread.sleep(3000);
	 radiobtn.click();
	 boolean a3=radiobtn.isSelected();
	 System.out.println(a3);
	 driver.quit();
}
}
