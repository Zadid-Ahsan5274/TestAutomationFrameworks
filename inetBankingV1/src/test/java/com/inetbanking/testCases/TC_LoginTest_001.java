package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		logger.info("Launching URL");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Provided Username");
		lp.setPassword(password);
		logger.info("Provided Password");
		lp.clickSubmit();
		logger.info("Clicking Submit");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage1234")) {
			Assert.assertTrue(true);
			logger.info("Title Matched -- Login Test Passed");
		}else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Title Not Matched -- Login Test Failed");
		}
	}

}
