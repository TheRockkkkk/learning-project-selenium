package com.itrace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.itrace.util.LocalDriverManager;
import com.itrace.util.VerifyRandomMethods;

public class InnerPackPage {
	
	private WebDriver driver = LocalDriverManager.getDriver();

	By settingsBtn = By.xpath("//top-menu//button//span[contains(.,'settings')]/..");
	By prodMgmtMenuOption = By.xpath("//button//span[contains(.,'Product Management')]/..");	
	By innerPackLink = By.xpath("//li//span[contains(text(),'Inner Packs')]/..");
	By addInnerPackBtn = By.xpath("//button//span[contains(text(),'Add Inner Pack')]/..");
	By innerPackNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'name')]");
	By shortNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'shortName')]");
	By codeField = By.xpath("//mat-dialog-content//input[@formcontrolname='code']");
	By createNewInnerPackBtn = By.xpath("//mat-dialog-content/following-sibling::mat-dialog-actions//button//span[text()='CREATE']/..");
	By createInnerPackTooltip = By.xpath("//simple-snack-bar//span[contains(text(),'Inner Pack Imported Successfully')]");
	
	public void settingsBtn() throws InterruptedException{
		WebElement settingsButton = driver.findElement(this.settingsBtn);
		Thread.sleep(2000);
		settingsButton.click();
	}
	public void prodMgmtMenuOption() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.prodMgmtMenuOption);
		Thread.sleep(2000);
		productMenuOption.click();
	}
	public void innerPackLink() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.innerPackLink);
		Thread.sleep(2000);
		productMenuOption.click();
	}
	public void addInnerPackBtn() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.addInnerPackBtn);
		Thread.sleep(2000);
		productMenuOption.click();
	}
	public void innerPackNameField() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.innerPackNameField);
		Thread.sleep(2000);
		productMenuOption.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void shortNameField() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.shortNameField);
		Thread.sleep(2000);
		productMenuOption.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void codeField() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.codeField);
		Thread.sleep(2000);
		productMenuOption.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void createNewInnerPackBtn() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.createNewInnerPackBtn);
		Thread.sleep(2000);
		productMenuOption.click();
	}
	public void verifyInnerPackTooltip() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.createInnerPackTooltip);
		//Thread.sleep(2000);
		String expectedTextString = "Inner Pack Imported Successfully";
		String actual = productMenuOption.getText();
		Assert.assertEquals(actual, expectedTextString);
	}
	
public void addInnerPack() throws InterruptedException  {
		
		settingsBtn();
		prodMgmtMenuOption();
		innerPackLink();
		addInnerPackBtn();
		innerPackNameField();
		shortNameField();
		codeField();
		createNewInnerPackBtn();
		verifyInnerPackTooltip();
		
	}

}
