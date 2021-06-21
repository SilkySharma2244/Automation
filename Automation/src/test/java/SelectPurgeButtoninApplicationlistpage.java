


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelectPurgeButtoninApplicationlistpage {

	WebDriver driver;
	Properties pro=new  Properties();
		
	
	public SelectPurgeButtoninApplicationlistpage(WebDriver driver) {
		this.driver=driver;
	}
	

	
	public static void main(String[] args) {



	}
public void surgebutton() throws Exception {
	Thread.sleep(5000);
	  driver.navigate().to("https://demo.fitsyn.com/applications");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"show_application\"]")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[1]/label/span")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[1]/label/span")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[8]/div/button[2]")).click();
	
	
}

	public void status() throws Exception {
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/statuses/system");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/nav/div/a/strong")).click();
		Thread.sleep(9000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/div/div[1]/input[1]"))).click();
		actn.sendKeys("statusfive").build().perform();
		Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add-status-btn\"]"))).click().build().perform();
		Thread.sleep(2000);
		try {
		String act=driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText(); 
		System.out.println(act);
		Assert.assertEquals(act,"Status successfully added");}
		catch(Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/statuses/stages/system");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/nav/div/a[2]/strong")).click();
		Thread.sleep(9000);
		Actions actn2=new Actions(driver);
	actn2.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/div/div[1]/input[1]"))).doubleClick();
	actn2.sendKeys("stagefive").build().perform();
	
	Actions actn3=new Actions(driver);
	actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"add-stage-btn\"]"))).click().build().perform();
	try{Thread.sleep(3000);
	String act1=driver.findElement(By.xpath("/html/body/div[11]/span[3]")).getText(); 
	System.out.println(act1);
	Assert.assertEquals(act1,"Stage successfully added");}
	catch(Exception e) {
		e.printStackTrace();
	}
	Thread.sleep(9000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div/div/div/table/tbody/tr[1]/td[3]/div/a")).click();
		Thread.sleep(9000);
		Actions actn4=new Actions(driver);
		actn4.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/form/div[1]/div/div/div[1]/div/div/input"))).click().build().perform();
		
		Actions actn5=new Actions(driver);
		actn5.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/form/div[2]/button[2]"))).click().build().perform();
		Thread.sleep(3000);
		try {
		String act2=driver.findElement(By.xpath("/html/body/div[11]/span[3]")).getText(); 
		System.out.println(act2);
		Assert.assertEquals(act2,"Status mapping updated.");}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/applications");
		driver.manage().window().maximize();//
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div/table/tbody/tr[1]/td[12]/a")).click();
		Select slt=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/div/div/select")));//to test pending
		slt.selectByVisibleText("statusfive");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(5000);
	String stagetext=driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[12]/a")).getText();
	System.out.println(stagetext);
	Assert.assertEquals(stagetext,"statusfive");

	}
	public void sortcolumn() throws Exception {
	
	Thread.sleep(5000);
	  driver.navigate().to("https://demo.fitsyn.com/applications");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/thead/tr/th[4]/a")).click();//name
	List<WebElement> elemntlist=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[4]"));
	List<String>orignallist=elemntlist.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist);
	
	List<String>sortedlist=orignallist.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist);
	Thread.sleep(5000);

	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/thead/tr/th[2]/a")).click();//created
	List<WebElement> elemntlist1=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]"));
	List<String>orignallist1=elemntlist1.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist1);
	
	List<String>sortedlist1=orignallist1.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist1);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	List<WebElement> elemntlist2=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[3]"));//clientID
	List<String>orignallist2=elemntlist2.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist2);
	
	List<String>sortedlist2=orignallist2.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist2);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/thead/tr/th[5]/a")).click();//email
	List<WebElement> elemntlist4=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[5]"));
	List<String>orignallist4=elemntlist4.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist4);
	
	List<String>sortedlist4=orignallist4.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist4);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	List<WebElement> elemntlist5=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]"));//mobile
	List<String>orignallist5=elemntlist5.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist5);
	
	List<String>sortedlist5=orignallist5.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist5);
	Thread.sleep(5000);
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/thead/tr/th[7]/a")).click();//loan amount
	List<WebElement> elemntlist6=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[7]"));
	List<String>orignallist6=elemntlist6.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist6);
	
	List<String>sortedlist6=orignallist6.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist6);
	Thread.sleep(5000);
	
	
	
	Thread.sleep(5000);
	List<WebElement> elemntlist7=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[8]"));//maximum approved
	List<String>orignallist7=elemntlist7.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist7);
	
	List<String>sortedlist7=orignallist7.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist7);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/thead/tr/th[9]/a")).click();//source
	List<WebElement> elemntlist8=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[9]"));
	List<String>orignallist8=elemntlist8.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist8);
	
	List<String>sortedlist8=orignallist8.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist8);
	Thread.sleep(5000);	
	
	
	
	
	Thread.sleep(5000);
	List<WebElement> elemntlist9=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[10]"));//sub account
	List<String>orignallist9=elemntlist9.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist9);
	
	List<String>sortedlist9=orignallist9.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist9);
	Thread.sleep(10000);	
	
	   JavascriptExecutor js4= (JavascriptExecutor) driver;
	   js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
	   WebElement scrollArea = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]"));
	   
	   Actions actn=new Actions (driver);
	           actn.moveToElement(scrollArea).click().build().perform();
	        
	
	// Scroll to div's most right:
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
	
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/thead/tr/th[11]/a")).click();//status
	List<WebElement> elemntlist11=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[11]"));
	List<String>orignallist11=elemntlist11.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist11);
	
	List<String>sortedlist11=orignallist11.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist11);
	Thread.sleep(5000);	
	
	
	
	
	Thread.sleep(5000);
	List<WebElement> elemntlist12=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[12]"));//stage status
	List<String>orignallist12=elemntlist12.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist12);
	
	List<String>sortedlist12=orignallist12.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist12);
	Thread.sleep(5000);	
	
	
	
	Thread.sleep(5000);
	List<WebElement> elemntlist13=driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/div/div/div[2]/table/tbody/tr/td[13]"));//submitted Buy
	List<String>orignallist13=elemntlist13.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist13);
	
	List<String>sortedlist13=orignallist13.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist13);
	Thread.sleep(5000);	
	
	
	
	
	
	
	}
	
	
	
	
	

	
	
	
	
		
	}












