import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchValidDataOnDifferentDate {

	WebDriver driver;
	Properties pro=new  Properties();
	
	
	
	public SearchValidDataOnDifferentDate(WebDriver driver) {
		this.driver=driver;
	}
	
	 
	
	
	
	public static void main(String[] args) {



	}
   public void searchDataDifferentDate() throws Exception {
	   
	   Thread.sleep(5000);
		
		driver.navigate().to("https://demo.fitsyn.com/applications");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//offer avaible
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("John Shoy");
		
		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
		Thread.sleep(5000);
		       slt.selectByVisibleText("My Company");
		
		       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();//14june
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
		       
		       Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
		   	Thread.sleep(5000);
		   	slt1.selectByVisibleText("Offers Available");
		   	
		   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
		   	
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/a")).click();
			  Thread.sleep(5000);
		// //not submmited  	  
			     driver.navigate().refresh();
			 
			    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
				
				Select slt2=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
				       slt2.selectByVisibleText("My Company");
				
				       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
				       
				       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
				       
				       Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
				   	Thread.sleep(5000);
				   	slt3.selectByValue("not_submitted");
				   	
				   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
				   	Thread.sleep(5000);
			//rejected
				    driver.navigate().refresh();
				    
				    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
				   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
					
					Select slt5=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
					       slt5.selectByVisibleText("My Company");
					
					       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
					       
					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
					       
					       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
					       
					       Select slt4=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
					   	Thread.sleep(5000);
					   	slt4.selectByValue("rejected");
						driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
						Thread.sleep(5000);
				//no offers	   	
				   	
				   	
					   	driver.navigate().refresh();
					    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
					   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
						
						Select slt6=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
						       slt6.selectByVisibleText("My Company");
						
						       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
						       
						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
						       
						       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
						       
						       Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
						   	Thread.sleep(5000);
						   	slt7.selectByValue("no_offers");
							driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
							Thread.sleep(5000);
						   	
				//   	looking for an offer
				   	
							driver.navigate().refresh();
							  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
						   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
							
							Select slt9=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
							       slt9.selectByVisibleText("My Company");
							
							       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
							       
							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
							       
							       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
							       
							       Select slt8=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
							   	Thread.sleep(5000);
							   	slt8.selectByValue("looking_for_loan_offer");
								driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
								Thread.sleep(5000);
				   	
				   //funded
								driver.navigate().refresh();
								
								  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
							   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
								
								Select slt10=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
								       slt10.selectByVisibleText("My Company");
								
								       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
								       
								       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
								       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
								       
								       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
								       
								       Select slt11=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
								   	Thread.sleep(5000);
								   	slt11.selectByValue("funded"); 	
									driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
									Thread.sleep(5000);
								 //  	pending_funding
							   	
								   	driver.navigate().refresh();
								   	
								    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
								   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
									
									Select slt12=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
									       slt12.selectByVisibleText("My Company");
									
									       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
									       
									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
									       
									       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
									       
									       Select slt13=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
									   	Thread.sleep(5000);
									   	slt13.selectByValue("pending_funding"); 
										driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
										Thread.sleep(5000);
			  //application sent to applicant
										driver.navigate().refresh();
									   	
										  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
									   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
										
										Select slt14=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
										       slt14.selectByVisibleText("My Company");
										
										       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
										       
										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[2]")).click();
										       
										       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
										       
										       Select slt15=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
										   	Thread.sleep(5000);
										   	slt15.selectByValue("application_sent_to_applicant"); 
											driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/button")).click();
											Thread.sleep(5000);
	  
	   
	   
	   
	   
	   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
}
