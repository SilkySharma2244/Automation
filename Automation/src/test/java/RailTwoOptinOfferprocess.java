import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RailTwoOptinOfferprocess {
	
	
	
	
	
	WebDriver driver;
	Properties pro=new  Properties();
	
	
	
	public RailTwoOptinOfferprocess(WebDriver driver) {
		this.driver=driver;
	}

	public static void main(String[] args) {
	

	}
	public void createApp() throws Exception {
		Thread.sleep(7000);
		
			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/a")).click();
			Thread.sleep(9000);
			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/ul/li[1]//a[@href='/vendors']")).click();	
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
	
		Thread.sleep(3000);
		
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
		select.selectByValue("monevo");
		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
	}
	public void fillForm() throws Exception {
		Thread.sleep(3000);
		driver.navigate().to("https://demo.fitsyn.com/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(3000);

        WebElement l=driver.findElement(By.partialLinkText("Initiate Applicati"));
        l.click();
        
              JavascriptExecutor js = (JavascriptExecutor) driver;
 	   js.executeScript("window.scrollBy(0,1200)");
 	   Thread.sleep(5000);
 	   Actions action=new Actions(driver);
 	   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
 	   
 
 		String text100=driver.findElement(By.cssSelector("label[for='first_name']")).getText();
 		System.out.println(text100);
 		String exp100="This field is required.";
 		Assert.assertEquals(text100,exp100);
 		
 	   try {
 			  driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).click();
 		     driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).sendKeys("John");
 			 }catch(Exception e) {
 				 e.printStackTrace();
 			 }
 	   String text1=driver.findElement(By.cssSelector("label[for='last_name']")).getText();
 		System.out.println(text1);
 		String exp1="This field is required.";
 		Assert.assertEquals(text1,exp1);
 	   
 	   try {
 		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).click();
 		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).sendKeys("shoy");
 			 }catch(Exception e) {
 				 e.printStackTrace();
 			 }
 	   String text2=driver.findElement(By.cssSelector("label[for='dob']")).getText();
 		System.out.println(text2);
 		String exp2="Please enter birth date";
 		Assert.assertEquals(text2,exp2);
 	   try {
 			  driver.findElement(By.cssSelector("#dob")).click();
 			  driver.findElement(By.cssSelector("#dob")).sendKeys("12/09/2004");
 			  String text21=driver.findElement(By.cssSelector("label[for='dob']")).getText();
 				System.out.println(text21);
 				String exp21="You must be at least 18 years old.";
 				Assert.assertEquals(text21,exp21);
 				 driver.findElement(By.cssSelector("#dob")).clear();
 			  driver.findElement(By.cssSelector("#dob")).sendKeys("12/21/1998");
 			 }catch(Exception e) {
 				 e.printStackTrace();
 			 }
 	   String text3=driver.findElement(By.cssSelector("label[for='social_security_number']")).getText();
 		System.out.println(text3);
 		String exp3="This field is required.";
 		Assert.assertEquals(text3,exp3);
 	   try {
 			  driver.findElement(By.cssSelector("#social_security_number")).click();
 			  driver.findElement(By.cssSelector("#social_security_number")).sendKeys("678-98-9898");
 			 }catch(Exception e) {
 				 e.printStackTrace();
 			 }
 		 Thread.sleep(1000);
 			String text4=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
 			System.out.println(text4);
 			String exp4="This field is required.";
 			Assert.assertEquals(text4,exp4);
 			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys("assssddddf");
 			
 			String text41=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
 			System.out.println(text41);
 			String exp41="Please enter only digits.";
 			Assert.assertEquals(text41,exp41);
 			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).clear();
 		driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys("1200000");
 		
 		JavascriptExecutor js4 = (JavascriptExecutor) driver;	
 		   js4.executeScript("window.scrollBy(0,20)");
 		   
 		   String text5=driver.findElement(By.cssSelector("label[for='income_source']")).getText();
 			System.out.println(text5);
 			String exp5="Select Job Type";
 			Assert.assertEquals(text5,exp5);
 			
 		try {
 		Select slt=new Select(driver.findElement(By.cssSelector("select[title='Select Job Type']")));
 		slt.selectByIndex(2);}catch(Exception e) {
 			 e.printStackTrace();
 		 }
 		String text6=driver.findElement(By.cssSelector("label[for='pay_frequency']")).getText();
 		System.out.println(text6);
 		String exp6="Choose Pay Frequency";
 		Assert.assertEquals(text6,exp6);
 		
 		try {
 		Select slt1=new Select(driver.findElement(By.cssSelector("select[title='Choose Pay Frequency']")));
 		slt1.selectByIndex(2);	
 		}catch(Exception e) {
 			 e.printStackTrace();
 		 }
 
 		String text7=driver.findElement(By.cssSelector("label[for='employer_name']")).getText();
 		System.out.println(text7);
 		String exp7="This field is required.";
 		Assert.assertEquals(text7,exp7);
 		try {
 		driver.findElement(By.cssSelector("input[placeholder='Your Employer Name']")).sendKeys("software service");}
 		catch(Exception e) {
 			 e.printStackTrace();
 		 }
 		 
 		String text8=driver.findElement(By.cssSelector("label[for='months_at_employer']")).getText();
 		System.out.println(text8);
 		String exp8="This field is required.";
 		Assert.assertEquals(text8,exp8);
 		
 		try {
 		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).sendKeys("FDSGFH");
 		String text81=driver.findElement(By.cssSelector("label[for='months_at_employer']")).getText();
 		System.out.println(text81);
 		String exp81="Please enter only digits.";
 		Assert.assertEquals(text81,exp81);
 		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).clear();
 		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).sendKeys("12");}
 		catch(Exception e) {
 			 e.printStackTrace();
 		 }
 		JavascriptExecutor js2 = (JavascriptExecutor) driver;
 		   js2.executeScript("window.scrollBy(0,50)");
 		   
 		   String text10=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
 			System.out.println(text10);
 			String exp10="This field is required.";
 			Assert.assertEquals(text10,exp10);
 			
 			driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys("aasdsddd");
 			
 			   String text101=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
 				System.out.println(text101);
 				String exp101="Please enter only digits.";
 				Assert.assertEquals(text101,exp101);
 				driver.findElement(By.cssSelector("input[placeholder='5555551234']")).clear();
 		driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys("8569854589");
 		
 		 Thread.sleep(1000);
 		String text11=driver.findElement(By.xpath("//label[normalize-space()='Please enter Email']")).getText();
 		System.out.println(text11);
 		String exp11="Please enter Email";
 		Assert.assertEquals(text11,exp11);
 		
 		try {
 	//	driver.findElement(By.cssSelector("body.slack-chat-page.config--vertical.config--borderLess.menu-left--colorful.menu-left--shadow.theme--light.menu-left--visible:nth-child(2) div.utils__content:nth-child(7) div.cui-layout.cui-layout-has-sider:nth-child(1) div.cui-layout div.cui-layout-content div.cui-utils-content section.card:nth-child(4) div.card-body form:nth-child(2) div.row:nth-child(7) div.col-xl-6.col-md-6.col-sm-12:nth-child(2) div.form-group.state-success > input.form-control")).click();
 	driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div//input[@placeholder='Enter Email']")).sendKeys("mock+265@evenfinancial.com");}
 		catch(Exception e) {
 			 e.printStackTrace();
 		 }
 		Thread.sleep(2000);
 		JavascriptExecutor js5 = (JavascriptExecutor) driver;
 		   js5.executeScript("window.scrollBy(0,50)");
 		   
 		   String text12=driver.findElement(By.xpath("//label[@for='address1']")).getText();
 			System.out.println(text12);
 			String exp12="This field is required.";
 			Assert.assertEquals(text12,exp12);
 		driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys("Washington Dc");
 		
 		String text13=driver.findElement(By.xpath("//label[@for='city']")).getText();
 		System.out.println(text13);
 		String exp13="This field is required.";
 		Assert.assertEquals(text13,exp13);
 		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Florida");
 		
 
 		String text14=driver.findElement(By.xpath("//label[normalize-space()='Select State']")).getText();
 		System.out.println(text14);
 		String exp14="Select State";
 		Assert.assertEquals(text14,exp14);
 		Select slt2=new Select(driver.findElement(By.xpath("//select[@name='state']")));
 		slt2.selectByIndex(2);
 		Thread.sleep(2000);
 		
 		String text15=driver.findElement(By.xpath("//label[@for='zipcode']")).getText();
 		System.out.println(text15);
 		String exp15="This field is required.";
 		Assert.assertEquals(text15,exp15);
 		driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys("12345");
 		String text16=driver.findElement(By.xpath("//label[normalize-space()='Choose Loan Purpose']")).getText();
 		System.out.println(text16);
 		String exp16="Choose Loan Purpose";
 		Assert.assertEquals(text16,exp16);
 		Select slt3=new Select(driver.findElement(By.xpath("//select[@title='Choose Loan Purpose']")));
 		slt3.selectByIndex(2);
 		String text17=driver.findElement(By.xpath("//label[@for='loan_amount']")).getText();
 		System.out.println(text17);
 		String exp17="This field is required.";
 		Assert.assertEquals(text17,exp17);
 		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("!@!@@##");
 		String text171=driver.findElement(By.xpath("//label[@for='loan_amount']")).getText();
 		System.out.println(text171);
 		String exp171="Please enter only digits.";
 		Assert.assertEquals(text171,exp171);
 		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
 		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("100000");
 		JavascriptExecutor js3 = (JavascriptExecutor) driver;
 		   js3.executeScript("window.scrollBy(0,50)");
 		   
 			driver.findElement(By.xpath("//input[@id='co_app']")).click();
 			driver.findElement(By.xpath("//input[@name='co_app_first_name']")).sendKeys("jennifer");
 			driver.findElement(By.xpath("//input[@name='co_app_last_name']")).sendKeys("lopez");
 			Thread.sleep(2000);
 			driver.findElement(By.xpath("//input[@id='co_app_dob']")).sendKeys("12/21/1998");
 			driver.findElement(By.xpath("//input[@placeholder='Type address here..']")).sendKeys("Washington Dc");
 			driver.findElement(By.xpath("//input[@name='co_app_city']")).sendKeys("Florida");
 			Select slt4=new Select(driver.findElement(By.xpath("//select[@name='co_app_state']")));
 			slt4.selectByIndex(2);
 			driver.findElement(By.xpath("//input[@name='co_app_zipcode']")).sendKeys("1234");
 			driver.findElement(By.xpath("//input[@name='co_app_annual_income']")).sendKeys("400000");
 			String text172=driver.findElement(By.xpath("//label[@for='months_at_address']")).getText();
 			System.out.println(text172);
 			String exp172="This field is required.";
 			Assert.assertEquals(text172,exp172);
 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys("&%$$$%%");
 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).clear();
 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys("12");
 			driver.findElement(By.xpath("//input[@placeholder='Rent Per Month']")).sendKeys("3000");
 			Thread.sleep(2000);
 			
 			Select slt5=new Select(driver.findElement(By.xpath("//select[@title='Choose Estimated Credit Score']")));
 			slt5.selectByValue("4");
 			Select slt6=new Select(driver.findElement(By.xpath("//select[@title='Choose Applicant Housing Status']")));
 			slt6.selectByValue("1");
 			driver.findElement(By.xpath("//span[@class='slidert round']")).click();
 			 			
				
				JavascriptExecutor js81= (JavascriptExecutor) driver;
				   js81.executeScript("window.scrollBy(0,100)");
				driver.findElement(By.xpath("//*[@id=\"send_sms\"]")).click();
				try {
				Thread.sleep(5000);
				JavascriptExecutor js811= (JavascriptExecutor) driver;
				   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.cssSelector("#submit-btn")).click();}
				catch(Exception e) {
					e.printStackTrace();
				}

				   try {
					   Thread.sleep(9000);
					   String actualsentmsg=driver.findElement(By.xpath("//span[contains(text(),'Application created successfully and message sent')]")).getText();
					   String exptsentmsg="Application created successfully and message sent";
					   Assert.assertEquals(actualsentmsg, exptsentmsg);}
					   catch(Exception e) {
						   e.printStackTrace();
					   }
				 Thread.sleep(5000);
				   
				 Actions action5=new Actions(driver);
				action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"sms_history\"]/div/div/div[3]/button"))).click().build().perform();
				
				   
					 String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
					 System.out.println(url);
					 String newurl="https://"+ url;
					 driver.switchTo().newWindow(WindowType.TAB);
					 driver.get(newurl);
					 
					 Thread.sleep(10000);
					 JavascriptExecutor js82 = (JavascriptExecutor) driver;
					   js82.executeScript("window.scrollBy(0,2200)");
				
					   
						   WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div/div[1]/div/div/div/div/div/div[30]/div[2]/div/input"));
						WebElement el4=   driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div/div[2]/button"));
						Thread.sleep(5000);
		Actions builder=new Actions(driver);
		builder.moveToElement(element).click().build().perform();

	
		Actions builder1=new Actions(driver);
		builder1.moveToElement(el4).click().build().perform();
		Thread.sleep(5000);
		
		
		
		
		
	}
}
