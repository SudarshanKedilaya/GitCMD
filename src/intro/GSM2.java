package intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSM2 {
 public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	 FileInputStream fis=new FileInputStream("C:\\Users\\Sudarshan\\Desktop\\ExcelScript.xlsx");
	 Workbook wb=WorkbookFactory.create(fis);
	 Sheet sht=wb.getSheetAt(1);
	
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.gsmarena.com/"); 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 
	 List<WebElement> allphones=driver.findElements(By.xpath("//div[@class='brandmenu-v2 light l-box clearfix']/ul/li"));
	 int count=allphones.size();
	 System.out.println(count);
	 for(int i=0;i<count; i++)
	 {
		 String text= allphones.get(i).getText();
		 Row r=sht.createRow(i);
		 Cell c=r.createCell(1);
		 c.setCellValue(text);
		 System.out.println(text);
	 }
	 FileOutputStream fout=new FileOutputStream("C:\\Users\\Sudarshan\\Desktop\\ExcelScript.xlsx");
	 wb.write(fout);
	 wb.close();
	 Thread.sleep(5000);
	 driver.quit();
	}
     
}

