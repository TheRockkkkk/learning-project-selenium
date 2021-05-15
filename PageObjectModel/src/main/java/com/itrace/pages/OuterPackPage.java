package com.itrace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.itrace.util.LocalDriverManager;
import com.itrace.util.VerifyRandomMethods;

public class OuterPackPage {

	
	private WebDriver driver = LocalDriverManager.getDriver();

	By settingsBtn = By.xpath("//top-menu//button//span[contains(.,'settings')]/..");
	By prodMgmtMenuOption = By.xpath("//button//span[contains(.,'Product Management')]/..");
	By outerPackLink = By.xpath("//li//span[contains(text(),'Outer Packs')]/..");
	By addOuterPackBtn = By.xpath("//button//span[contains(text(),'Add Outer Pack')]/..");
	By outerPackNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'name')]");
	By shortNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'shortName')]");	
	By codeField = By.xpath("//mat-dialog-content//input[@formcontrolname='code']");
	By createNewOuterPackBtn = By.xpath("//mat-dialog-content/following-sibling::mat-dialog-actions//button//span[text()='CREATE']/..");

	
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
	public void outerPackLink() throws InterruptedException{
		WebElement outerPackLink = driver.findElement(this.outerPackLink);
		Thread.sleep(2000);
		outerPackLink.click();
	}
	public void addOuterPackBtn() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.addOuterPackBtn);
		Thread.sleep(2000);
		productMenuOption.click();
	}
	public void outerPackNameField() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.outerPackNameField);
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
	public void createNewOuterPackBtn() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.createNewOuterPackBtn);
		Thread.sleep(2000);
		productMenuOption.click();
	}
	
public void addOuterPack() throws InterruptedException  {
		
		settingsBtn();
		prodMgmtMenuOption();
		outerPackLink();
		addOuterPackBtn();
		outerPackNameField();
		shortNameField();
		codeField();
		createNewOuterPackBtn();
		
	}
	
}
