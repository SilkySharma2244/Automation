import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.SubAccountsSettings;


public class ApplicationForm {
	WebDriver driver;
public static void main(String [] arg) throws InterruptedException, Exception  {
	WebDriver driver;
	Login lg;
	File src=new File("./configuration/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver",pro.getProperty("ChromeDriver")); 
//	Thread.sleep(5000);
//    String filepath="C:\\Users\\Hema Sahoo\\Downloads\\CSVData";
//    HashMap<String,Object> chromepref=new HashMap<String,Object>();
//    chromepref.put("profile.default_content_setting.popups",0);
//    chromepref.put("download.default_directory",filepath);
//    ChromeOptions options=new ChromeOptions();
//    options.setExperimentalOption("prefs",chromepref);
//	
//	 driver=new ChromeDriver(options);
	 driver=new ChromeDriver();
driver.get("https://demo.fitsyn.com");
	 Thread.sleep(5000);
String url=	driver.getTitle();
	    String expectedurl="Fitsyn UAT | Login";
	    System.out.println(expectedurl);
	    Assert.assertEquals(url,expectedurl);
	   
	 lg=new Login(driver);
	lg.loginApp(pro.getProperty("Register"),pro.getProperty("PWD"));
	
	Thread.sleep(5000);
//	try {
//	String actual=driver.findElement(By.xpath("/html/body/div[6]/span[3]")).getText();
//	String expected="Login Successful";
//	Assert.assertEquals(actual, expected);}
//			   catch(Exception e) {
//				   e.printStackTrace();
//		}

	
//
//	Thread.sleep(7000);
//	
//		driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/ul/li[1]//a[@href='/vendors']")).click();	
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys(pro.getProperty("Admin"));
//	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
//
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
//	Thread.sleep(7000);
//	
//	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
//
//	Thread.sleep(3000);
//	
//	Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
//	select.selectByValue(pro.getProperty("Selectoptions"));
//	driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
//	Thread.sleep(3000);
//	driver.navigate().to(pro.getProperty("URL1"));
////	String act=driver.getTitle();
////	String expect="Fitsyn UAT | Dashboard";
////	Assert.assertEquals(act,expect);
//////	
//	driver.manage().window().maximize();
//////////	
//	Thread.sleep(3000);
////////	   
//  WebElement l=driver.findElement(By.partialLinkText("Initiate Applicati"));
//	  l.click();
//	  String title=driver.getTitle();
//	  String exptitle="/applications/initiate";
//	   Assert.assertEquals(title,exptitle);
//
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//	   js.executeScript("window.scrollBy(0,1200)");
//	   Thread.sleep(5000);
//	   Actions action=new Actions(driver);
//	   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
//	   
//
//		String text100=driver.findElement(By.cssSelector("label[for='first_name']")).getText();
//		System.out.println(text100);
//		String exp100="This field is required.";
//		Assert.assertEquals(text100,exp100);
//		
//	   try {
//			  driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).click();
//		     driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).sendKeys(pro.getProperty("First"));
//			 }catch(Exception e) {
//				 e.printStackTrace();
//			 }
//	   String text1=driver.findElement(By.cssSelector("label[for='last_name']")).getText();
//		System.out.println(text1);
//		String exp1="This field is required.";
//		Assert.assertEquals(text1,exp1);
//	   
//	   try {
//		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).click();
//		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).sendKeys(pro.getProperty("Last"));
//			 }catch(Exception e) {
//				 e.printStackTrace();
//			 }
//	   String text2=driver.findElement(By.cssSelector("label[for='dob']")).getText();
//		System.out.println(text2);
//		String exp2="Please enter birth date";
//		Assert.assertEquals(text2,exp2);
//	   try {
//			  driver.findElement(By.cssSelector("#dob")).click();
//			  driver.findElement(By.cssSelector("#dob")).sendKeys("12/09/2004");
//			  String text21=driver.findElement(By.cssSelector("label[for='dob']")).getText();
//				System.out.println(text21);
//				String exp21="You must be at least 18 years old.";
//				Assert.assertEquals(text21,exp21);
//				 driver.findElement(By.cssSelector("#dob")).clear();
//			  driver.findElement(By.cssSelector("#dob")).sendKeys(pro.getProperty("Dateofbirth"));
//			 }catch(Exception e) {
//				 e.printStackTrace();
//			 }
//	   String text3=driver.findElement(By.cssSelector("label[for='social_security_number']")).getText();
//		System.out.println(text3);
//		String exp3="This field is required.";
//		Assert.assertEquals(text3,exp3);
//	   try {
//			  driver.findElement(By.cssSelector("#social_security_number")).click();
//			  driver.findElement(By.cssSelector("#social_security_number")).sendKeys(pro.getProperty("Socialsecurity"));
//			 }catch(Exception e) {
//				 e.printStackTrace();
//			 }
//		 Thread.sleep(1000);
//			String text4=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
//			System.out.println(text4);
//			String exp4="This field is required.";
//			Assert.assertEquals(text4,exp4);
//			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys("assssddddf");
//			
//			String text41=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
//			System.out.println(text41);
//			String exp41="Please enter only digits.";
//			Assert.assertEquals(text41,exp41);
//			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).clear();
//		driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys(pro.getProperty("AnuualIncome"));
//		
//		JavascriptExecutor js4 = (JavascriptExecutor) driver;	
//		   js4.executeScript("window.scrollBy(0,20)");
//		   
//		   String text5=driver.findElement(By.cssSelector("label[for='income_source']")).getText();
//			System.out.println(text5);
//			String exp5="Select Job Type";
//			Assert.assertEquals(text5,exp5);
//			
//		try {
//		Select slt=new Select(driver.findElement(By.cssSelector("select[title='Select Job Type']")));
//		slt.selectByIndex(2);}catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		String text6=driver.findElement(By.cssSelector("label[for='pay_frequency']")).getText();
//		System.out.println(text6);
//		String exp6="Choose Pay Frequency";
//		Assert.assertEquals(text6,exp6);
//		
//		try {
//		Select slt1=new Select(driver.findElement(By.cssSelector("select[title='Choose Pay Frequency']")));
//		slt1.selectByIndex(2);	
//		}catch(Exception e) {
//			 e.printStackTrace();
//		 }
//
//		String text7=driver.findElement(By.cssSelector("label[for='employer_name']")).getText();
//		System.out.println(text7);
//		String exp7="This field is required.";
//		Assert.assertEquals(text7,exp7);
//		try {
//		driver.findElement(By.cssSelector("input[placeholder='Your Employer Name']")).sendKeys(pro.getProperty("Employername"));}
//		catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		 
//		String text8=driver.findElement(By.cssSelector("label[for='months_at_employer']")).getText();
//		System.out.println(text8);
//		String exp8="This field is required.";
//		Assert.assertEquals(text8,exp8);
//		
//		try {
//		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).sendKeys("FDSGFH");
//		String text81=driver.findElement(By.cssSelector("label[for='months_at_employer']")).getText();
//		System.out.println(text81);
//		String exp81="Please enter only digits.";
//		Assert.assertEquals(text81,exp81);
//		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).clear();
//		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).sendKeys(pro.getProperty("Numberofmonths"));}
//		catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		   js2.executeScript("window.scrollBy(0,50)");
//		   
//		   String text10=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
//			System.out.println(text10);
//			String exp10="This field is required.";
//			Assert.assertEquals(text10,exp10);
//			
//			driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys("aasdsddd");
//			
//			   String text101=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
//				System.out.println(text101);
//				String exp101="Please enter only digits.";
//				Assert.assertEquals(text101,exp101);
//				driver.findElement(By.cssSelector("input[placeholder='5555551234']")).clear();
//		driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys(pro.getProperty("Phonenumber"));
//		
//		 Thread.sleep(1000);
//		String text11=driver.findElement(By.xpath("//label[normalize-space()='Please enter Email']")).getText();
//		System.out.println(text11);
//		String exp11="Please enter Email";
//		Assert.assertEquals(text11,exp11);
//		
//		try {
//	//	driver.findElement(By.cssSelector("body.slack-chat-page.config--vertical.config--borderLess.menu-left--colorful.menu-left--shadow.theme--light.menu-left--visible:nth-child(2) div.utils__content:nth-child(7) div.cui-layout.cui-layout-has-sider:nth-child(1) div.cui-layout div.cui-layout-content div.cui-utils-content section.card:nth-child(4) div.card-body form:nth-child(2) div.row:nth-child(7) div.col-xl-6.col-md-6.col-sm-12:nth-child(2) div.form-group.state-success > input.form-control")).click();
//	driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div//input[@placeholder='Enter Email']")).sendKeys(pro.getProperty("Email"));}
//		catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		Thread.sleep(2000);
//		JavascriptExecutor js5 = (JavascriptExecutor) driver;
//		   js5.executeScript("window.scrollBy(0,50)");
//		   
//		   String text12=driver.findElement(By.xpath("//label[@for='address1']")).getText();
//			System.out.println(text12);
//			String exp12="This field is required.";
//			Assert.assertEquals(text12,exp12);
//		driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys(pro.getProperty("Enteraddress"));
//		
//		String text13=driver.findElement(By.xpath("//label[@for='city']")).getText();
//		System.out.println(text13);
//		String exp13="This field is required.";
//		Assert.assertEquals(text13,exp13);
//		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(pro.getProperty("City"));
//		
//
//		String text14=driver.findElement(By.xpath("//label[normalize-space()='Select State']")).getText();
//		System.out.println(text14);
//		String exp14="Select State";
//		Assert.assertEquals(text14,exp14);
//		Select slt2=new Select(driver.findElement(By.xpath("//select[@name='state']")));
//		slt2.selectByIndex(2);
//		Thread.sleep(2000);
//		
//		String text15=driver.findElement(By.xpath("//label[@for='zipcode']")).getText();
//		System.out.println(text15);
//		String exp15="This field is required.";
//		Assert.assertEquals(text15,exp15);
//		driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys(pro.getProperty("Zipcode"));
//		String text16=driver.findElement(By.xpath("//label[normalize-space()='Choose Loan Purpose']")).getText();
//		System.out.println(text16);
//		String exp16="Choose Loan Purpose";
//		Assert.assertEquals(text16,exp16);
//		Select slt3=new Select(driver.findElement(By.xpath("//select[@title='Choose Loan Purpose']")));
//		slt3.selectByIndex(2);
//		String text17=driver.findElement(By.xpath("//label[@for='loan_amount']")).getText();
//		System.out.println(text17);
//		String exp17="This field is required.";
//		Assert.assertEquals(text17,exp17);
//		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("!@!@@##");
//		String text171=driver.findElement(By.xpath("//label[@for='loan_amount']")).getText();
//		System.out.println(text171);
//		String exp171="Please enter only digits.";
//		Assert.assertEquals(text171,exp171);
//		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
//		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys(pro.getProperty("Financeamount"));
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		   js3.executeScript("window.scrollBy(0,50)");
//		   
//			driver.findElement(By.xpath("//input[@id='co_app']")).click();
//			driver.findElement(By.xpath("//input[@name='co_app_first_name']")).sendKeys(pro.getProperty("Applicantname"));////input[@name='co_app_last_name']
//			driver.findElement(By.xpath("//input[@name='co_app_last_name']")).sendKeys(pro.getProperty("Applicantlastname"));
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='co_app_dob']")).sendKeys(pro.getProperty("Dateofbirth"));
//			driver.findElement(By.xpath("//input[@placeholder='Type address here..']")).sendKeys(pro.getProperty("Enteraddress"));////input[@name='co_app_city']
//			driver.findElement(By.xpath("//input[@name='co_app_city']")).sendKeys(pro.getProperty("City"));
//			Select slt4=new Select(driver.findElement(By.xpath("//select[@name='co_app_state']")));
//			slt4.selectByIndex(2);
//			driver.findElement(By.xpath("//input[@name='co_app_zipcode']")).sendKeys(pro.getProperty("Zipcode"));
//			driver.findElement(By.xpath("//input[@name='co_app_annual_income']")).sendKeys(pro.getProperty("Applicantincome"));
//			String text172=driver.findElement(By.xpath("//label[@for='months_at_address']")).getText();
//			System.out.println(text172);
//			String exp172="This field is required.";
//			Assert.assertEquals(text172,exp172);
//			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys("&%$$$%%");
//			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).clear();
//			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys(pro.getProperty("Numberofmonths"));
//			driver.findElement(By.xpath("//input[@placeholder='Rent Per Month']")).sendKeys(pro.getProperty("Rentpermonth"));
//			Thread.sleep(2000);
//			
//			Select slt5=new Select(driver.findElement(By.xpath("//select[@title='Choose Estimated Credit Score']")));
//			slt5.selectByValue("4");
//			////select[@title='Choose Estimated Credit Score']
//			Select slt6=new Select(driver.findElement(By.xpath("//select[@title='Choose Applicant Housing Status']")));
//			slt6.selectByValue("1");
//			driver.findElement(By.xpath("//span[@class='slidert round']")).click();
//			
//			//driver.findElement(By.xpath("//*[@id=\"send_sms\"]")).click();
////			
////			
//			 JavascriptExecutor js8 = (JavascriptExecutor) driver;
//			   js8.executeScript("window.scrollBy(0,70)");
//			   Thread.sleep(5000);
//			   Actions action2=new Actions(driver);
//			   action2.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
//			   Thread.sleep(7000);
			   
	//CardCustomOfferPage obj=new CardCustomOfferPage(driver);
	                 //obj.cardCustomOffers();
	 //  CustomOffersPage obj1=new CustomOffersPage(driver);
//	   obj1.customOffers();  
//	   CardCustomOfferPage obj=new CardCustomOfferPage(driver);
//       obj.cardCustomOffers();
	
//	GreaterThan obj=new GreaterThan(driver);
//	obj.systemSetting();
//	obj.createApplication();
//	obj.seeOffers();
			   
			// driver.navigate().to("https://demo.fitsyn.com/dashboard");   
			 //RailOne obj=new RailOne(driver);
			 //obj.createApp();

	//to show simran mam
//	AfterPreofferprocessWithOptinprocess obj1=new AfterPreofferprocessWithOptinprocess(driver);
//	obj1.createApp();
//	obj1.optinOffer();
//	obj1.fillform();   
//
//	RailTwoAfterpreofferprocesswithoptinprocess obj=new RailTwoAfterpreofferprocesswithoptinprocess(driver);
//	obj.createApp();
//	obj.optinOffer();
//	obj.fillform();
	
	
//	
//	RailTwoAfterpreofferprocesswithoptinprocess obj=new RailTwoAfterpreofferprocesswithoptinprocess(driver);
//	SearchApplicationByValidData obj=new SearchApplicationByValidData(driver);
//	obj.validDatasearchDifferentFilters();
//	SearchApplicationByInvalidData obj1=new SearchApplicationByInvalidData(driver);
//	obj1.invalidDatasearchAllFilters();
//	SearchApplicationByValidDataWithAllStatus obj2=new SearchApplicationByValidDataWithAllStatus(driver);
//	obj2.validDataAllStatus();
	
//	SearchValidDataOnDifferentDate obj=new SearchValidDataOnDifferentDate(driver);
//	obj.searchDataDifferentDate();
	
	//show without optin process
//	RailTwoAfterpreofferprocesswithoptinprocess obj=new RailTwoAfterpreofferprocesswithoptinprocess(driver);
//	obj.createApp();
//	obj.optinOffer();
//	obj.fillform();
//	RailOne obj1=new RailOne(driver);
//	obj1.createApp();
//	
//	//show withoptin process
//	
//	AfterPreofferprocessWithOptinprocess obj2=new AfterPreofferprocessWithOptinprocess(driver);
//	obj2.createApp();
//	obj2.optinOffer();
//	obj2.fillform();
//	RailTwoAfterpreofferprocesswithoptinprocess obj3=new RailTwoAfterpreofferprocesswithoptinprocess(driver);
//	obj3.createApp();
//	obj3.optinOffer();
//	obj3.fillform();
	
//	SelectPurgeButtoninApplicationlistpage obj=new SelectPurgeButtoninApplicationlistpage(driver);
//	obj.status();
	SelectSurgeButtonInApplicationNewListPage obj=new SelectSurgeButtonInApplicationNewListPage(driver);
	obj.sortcolumn();
	
	
	

	
}}