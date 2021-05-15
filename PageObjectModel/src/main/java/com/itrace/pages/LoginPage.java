package com.itrace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.itrace.base.DriverFactory;
import com.itrace.util.LocalDriverManager;

public class LoginPage {
	
	private WebDriver driver = LocalDriverManager.getDriver();
	
	By username = By.name("username");
	By password = By.name("password");
	By logonBtn = By.xpath("//button[@type='submit']");
	
	public void enterUserName() {
		WebElement usernameElement = driver.findElement(this.username);
		usernameElement.sendKeys(LocalDriverManager.getPropertiesFileObject().getProperty("username"));
	}
	
	public void enterPassword() {
		WebElement passwElement = driver.findElement(this.password);
		passwElement.sendKeys(LocalDriverManager.getPropertiesFileObject().getProperty("password"));
	}
	
	public void clickSubmitBtn() {
		WebElement logonBtn = driver.findElement(this.logonBtn);
		logonBtn.click();
	}
				
	public void login()  {
		driver.get(LocalDriverManager.getPropertiesFileObject().getProperty("url"));
		enterUserName();
		enterPassword();
		clickSubmitBtn();
	}
	

}
