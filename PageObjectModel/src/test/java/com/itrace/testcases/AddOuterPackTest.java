package com.itrace.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.itrace.base.TestBase;
import com.itrace.pages.GrowerPage;
import com.itrace.pages.OuterPackPage;

public class AddOuterPackTest extends TestBase {

	@Test(invocationCount = 10)
	public void addNewOuterPack() throws InterruptedException{
		OuterPackPage outerPackPage = new OuterPackPage();

		try {	
			log.debug("Inside AddGrower Test");
			LoginTest.loginTest();
			outerPackPage.addOuterPack();
			Thread.sleep(2000);
			log.debug("Grower created successfully");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
