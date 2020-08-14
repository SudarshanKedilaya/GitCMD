package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethodScript {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.facebook.com"); //open the given url
		driver.manage().window().maximize(); //Maximize the window
		String titleacual=driver.getTitle(); //get the title of the page
		System.out.println("title of the given page is "+titleacual);
		String currenturl=driver.getCurrentUrl(); //check url
		System.out.println("current url is "+currenturl);
		String pgscr=driver.getPageSource(); //page source
		System.out.println("page source is "+pgscr);
		driver.close();
}
}
