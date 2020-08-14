package intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile1 {
 public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("C:\\Users\\Sudarshan\\Desktop\\PropertyFileScript.properties.txt");
	Properties pobj=new Properties();
	pobj.load(fis);
	String key=pobj.getProperty("username");
	System.out.println(key);
	String value=pobj.getProperty("password");
	System.out.println(value);
}
}
