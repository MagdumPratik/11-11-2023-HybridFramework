package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AddCustomer;
import PageObject.LoginPage;

public class TC_02_AddCiustomer extends BaseClass{
		
	@Test
	public void addCustomer() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ad=new AddCustomer(driver);
		ad.clickCustomerList();
		logger.info("click on customner 1");
		ad.clickCustomerList2();
		logger.info("click on customner 2");
		ad.clickAddNewCustomer();
		logger.info("click on Add cusomer");
		ad.setEmail(generateEmail());
		logger.info("Email set");
		ad.addPAsssword("Gmail@123");
		logger.info("Password set");
		ad.addFirstName("Pratik");
		logger.info("Firstname  set");
		ad.addLastName("Magadum");
		logger.info("LastNAme set");
		ad.Gender_Male();
		logger.info("Male gender set");
		ad.addDateOfBirth("12/12/1998");
		logger.info("Date set");
		ad.addCompany("Pratik.private");
		logger.info("CompanyName set");
		ad.clickIsTaxExempt();
		logger.info("tax clicked");
		ad.managerofVendor("Vendor 1");
		logger.info("Vendor set");
		ad.clickActive();
		logger.info("clicked on activer");
		ad.addAdminComment("This is first customer");
		ad.clicksave();
		Thread.sleep(4000);
		String expectedsuccessMSG="The new customer has been added successfully.";
		String actualSuccessMSG=ad.getsuccessMsg();
		logger.info(actualSuccessMSG);
		if(expectedsuccessMSG.equals(actualSuccessMSG))
		{
			logger.info("Test Case Passed............");
			lp.clickLogoutButton();
			Thread.sleep(2000);
			logger.info(driver.getTitle());
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test Case Failed........");
			Assert.assertTrue(false);
		}
		
	}
}
