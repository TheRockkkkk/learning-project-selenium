package com.itrace.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.itrace.base.TestBase;
import com.itrace.pages.GrowerPage;

public class AddGrowerTest extends TestBase{
	
	@Test(invocationCount = 10)
	public void associateItemwithPastHarvestDate() throws InterruptedException{
		GrowerPage gpage = new GrowerPage();

		try {	
			log.debug("Inside AddGrower Test");
			LoginTest.loginTest();
			gpage.addGrower();
			Thread.sleep(2000);
			log.debug("Grower created successfully");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
