package TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.github.javafaker.Faker;

import PageObject.AddCustomer;
import PageObject.LoginPage;
import Utilities.ReadProperty;
import Utilities.XLUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	public XLUtils xl=new XLUtils();
	public ReadProperty rd=new ReadProperty();
	public AddCustomer ad;
	public LoginPage lp;
	public String base_urlBS=rd.getApplicationUrl();
	public String usernameBS=rd.getUsername();
	public String passwordBS=rd.getPassword();
	
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger=logger.getLogger("E-Commerce");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearUp()
	{
		driver.quit();
	}
	
	public String generateEmail()
	{
		Faker faker=new Faker();
		return faker.internet().emailAddress();
	}
	
	
//	@BeforeMethod
//	public void loginData()
//	{
//		driver.get(base_urlBS);
//		lp=new LoginPage(driver);
//		lp.setUsername(usernameBS);
//		logger.info("Enail id set");
//		lp.setPassword(passwordBS);
//		logger.info("Password set");
//		lp.clickLoginButton();
//		logger.info("click on login buuton");
//		
//		String expectedTitle="Dashboard / nopCommerce administration";
//		String actualTitile=driver.getTitle();
//		
//		if(expectedTitle.equals(actualTitile))
//		{
//			logger.info("Test case passed....");
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			logger.info("Test Case Failed......");
//			Assert.assertTrue(false);
//		}
//	}
}		
