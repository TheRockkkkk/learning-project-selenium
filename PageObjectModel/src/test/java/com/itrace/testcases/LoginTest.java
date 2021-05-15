package com.itrace.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.itrace.base.TestBase;
import com.itrace.pages.LoginPage;

public class LoginTest extends TestBase {
		

	@Test(description="sample test for login")
	public static void loginTest() throws InterruptedException{
		LoginPage loginPage = new LoginPage();

		try {	
			log.debug("Inside Login Test");
			loginPage.login();
			Thread.sleep(3000);
			log.debug("Login Successfully Executed");			

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	

}
