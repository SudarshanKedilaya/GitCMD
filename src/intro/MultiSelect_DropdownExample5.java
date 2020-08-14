package intro;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelect_DropdownExample5 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=GH26Y8G9CB2S");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Run »']")).click();;
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		List<WebElement> option= driver.findElements(By.id("cars"));
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement we:option)
		{
			String text=we.getText();
			l.add(text);
		}
		l.retainAll(option);
		System.out.println(l);
		driver.quit();
}
}
