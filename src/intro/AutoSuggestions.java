package intro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	 //implicit wait
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	 Thread.sleep(2000);
	 int a=suggestions.size();
	 System.out.println(a);
	 for(int i=0;i<a; i++)
	 {
		 String text= suggestions.get(i).getText();
		 System.out.println(text);
	 }
	 Thread.sleep(5000);
	 driver.quit();
}
}
