package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	
	@Test
	public void loginBankManager() throws InterruptedException
	{
		log.debug("inside login testcase");
		
		driver.findElement(By.cssSelector(OR.getProperty("bmlbtn"))).click();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "Login successful");
		log.debug("login successfully");
		


		
	}



}
