package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter 
{
 public static void main(String[] args) 
{
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in");
	 driver.manage().window().maximize();
	 WebElement element=driver.findElement(By.xpath("//h2[contains(text(),'Mobiles and accessories')]"));
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
//	 Point y=element.getLocation();
//	 int location=y.getY();
	 
//	 String s="window.scrollTo(0,"+location+")";
//	 js.executeScript(s);
	 
//	 js.executeScript("window.scrollBy(0,location)");
	 
	 //scroll to the given element
	 js.executeScript("arguments[0].scrollIntoView();", element);

	
}
}
