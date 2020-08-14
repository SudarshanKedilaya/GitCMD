package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathScript4 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books"); 
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 WebElement price=driver.findElement(By.xpath("//span[contains(text(),'Concept of Physics')][1]/../../..//span[@class='a-price-whole']"));
	 System.out.println(price.getText());
	 driver.quit();
}
}
