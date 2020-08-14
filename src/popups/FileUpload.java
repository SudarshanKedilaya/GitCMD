package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload 
{
	@Test
	public void popup() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.switchTo().frame("iframeResult");
//		Thread.sleep(3000);
//		driver.findElement(By.id("myFile")).click();
//		Thread.sleep(3000);
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/a/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Sudarshan\\Desktop\\FileUpload1.exe");
}
}