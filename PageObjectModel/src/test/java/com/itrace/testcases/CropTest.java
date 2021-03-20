package com.itrace.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.itrace.base.TestBase;
import com.itrace.pages.CropPage;
import com.itrace.pages.LoginPage;

public class CropTest extends TestBase{

	CropPage createCrop;

	
	@Test
	public void addCrop() throws InterruptedException {	
		//Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		createCrop = PageFactory.initElements(driver, CropPage.class);
		createCrop.addNewCrop();
	}
	
	
}
