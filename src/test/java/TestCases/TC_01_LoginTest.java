package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_01_LoginTest extends BaseClass{

	@Test
	public void loginTest()
	{
		driver.get(base_urlBS);
		lp=new LoginPage(driver);
		lp.setUsername(usernameBS);
		logger.info("Enail id set");
		lp.setPassword(passwordBS);
		logger.info("Password set");
		lp.clickLoginButton();
		logger.info("click on login buuton");
		
		String expectedTitle="Dashboard / nopCommerce administration";
		String actualTitile=driver.getTitle();
		
		if(expectedTitle.equals(actualTitile))
		{
			logger.info("Test case passed....");
			lp.clickLogoutButton();
			logger.info("Successfully looged off");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test Case Failed......");
			Assert.assertTrue(false);
		}
	}
}
