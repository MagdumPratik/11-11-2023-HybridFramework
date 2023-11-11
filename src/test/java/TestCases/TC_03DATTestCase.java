package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import Utilities.XLUtils;

public class TC_03DATTestCase extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void DATTestCase(String user, String pass)
	{
		lp=new LoginPage(driver);
		driver.get(base_urlBS);
		lp=new LoginPage(driver);
		lp.setUsername(user);
		logger.info("Enail id set");
		lp.setPassword(pass);
		logger.info("Password set");
		lp.clickLoginButton();
		logger.info("click on login buuton");
		
		String expectedTitle="Dashboard / nopCommerce administration";
		String actualTitile=driver.getTitle();
		
		if(expectedTitle.equals(actualTitile))
		{
			logger.info("Test case passed....");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test Case Failed......");
//			driver.close();
			Assert.assertTrue(false);
		}
	}
		
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String ExcelFilePath=".//LoginData.xlsx";
		int rowcount=XLUtils.getRowCount(ExcelFilePath, "Sheet1");
		int cellcount=XLUtils.getCellCount(ExcelFilePath, "Sheet1", 1);
		
		String[][] loginData=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int c=0;c<cellcount;c++)
			{
				loginData[i-1][c]=XLUtils.getCellData(ExcelFilePath, "Sheet1", i, c);
			}
		}
		return loginData;
	}
}	
