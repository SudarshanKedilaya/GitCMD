package intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript 
{
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.quit();
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	FirefoxDriver driver2= new FirefoxDriver();
	driver2.get("https://www.amazon.com");
	Thread.sleep(2000);
	driver2.quit();
	
}
}
