package com.itrace.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itrace.base.TestBase;

public class CropPage extends TestBase {
	
	//Page Factory - Object Repository
		@FindBy(xpath = "//top-menu//button//span[contains(.,'settings')]/..")
		WebElement settingsBtn;
		
		@FindBy(xpath = "//button//span[contains(.,'Product Management')]/..")
		WebElement prodMgmtMenuOption;
		
		@FindBy(xpath = "//button//span[contains(.,'Personnel')]/..")
		WebElement personnelMenuOption;
		
		@FindBy(xpath = "//li//span[contains(text(),'Crops')]/..")
		WebElement cropLink;
		
		public CropPage(){
		//	PageFactory.initElements(driver, this);
		}
		
		/*public WebElement settingsBtn(){
			return settingsBtn;
		}
		
		public WebElement prodMgmtMenuOption(){
			return prodMgmtMenuOption;
		}
		
		
		public WebElement cropLink(){
			return cropLink;
		}*/

		public void addNewCrop() throws InterruptedException {
			Thread.sleep(4000);

			settingsBtn.click();
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
			prodMgmtMenuOption.click();
			cropLink.click();
						
		}

}
