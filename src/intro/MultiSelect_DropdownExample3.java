package intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_DropdownExample3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	WebElement ele= driver.findElement(By.id("cars"));
	Select s=new Select(ele);
	List<WebElement> option= s.getOptions();
	ArrayList<String> l=new ArrayList<>();
	for(WebElement we:option)
	{
		String text=we.getText();
		l.add(text);
	}
	Collections.sort(l);
	for(String t:l)
	{
		System.out.println(t);
	}

}
}
