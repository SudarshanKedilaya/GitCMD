package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.gsmarena.com/"); 
	 driver.manage().window().maximize();
	 
	 //implicit wait
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//h3[contains(text(),'Samsung Galaxy M31s will go official on July 30')]")).click();;
	 
	 //explicit wait
	 WebDriverWait wait=new WebDriverWait(driver, 10);
	 
}
}
