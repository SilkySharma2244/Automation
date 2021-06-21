import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReaderFile{
	
	public static void main(String[] arg) throws Exception {
	
			File src=new File("./configuration/config.properties");
			FileInputStream fis=new FileInputStream(src);
			Properties pro=new  Properties();
			pro=new Properties();
			pro.load(fis);
			
			
		
	
		
	}
	
	
	
	
	
}
