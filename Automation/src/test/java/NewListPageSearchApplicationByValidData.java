import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewListPageSearchApplicationByValidData {

	
	
	WebDriver driver;
	Properties pro=new  Properties();
	
	
	
	public NewListPageSearchApplicationByValidData(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	public static void main(String[] args) {



	}
   public void searchVailddataDifferentFilters() throws Exception {
	   Thread.sleep(5000);
		
		driver.navigate().to("https://demo.fitsyn.com/applications/new");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//offer avaible
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
		
		Select slt=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
		Thread.sleep(5000);
		       slt.selectByValue("5db2cadd07492e00180353d3");
		
		       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();//11june
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
		       
		       Select slt1=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
		   	Thread.sleep(5000);
		   	slt1.selectByVisibleText("Offers Available");
		   	
		   	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
		   	
			Thread.sleep(5000);
			  driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[2]/div/div/a")).click();
			  Thread.sleep(5000);
		// //not submmited  	  
			     driver.navigate().refresh();
			 
			    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
				
				Select slt2=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
				Thread.sleep(9000);
				slt2.selectByVisibleText("My Company");
				
				       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
				       
				       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
				       
				       Select slt3=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
				   	Thread.sleep(5000);
				   	slt3.selectByValue("not_submitted");
				   	
				   	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
				   	Thread.sleep(5000);
			//rejected
				    driver.navigate().refresh();
				    
				    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
				   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
					
					Select slt5=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
					Thread.sleep(9000);
					slt5.selectByVisibleText("My Company");
					
					       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
					       
					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
					       
					       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
					       
					       Select slt4=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
					   	Thread.sleep(5000);
					   	slt4.selectByValue("rejected");
						driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
						Thread.sleep(5000);
				//no offers	   	
				   	
				   	
					   	driver.navigate().refresh();
					    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
					   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
						///html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select
						Select slt6=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
						Thread.sleep(10000);
						slt6.selectByVisibleText("My Company");
						
						       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
						       
						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
						       
						       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
						       
						       Select slt7=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
						   	Thread.sleep(5000);
						   	slt7.selectByValue("no_offers");
							driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
							Thread.sleep(5000);
						   	
				//   	looking for an offer
				   	
							driver.navigate().refresh();
							  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
						   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
							
							Select slt9=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
							Thread.sleep(10000);
							slt9.selectByVisibleText("My Company");
							
							       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
							       
							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
							       
							       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
							       
							       Select slt8=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
							   	Thread.sleep(5000);
							   	slt8.selectByValue("looking_for_loan_offer");
								driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
								Thread.sleep(5000);
			   	
				   //funded
								driver.navigate().refresh();
								
								  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
							   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
								
								Select slt10=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
								Thread.sleep(10000);
								slt10.selectByVisibleText("My Company");
								
								       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
								       
								       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
								       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
								       
								       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
								       
								       Select slt11=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
								   	Thread.sleep(5000);
								   	slt11.selectByValue("funded"); 	
									driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
									Thread.sleep(5000);
								 //  	pending_funding
						   	
								   	driver.navigate().refresh();
								   	
								    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
								   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
									
									Select slt12=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
									Thread.sleep(5000);
									slt12.selectByVisibleText("My Company");
									
									       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
									       
									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
									       
									       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
									       
									       Select slt13=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
									   	Thread.sleep(5000);
									   	slt13.selectByValue("pending_funding"); 
										driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
										Thread.sleep(5000);
//			  //application sent to applicant
										driver.navigate().refresh();
									   	
										  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
									   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
										
										Select slt14=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
										Thread.sleep(5000); 
										slt14.selectByVisibleText("My Company");
										
										       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
										       
										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
										       
										       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
										       
										       Select slt15=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
										   	Thread.sleep(5000);
										   	slt15.selectByValue("application_sent_to_applicant"); 
											driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
											Thread.sleep(5000);
//	   
	   
	   
   }
}
