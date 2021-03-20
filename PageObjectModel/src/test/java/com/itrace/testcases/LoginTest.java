package com.itrace.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.itrace.base.TestBase;
import com.itrace.pages.LoginPage;

public class LoginTest extends TestBase {
		
		
	@Test(description="sample test for login")
	public void loginTest() throws InterruptedException{
		LoginPage loginPage = new LoginPage();

		try {				
			loginPage.login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
