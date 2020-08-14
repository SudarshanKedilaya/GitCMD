package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathScript5 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books"); 
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@id='a-autoid-5']//i[@class='a-icon a-icon-next']")).click();
	 Thread.sleep(3000);
	 WebElement price=driver.findElement(By.xpath("//span[contains(text(),'Amish's Ramachandra Series')]/../../..//span[@class='a-price-whole']"));
	 System.out.println(price.getText());
	 Thread.sleep(3000);
	 driver.quit();
}
}
