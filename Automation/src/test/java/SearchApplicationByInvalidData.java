import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchApplicationByInvalidData {

	

	WebDriver driver;
	Properties pro=new  Properties();
	
	
	
	public SearchApplicationByInvalidData(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public static void main(String[] args) {



	}
	
	public void invalidDatasearchAllFilters() throws Exception {
	

		Thread.sleep(5000);
		
		driver.navigate().to("https://demo.fitsyn.com/applications");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//All Status
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("Sammer");

		       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[2]/td[6]")).click();//11june
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[2]/td[6]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
		   	
		   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
		   	
			Thread.sleep(5000);
			  
	
	
	
	
	
	

}
}