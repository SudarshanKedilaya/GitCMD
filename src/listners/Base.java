package listners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
public static WebDriver driver;

public static void chromedriver1()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	driver=new ChromeDriver();
}

public static void launchURL1()
{
	driver.get("https://www.Google.com");
    driver.manage().window().maximize();
}

public static void takeScrnshot(String mtdname) throws IOException
{
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destfile=new File("G:\\Bank\\Project A\\Screenshot\\"+mtdname+".png");
	FileUtils.copyFile(srcfile, destfile);
}
}
