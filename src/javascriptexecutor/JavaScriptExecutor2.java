package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 {
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[5]/div/div[3]/a"));
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 //Scroll to the given element
		 js.executeScript("arguments[0].scrollIntoView();", element);

		 //click on the element
		 js.executeScript("arguments[0].click();", element);

	
}
}
