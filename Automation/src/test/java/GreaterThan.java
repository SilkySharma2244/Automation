import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GreaterThan {
	WebDriver driver;
	Properties pro=new  Properties();
	
	public GreaterThan(WebDriver driver) {
		this.driver=driver;
	}

	public static void main(String[] args) {
	
		
	}

		public void systemSetting() throws Exception {
			
			Thread.sleep(7000);
//			
//			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/a")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/ul/li[1]//a[@href='/vendors']")).click();	
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
//		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
	//
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
//		Thread.sleep(7000);
	//	
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
	//
//		Thread.sleep(3000);
	//	
//		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
//		select.selectByVisibleText("Rail One");
//		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
		
		//Thread.sleep(3000);
			driver.navigate().to("https://demo.fitsyn.com/settings/");
			
			JavascriptExecutor js8 = (JavascriptExecutor) driver;
			   js8.executeScript("window.scrollBy(0,1500)");
//			Actions actions = new Actions(driver);
//			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"offer_wall_filter_condition\"]")),315,2466).click().build().perform();
//			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"offer_wall_filter_condition\"]")),315,2466).click().build().perform();
//			   WebElement element = driver.findElement(By.xpath("//*[@id=\"offer_wall_filter_condition\"]"));
//		        Point point = element.getLocation();
//		        System.out.println("Element's Position from left side is: "+point.getX()+" pixels.");
//		        System.out.println("Element's Position from top is: "+point.getY()+" pixels.");
//		 
			
			Select sltt=new Select(driver.findElement(By.xpath("//*[@id=\"offer_wall_filter_condition\"]")));
			sltt.selectByVisibleText(" > (Greater Than)");
			driver.findElement(By.xpath("//*[@id=\"offer_wall_filter_value\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"offer_wall_filter_value\"]")).sendKeys("100000");
			driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
			driver.navigate().to("https://demo.fitsyn.com/dashboard");
//			
		}
		
		public  void createApplication() throws Exception {
			
//			Thread.sleep(7000);
////			
//			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/a")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/ul/li[1]//a[@href='/vendors']")).click();	
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
//		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
	//
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
//		Thread.sleep(7000);
	//	
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
	//
//		Thread.sleep(3000);
	//	
//		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
//		select.selectByVisibleText("Rail One");
//		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
	////	
	//	driver.navigate().to("https://demo.fitsyn.com/dashboard");
	//	
		driver.manage().window().maximize();
		
		Thread.sleep(7000);	   
		  WebElement l=driver.findElement(By.partialLinkText("Initiate Applicati"));
		  l.click();
//		  String title=driver.getTitle();
//		  String exptitle="/applications/initiate";
//		   Assert.assertEquals(title,exptitle);

	      JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,1200)");
		   Thread.sleep(5000);
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
		   

			String text=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/label[2]")).getText();
			System.out.println(text);
			String exp="Please enter First Name";
			Assert.assertEquals(text,exp);
			
		   try {
				  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).click();
			     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys("John");
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
		   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/label[2]")).getText();
			System.out.println(text1);
			String exp1="Please enter Last Name";
			Assert.assertEquals(text1,exp1);
		   
		   try {
			   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).click();
			   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).sendKeys("shoy");
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
		   String text2=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
			System.out.println(text2);
			String exp2="Please enter Birth date";
			Assert.assertEquals(text2,exp2);
		   try {
				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
				  String text21=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
					System.out.println(text21);
					String exp21="You must be at least 18 years old!";
					Assert.assertEquals(text21,exp21);
					Thread.sleep(1000);
					 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
		   String text3=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[4]/div/label[2]")).getText();
			System.out.println(text3);
			String exp3="Please enter Social Security Number";
			Assert.assertEquals(text3,exp3);
		   try {
				  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).click();
				  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("678-98-9898");
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
			 Thread.sleep(1000);
				String text4=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
				System.out.println(text4);
				String exp4="Please enter Estimated Annual Income";
				Assert.assertEquals(text4,exp4);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("assssddddf");
				
				String text41=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
				System.out.println(text41);
				String exp41="Please enter only numbers";
				Assert.assertEquals(text41,exp41);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).clear();
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("900000");
			
			JavascriptExecutor js4 = (JavascriptExecutor) driver;	
			   js4.executeScript("window.scrollBy(0,20)");
			   
			   String text10=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
				System.out.println(text10);
				String exp10="Please enter Mobile Number";
				Assert.assertEquals(text10,exp10);
				
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("aasdsddd");
				
				   String text101=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
					System.out.println(text101);
					String exp101="Please enter only numbers";
					Assert.assertEquals(text101,exp101);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).clear();
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("8569854589");
			
			 Thread.sleep(1000);
			String text11=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/label[2]")).getText();
			System.out.println(text11);
			String exp11="Please enter Email";
			Assert.assertEquals(text11,exp11);
			Thread.sleep(1000);
			try {
		//	driver.findElement(By.cssSelector("body.slack-chat-page.config--vertical.config--borderLess.menu-left--colorful.menu-left--shadow.theme--light.menu-left--visible:nth-child(2) div.utils__content:nth-child(7) div.cui-layout.cui-layout-has-sider:nth-child(1) div.cui-layout div.cui-layout-content div.cui-utils-content section.card:nth-child(4) div.card-body form:nth-child(2) div.row:nth-child(7) div.col-xl-6.col-md-6.col-sm-12:nth-child(2) div.form-group.state-success > input.form-control")).click();
		driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).sendKeys("mock+265@evenfinancial.com");}
			catch(Exception e) {
				 e.printStackTrace();
			 }
			   
			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			   js5.executeScript("window.scrollBy(0,50)");
			   
			   String text12=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/label[2]")).getText();
				System.out.println(text12);
				String exp12="Please enter Address";
				Assert.assertEquals(text12,exp12);
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/input")).sendKeys("Washington Dc");
			
			String text13=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/label[2]")).getText();
			System.out.println(text13);
			String exp13="Please enter City";
			Assert.assertEquals(text13,exp13);
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/input")).sendKeys("Indore");
			

			String text14=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/label[2]")).getText();
			System.out.println(text14);
			String exp14="Please select State";
			Assert.assertEquals(text14,exp14);
			Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/select")));
			slt2.selectByIndex(2);
			Thread.sleep(2000);
			
			String text15=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/label[2]")).getText();
			System.out.println(text15);
			String exp15="Please enter Zipcode";
			Assert.assertEquals(text15,exp15);
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/input")).sendKeys("12345");
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			   js6.executeScript("window.scrollBy(0,50)");
			
			String text16=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/label[2]")).getText();
			System.out.println(text16);
			String exp16="Please select Loan Purpose";
			Assert.assertEquals(text16,exp16);
			Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/select")));
			slt3.selectByIndex(2);
			String text17=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
			System.out.println(text17);
			String exp17="Please enter Amount Financed";
			Assert.assertEquals(text17,exp17);
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/input")).sendKeys("!@!@@##");
			String text171=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
			System.out.println(text171);
			String exp171="Please enter only numbers";
			Assert.assertEquals(text171,exp171);
			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("100000");
			   String text5=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/label[2]")).getText();
				System.out.println(text5);
				String exp5="Please select Job Type";
				Assert.assertEquals(text5,exp5);
				
			try {
			Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/select")));
			slt.selectByIndex(2);}catch(Exception e) {
				 e.printStackTrace();
			 }
			String text6=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/label[2]")).getText();
			System.out.println(text6);
			String exp6="Please select Employment Pay Frequency";
			Assert.assertEquals(text6,exp6);
			
			try {
			Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/select")));
			slt1.selectByIndex(2);	
			}catch(Exception e) {
				 e.printStackTrace();
			 }
			
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			   js3.executeScript("window.scrollBy(0,50)");
			   
				Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[3]/div/select")));
				slt5.selectByValue("excellent");
				////select[@title='Choose Estimated Credit Score']
				Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[4]/div/select")));
				slt6.selectByValue("rent");
				Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
				slt7.selectByValue("cash_back");
				//*[@id="application_form"]/div[4]/div[5]/div/select
				////*[@id="application_form"]/div[4]/div[3]/div/select
			//	driver.findElement(By.xpath("//*[@id=\"send_sms\"]")).click();
				//*[@id="application_form"]/div[4]/div[4]/div/select
				
				 JavascriptExecutor js8 = (JavascriptExecutor) driver;
				   js8.executeScript("window.scrollBy(0,70)");
				   Thread.sleep(5000);
				   Actions action2=new Actions(driver);
				   action2.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
				   Thread.sleep(3000);
	}
		
	public void seeOffers() throws Exception {
		Thread.sleep(3000);
		driver.navigate().to("https://demo.fitsyn.com/applications");
	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[16]/div/button")).click();
	Thread.sleep(2000);
	WebElement apphistry=driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[16]/div/div/a[4]"));
		Actions actn=new Actions(driver);
		actn.moveToElement(apphistry);
		actn.click().build().perform();
//		
//		
//		
//	}

	}}


