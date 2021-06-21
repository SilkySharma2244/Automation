package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter registered email']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement pwd;
	
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement box;
	
	
	
	@FindBy(xpath="//button[@id='sign-in-request']")
	WebElement request;
	
	public Login( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginApp(String mail,String pass) {
		email.sendKeys(mail);
		pwd.sendKeys(pass);
		box.click();
		request.click();
		
	}
	

}
