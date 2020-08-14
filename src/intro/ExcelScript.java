package intro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelScript {
 public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 FileInputStream fis =new FileInputStream("C:\\Users\\Sudarshan\\Desktop\\ExcelScript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sht=wb.getSheetAt(0);
			Row r=sht.getRow(2);
			System.out.println(r.getFirstCellNum());
			System.out.println(r.getLastCellNum());
			
			Cell c=r.getCell(1);
			String a= c.toString();
			System.out.println(a);
			c.setCellValue("qwerty");
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Sudarshan\\Desktop\\ExcelScript.xlsx");
			wb.write(fout);
			
	
}
}
