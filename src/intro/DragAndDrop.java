package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement src= driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[6]"));
		WebElement target= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[7]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).build().perform();
		act.clickAndHold(src).moveToElement(target).release().build().perform();
		act.contextClick();
}
}
