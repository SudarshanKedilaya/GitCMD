package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownExample {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elem_select");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement element=driver.findElement(By.id("cars"));
		Select s1=new Select(element);
		s1.selectByIndex(3);
		//s1.selectByValue("saab");
		//s1.selectByVisibleText("fiat");
		
}
}
