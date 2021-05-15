package com.itrace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.itrace.util.LocalDriverManager;
import com.itrace.util.VerifyRandomMethods;

public class GrowerPage {
	
	private WebDriver driver = LocalDriverManager.getDriver();

	By settingsBtn = By.xpath("//top-menu//button//span[contains(.,'settings')]/..");
	By prodMgmtMenuOption = By.xpath("//button//span[contains(.,'Product Management')]/..");
	By sizesLink = By.xpath("//li//span[contains(text(),'Sizes')]/..");
	By addSizeBtn = By.xpath("//button//span[contains(text(),'Add Size')]/..");
	By sizeNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'name')]");
	By shortNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'shortName')]");
	By codeField = By.xpath("//mat-dialog-content//input[@formcontrolname='code']");
	By createNewSizeBtn = By.xpath("//mat-dialog-content/following-sibling::mat-dialog-actions//button//span[text()='CREATE']/..");
	
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
	public void sizesLink() throws InterruptedException{
		WebElement applicationTab = driver.findElement(this.sizesLink);
		Thread.sleep(1000);

		applicationTab.click();
	}
	public void addSizeBtn() throws InterruptedException{
		WebElement applicationTab = driver.findElement(this.addSizeBtn);
		Thread.sleep(1000);
		applicationTab.click();
	}
	public void sizeNameField() throws InterruptedException{
		WebElement applicationTab = driver.findElement(this.sizeNameField);
		Thread.sleep(2000);

		applicationTab.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void shortNameField() throws InterruptedException{
		WebElement applicationTab = driver.findElement(this.shortNameField);
		applicationTab.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void codeField() throws InterruptedException{
		WebElement applicationTab = driver.findElement(this.codeField);
		Thread.sleep(1000);

		applicationTab.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void createNewSizeBtn() throws InterruptedException{
		WebElement applicationTab = driver.findElement(this.createNewSizeBtn);
		Thread.sleep(1000);

		applicationTab.click();
	}

	public void addGrower() throws InterruptedException  {
		
		settingsBtn();
		prodMgmtMenuOption();
		sizesLink();
		addSizeBtn();
		sizeNameField();
		shortNameField();
		codeField();
		createNewSizeBtn();
		
	}
}
