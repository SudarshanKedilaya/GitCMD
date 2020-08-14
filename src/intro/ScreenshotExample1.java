package intro;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample1 {
 public static void main(String[] args) throws IOException {
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile=new File("../Project A/Screenshot/sudhi.png");
		FileUtils.copyFile(scrfile, destfile);
		
}
}
