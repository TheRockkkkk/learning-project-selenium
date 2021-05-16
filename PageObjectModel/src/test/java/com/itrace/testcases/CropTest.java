package com.itrace.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.itrace.base.TestBase;
import com.itrace.pages.AddCropPage;
import com.itrace.util.GenericMethods;
import com.itrace.util.LocalDriverManager;


public class CropTest extends TestBase{

	public static WebDriver driver = LocalDriverManager.getDriver();
	
	

	@Test()
	public void addCrop() throws Exception{
		AddCropPage cropPage = new AddCropPage();

		try {	
			log.debug("Inside Crop Test");
			LoginTest.loginTest();
			//GenericMethods.captureScreenshot(driver, "abv");
			cropPage.addCrop();
			Thread.sleep(2000);
			log.debug("Crop created successfully");
			//cropPage.editCrop();

		} catch (Exception e) {
			GenericMethods.captureScreenshot();
			//TakesScreenshot screenshot = (TakesScreenshot)driver;
			//FileHandler.copy(screenshot.getScreenshotAs(OutputType.FILE), new File("/home/hiteshy/workspace/PageObjectModel/Screenshots/hitesh.png"));
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	
		
}
