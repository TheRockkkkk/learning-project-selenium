package com.itrace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.itrace.util.LocalDriverManager;
import com.itrace.util.VerifyRandomMethods;

public class AddCropPage {

	private WebDriver driver = LocalDriverManager.getDriver();
	String cropNameString = VerifyRandomMethods.randPOName();

	By settingsBtn = By.xpath("//*[text()='settings']");
	By prodMgmtMenuOption = By.xpath("//button//span[contains(.,'Product Management')]/..");
	By cropLink = By.xpath("//li//span[contains(text(),'Crops')]/..");
	By addCropBtn = By.xpath("//button//span[contains(text(),'Add Crop')]/..");
	By cropNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'name')]");
	By shortNameField = By.xpath("//mat-dialog-content//input[contains(@formcontrolname,'shortName')]");
	By codeField = By.xpath("//mat-dialog-content//input[@formcontrolname='code88']");
	By createNewCropBtn = By.xpath("//mat-dialog-content/following-sibling::mat-dialog-actions//button//span[text()='CREATE']/..");
	By findCropSearchBox = By.xpath("//input[contains(@placeholder, 'Find Crop')]");
	By elipsesClick = By.xpath("(//mat-icon[text()='more_horiz'])[2]");
	By viewDetails = By.xpath("//span[text()=' View Details']");
	By editCropName = By.xpath("//input[contains(@formcontrolname,'name')]");
	By saveBtn = By.xpath("//span[text()='Save']");
	By saveChangeBtn = By.xpath("//button//span[text()=' SAVE CHANGES ']");

	/*public void settingsBtn() throws InterruptedException{
		WebElement settingsButton = null;
		int counter = 0;
		while(counter<10){
			try{
				settingsButton = GenericMethods.presenceOfElementLoacated(this.settingsBtn);
				settingsButton.click();
				break;
			}
			catch(Exception e){
				Thread.sleep(500);
				counter++;
			}
		}
	}*/
	public void settingsButton() throws InterruptedException{
		WebElement settingbtnElement = driver.findElement(this.settingsBtn);
		Thread.sleep(2000);
		settingbtnElement.click();
	}
	public void prodMgmtMenuOption() throws InterruptedException{
		WebElement productMenuOption = driver.findElement(this.prodMgmtMenuOption);
		Thread.sleep(2000);
		productMenuOption.click();
	}
	public void cropLink() throws InterruptedException{
		WebElement cropLinkElement = driver.findElement(this.cropLink);
		Thread.sleep(2000);
		cropLinkElement.click();
	}
	public void addCropBtn() throws InterruptedException{
		WebElement addCropBtnElement = driver.findElement(this.addCropBtn);
		Thread.sleep(2000);
		addCropBtnElement.click();
	}
	public void cropNameField() throws InterruptedException{
		WebElement cropNameFieldElement = driver.findElement(this.cropNameField);
		Thread.sleep(2000);

		cropNameFieldElement.sendKeys(cropNameString);
	}
	public void shortNameField() throws InterruptedException{
		WebElement shortNameFieldElement = driver.findElement(this.shortNameField);
		shortNameFieldElement.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void codeField() throws InterruptedException{
		WebElement codeFieldElement = driver.findElement(this.codeField);
		codeFieldElement.sendKeys(VerifyRandomMethods.randPOName());
	}
	public void createNewCropBtn() throws InterruptedException{
		WebElement addNewBtnElement = driver.findElement(this.createNewCropBtn);
		addNewBtnElement.click();
	}
	public void cropSearchInputField() throws InterruptedException {
		WebElement croppSearchBoxElement = driver.findElement(this.findCropSearchBox);
		croppSearchBoxElement.sendKeys(cropNameString);
	}
	public void clickOnElipses() throws InterruptedException {
		WebElement elipsesClickElement = driver.findElement(this.elipsesClick);
		Thread.sleep(2000);
		elipsesClickElement.click();		
	}
	public void clickOnViewDetailsBtn() throws InterruptedException {
		WebElement viewDetailsBtnElement = driver.findElement(this.viewDetails);
		Thread.sleep(2000);
		viewDetailsBtnElement.click();		
	}
	public void editNameField() throws InterruptedException{
		WebElement cropNameFieldElement = driver.findElement(this.editCropName);
		cropNameFieldElement.clear();
		cropNameFieldElement.sendKeys("Auto" + cropNameString);
	}
	public void clickOnSaveChangesBtn() throws InterruptedException {
		WebElement saveChangesBtnElement = driver.findElement(this.saveChangeBtn);
		saveChangesBtnElement.click();		
	}
	

	public void addCrop() throws InterruptedException  {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		settingsButton();
		prodMgmtMenuOption();	
		cropLink();
		addCropBtn();
		cropNameField();
		codeField();
		shortNameField();
		createNewCropBtn();
		Thread.sleep(3000);

	}

	public void editCrop() throws InterruptedException {

		cropSearchInputField();
		clickOnElipses();
		clickOnViewDetailsBtn();
		editNameField();
		clickOnSaveChangesBtn();		

	}
}
