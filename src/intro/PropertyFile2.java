package intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile2 {
 public static void main(String[] args) throws IOException, InterruptedException {
	 FileInputStream fis= new FileInputStream("C:\\Users\\Sudarshan\\Desktop\\PropertyFileScript.properties.txt");
		Properties pobj=new Properties();
		pobj.load(fis);
		String un=pobj.getProperty("username");
		String pass=pobj.getProperty("password");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com"); 
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("pas")).sendKeys(pass);
		driver.quit();
		 
}
}
