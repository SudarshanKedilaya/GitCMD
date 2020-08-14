package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathScript3 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books"); 
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//span[@class='a-truncate-cut'][contains(text(),'Let Me Say it Now')]/../../..//span[@class='a-price-whole'][contains(text(),'616')]"));
		 driver.quit();
	}
}
