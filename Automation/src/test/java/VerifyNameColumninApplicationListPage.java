import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VerifyNameColumninApplicationListPage {

	WebDriver driver;
	Properties pro=new  Properties();
		
	
	public VerifyNameColumninApplicationListPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public static void main(String[] args) {
		

	}
    public void nameColumndata() throws Exception {
    	Thread.sleep(5000);
  	  driver.navigate().to("https://demo.fitsyn.com/applications");
  	driver.manage().window().maximize();
  	Thread.sleep(5000);
    	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
    	Thread.sleep(5000);
    String label=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[1]/div/label")).getText();
   System.out.println(label);
   String name= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[1]/div/strong")).getText();
   System.out.println(name);  
 System.out.println(name);  
 System.out.println(name);  
//   String label1=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[2]/div/label")).getText();
//   System.out.println(label1);
//   String email= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[2]/div/strong")).getText();
//   System.out.println(email);
//   String label2=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[3]/div/label")).getText();
//   System.out.println(label2);
//   String moible= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[3]/div/strong")).getText();
//   System.out.println(moible);
//   String label3=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[4]/div/label")).getText();
//   System.out.println(label3);
//   String DOB= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[4]/div/strong")).getText();
//   System.out.println(DOB);
//   String label4=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[5]/div/label")).getText();
//   System.out.println(label4);
//   String Add= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[5]/div/strong")).getText();
//   System.out.println(Add);
//   String label5=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[6]/div/label")).getText();
//   System.out.println(label5);
//   String zipcode= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[6]/div/strong")).getText();
//   System.out.println(zipcode);
//    
//   String label6=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[7]/div/label")).getText();
//   System.out.println(label6);
//   String city= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[7]/div/strong")).getText();
//   System.out.println(city);
//    	
//    	
//   String label7=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[8]/div/label")).getText();
//   System.out.println(label7);
//   String state= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[8]/div/strong")).getText();
//   System.out.println(state);
//    	
//    	
//    	
//   String label8=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[9]/div/label")).getText();
//   System.out.println(label8);
//   String loan= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[9]/div/strong")).getText();
//   System.out.println(loan);
//   
//   String label9=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[10]/div/label")).getText();
//   System.out.println(label9);
//   String rent= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[10]/div/strong")).getText();
//   System.out.println(rent);
//   
//   String label10=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[11]/div/label")).getText();
//   System.out.println(label10);
//   String creditscore= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[11]/div/strong")).getText();
//   System.out.println(creditscore);
//   
//   String label11=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[12]/div/label")).getText();
//   System.out.println(label11);
//   String jobtype= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[12]/div/strong")).getText();
//   System.out.println(jobtype);
//   
//   
//   String label12=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[13]/div/label")).getText();
//   System.out.println(label12);
//   String EstimatedAnnualIncome= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[13]/div/strong")).getText();
//   System.out.println(EstimatedAnnualIncome);
//   
//   
//   String label13=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[14]/div/label")).getText();
//   System.out.println(label13);
//   String LeadUUID = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[14]/div/strong")).getText();
//   System.out.println(LeadUUID );
//   
//   
//   String label14=	driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[15]/div/label")).getText();
//   System.out.println(label14);
//   String clientID= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/div/div[15]/div/strong")).getText();
//   System.out.println(clientID);
   
   
   
   
    }
}
