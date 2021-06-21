package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SubAccountsSettings {
	
	WebDriver driver;
	Properties pro=new  Properties();
	
	public SubAccountsSettings(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Setting() throws Exception {
	driver.findElement(By.xpath("//a[normalize-space()='Sub Accounts']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@href,'/vendors')]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@placeholder='Search by company name or email or mobile']")).sendKeys(pro.getProperty("Admin"));
driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Action']")).click();
Thread.sleep(7000);

driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();

Thread.sleep(3000);

Select select=new Select(driver.findElement(By.xpath("//select[@name='default_public_form']")));
select.selectByValue(pro.getProperty("Selectoptions"));
driver.findElement(By.xpath("//button[@id='submit-btn']")).click();
		

	}
}

