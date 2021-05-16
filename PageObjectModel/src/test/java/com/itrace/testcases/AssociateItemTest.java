package com.itrace.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.itrace.base.TestBase;
import com.itrace.pages.AssociateItemPage;
import com.itrace.util.GenericMethods;
import com.itrace.util.LocalDriverManager;

public class AssociateItemTest extends TestBase{

	
	public static WebDriver driver = LocalDriverManager.getDriver();

	@Test(description="sample test for login")
	public void associateItemwithPastHarvestDate() throws InterruptedException{
		AssociateItemPage associateItem = new AssociateItemPage();

		try {	
			log.debug("Inside Associate Test");
			LoginTest.loginTest();
			associateItem.associateItemWithPastHarvestDate();
			Thread.sleep(2000);
			log.debug("Item associated with past harvest date");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
