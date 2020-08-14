package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[1]")).click();
		String title=driver.getTitle();
		WebElement mobileAcc=driver.findElement(By.xpath("html/body/div[2]/header/div/div[4]/a[2]/span[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(mobileAcc).build().perform();
		action.contextClick(mobileAcc).build().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		WebElement screen=driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[4]/div[8]/div[2]/div/div[1]/ul/li[2]/a"));
		wait.until(ExpectedConditions.titleIs(title));
		wait.until(ExpectedConditions.elementToBeClickable(screen));
		screen.click();
		
		
}
}
