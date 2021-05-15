package com.itrace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.itrace.util.LocalDriverManager;

public class AssociateItemPage {

	private WebDriver driver = LocalDriverManager.getDriver();

	By applicationTab = By.xpath("(//span[@class='mat-button-wrapper'])[3]");
	By itemDropdown = By.xpath("//button[contains(@class,'mat-menu-item')]//span[contains(text(),'Item')]");
	By associateItemsText = By.xpath("//h3[contains(text(),'Associate Items')]");
	By harvestDateCalender = By.xpath("(//button[@class='mat-icon-button mat-button-base'])[1]");
	By pastHarvestDate = By.xpath("(//div[contains(@class,'mat-calendar-body-cell-content')])[1]");
	By lotInputBox   = By.xpath("//input[@type= 'text'][@placeholder='Scan or filter by lot name or crop']");
	By searchLotInputBox = By.xpath("(//input[@type= 'text'][@placeholder='Scan or filter by lot name or crop'])[2]");
	By selectLotValue  = By.xpath("(//div[@class='option-wrap'])[1]");
	By selectHarvesterDropdown = By.xpath("//mat-select[@formcontrolname='harvesterId']");
	By harvestDropdownValue = By.xpath("(//mat-option[@class='mat-option ng-star-inserted'])[2]");
	
	public void clickApplicationTab() throws InterruptedException{
		WebElement applicationTab = driver.findElement(this.applicationTab);
		Thread.sleep(3000);
		applicationTab.click();
	}
	public void clickItemDropdown() throws InterruptedException{
		WebElement itemDropdown = driver.findElement(this.itemDropdown);
		Thread.sleep(4000);
		itemDropdown.click();
	}
	public void verifyAssociateItemPageText(){
		WebElement pageText = driver.findElement(this.associateItemsText);
		String ActualText = pageText.getText();
		System.out.println(ActualText);
		String ExpectedText = "Associate Items";
		Assert.assertEquals(ExpectedText, ActualText);
	}
	public void clickCalendar() throws InterruptedException{
		WebElement calendar = driver.findElement(this.harvestDateCalender);
		Thread.sleep(3000);
		calendar.click();
	}
	public void selectPastHarvestDate(){
		WebElement pastHarvestDate = driver.findElement(this.pastHarvestDate);
		pastHarvestDate.click();
	}
	public void clickLotInputBox(){
		WebElement lotInputBox = driver.findElement(this.lotInputBox);
		lotInputBox.click();
	}
	public void selectLotValue(){
		WebElement selectLotValue = driver.findElement(this.selectLotValue);
		selectLotValue.click();
	}
	
	public void associateItemWithPastHarvestDate() throws InterruptedException  {
		//driver.get(LocalDriverManager.getPropertiesFileObject().getProperty("url"));
		clickApplicationTab();
		clickItemDropdown();
		verifyAssociateItemPageText();
		clickCalendar();
		selectPastHarvestDate();
		//TestUtil.selectByIndex(locator, index);
		clickLotInputBox();
		selectLotValue();
		//GenericMethods.selectDropdownValue(selectHarvesterDropdown, DropDown.INDEX.toString(), "2");
		
	}

	
}
