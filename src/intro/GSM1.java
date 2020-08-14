package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSM1 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.gsmarena.com/"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 
	 List<WebElement> allphones=driver.findElements(By.xpath("//div[@class='brandmenu-v2 light l-box clearfix']/ul/li"));
	 int count=allphones.size();
	 System.out.println(count);
	 for(int i=0;i<count; i++)
	 {
		 String text= allphones.get(i).getText();
		 System.out.println(text);
	 }
	 Thread.sleep(5000);
	 driver.quit();
	}
}
