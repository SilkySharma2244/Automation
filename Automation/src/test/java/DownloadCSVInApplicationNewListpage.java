import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadCSVInApplicationNewListpage {

	WebDriver driver;
	Properties pro=new  Properties();
		
	
	public DownloadCSVInApplicationNewListpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	public static void main(String[] args) {
		

	}
	public void downloadCSV() throws Exception {
	Thread.sleep(7000);
    driver.navigate().to("https://demo.fitsyn.com/applications/new");
    driver.manage().window().maximize();
    Thread.sleep(5000);
//    String filepath="C:\\Users\\Hema Sahoo\\Downloads\\CSVData";
//    HashMap<String,Object> chromepref=new HashMap<String,Object>();
//    chromepref.put("profile.default_content_setting.popups",0);
//    chromepref.put("download.default_directory",filepath);
//    ChromeOptions options=new ChromeOptions();
//    options.setExperimentalOption("prefs",chromepref);
    driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[3]/div/div/button")).click();
    
    
    
	
	
	
	
	
	
	
}
}