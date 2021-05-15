package com.itrace.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.itrace.base.TestBase;
import com.itrace.pages.InnerPackPage;

public class AddInnerPackTest extends TestBase{

	
	@Test(description="sample test for AddInnerPack")
	public void associateItemwithPastHarvestDate() throws InterruptedException{
		InnerPackPage gpage = new InnerPackPage();

		try {	
			log.debug("Inside AddGrower Test");
			LoginTest.loginTest();
			gpage.addInnerPack();
			Thread.sleep(2000);
			log.debug("Grower created successfully");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
