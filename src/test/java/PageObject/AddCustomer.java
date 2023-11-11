package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer {
	
	WebDriver ldriver;
	public AddCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//p[contains(text(),'Customers')])[1]")
	WebElement clickCustomers1;
	
	public void clickCustomerList()
	{
		clickCustomers1.click();
	}
	
	@FindBy(xpath="(//p[contains(text(),'Customers')])[2]")
	WebElement clickCustomers2;
	
	public void clickCustomerList2()
	{
		clickCustomers2.click();
	}
	
	@FindBy(xpath="(//a[normalize-space()='Add new'])[1]")
	WebElement addNewCustomer;
	
	public void clickAddNewCustomer()
	{
		addNewCustomer.click();
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	public void setEmail(String em)
	{
		email.sendKeys(em);
	}

	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	public void addPAsssword(String em)
	{
		Password.sendKeys(em);
	}
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstName;
	
	public void addFirstName(String em)
	{
		FirstName.sendKeys(em);
	}
	
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastName;
	
	public void addLastName(String em)
	{
		LastName.sendKeys(em);
	}
	
	
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement Gender;
	
	public void Gender_Male()
	{
		Gender.click();
	}
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement DateOfBirth;
	
	public void addDateOfBirth(String em)
	{
		DateOfBirth.sendKeys(em);
	}
	
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement Company;
	
	public void addCompany(String em)
	{
		Company.sendKeys(em);
	}
	
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement IsTaxExempt;
	
	public void clickIsTaxExempt()
	{
		IsTaxExempt.click();
	}
	
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement selectclick;
	
	public void managerofVendor(String sc)
	{
		Select sc1=new Select(selectclick);
		sc1.selectByVisibleText(sc);
	}
	
	@FindBy(xpath="//input[@id='Active']")
	WebElement Active;
	
	public void clickActive()
	{
		Active.click();
	}
	
	
	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement AdminComment;
	
	public void addAdminComment(String em)
	{
		AdminComment.sendKeys(em);
	}
	
	@FindBy(xpath="//button[@name='save']")
	WebElement save;
	
	public void clicksave()
	{
		save.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement successMsg;
	
	public String getsuccessMsg()
	{
		return successMsg.getText();
	}
	
}
