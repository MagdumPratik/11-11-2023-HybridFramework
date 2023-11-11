package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	public void setUsername(String em)
	{
		email.clear();
		email.sendKeys(em);
	}
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	public void setPassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement clkLogin;
	
	public void clickLoginButton()
	{
		clkLogin.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement clkLogout;
	
	public void clickLogoutButton()
	{
		clkLogout.click();
	}
	
}
