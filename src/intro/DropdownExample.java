package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
 public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sudarshan/Desktop/Dropdown.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("country"));
		Select s1=new Select(element);
		//s1.selectByIndex(17);
		s1.selectByValue("India");
		//s1.selectByVisibleText("Egypt");
		driver.quit();
		
}
}
