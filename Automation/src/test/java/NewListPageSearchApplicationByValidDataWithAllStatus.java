import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewListPageSearchApplicationByValidDataWithAllStatus {

	
	WebDriver driver;
	Properties pro=new  Properties();
	
	
	
	public NewListPageSearchApplicationByValidDataWithAllStatus(WebDriver driver) {
		this.driver=driver;
	}
	public static void main(String[] args) {



	}
 public void searchValidata() throws Exception {
	 
	 Thread.sleep(5000);
		
		driver.navigate().to("https://demo.fitsyn.com/applications/new");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//All Status
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");

		       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();//11june
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
		   	
		   	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();		   	
			Thread.sleep(5000);
	 
	 
 }
}
