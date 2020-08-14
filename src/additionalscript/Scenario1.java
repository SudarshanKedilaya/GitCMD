package additionalscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("sudarshan.kedilaya93@gmail.com");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("defect@123@sudhi12");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     String title=driver.getTitle();
     System.out.println(title);
     if(title.equals("Google Account"))
     {
    	 System.out.println("home page is displayed");
     }
     else
     {
    	 System.out.println("home page is not displayed");
     }	
}
}
