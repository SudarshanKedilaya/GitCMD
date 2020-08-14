package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("C:\\Users\\Sudarshan\\Desktop\\Checkbox1.html"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 
	 List<WebElement> links=driver.findElements(By.xpath("//a"));
	 int totallinks=links.size();
	 System.out.println(totallinks);
	 for(int i=0;i<links.size(); i++)
	 {
		 System.out.println(links.get(i).getText());
	 }
	 
	 List<WebElement> chboxs=driver.findElements(By.xpath("//input"));
	 int chboxscount=chboxs.size();
	 System.out.println(chboxscount);
	 for(int i=0;i<chboxscount; i++)
	 {
		 chboxs.get(i).click();
	 }
	 }
}
