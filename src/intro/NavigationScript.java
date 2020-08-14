package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationScript {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.get("https://www.gmail.com");
		driver.navigate().to("https://www.gmail.com");
		driver.get("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	
}
}
