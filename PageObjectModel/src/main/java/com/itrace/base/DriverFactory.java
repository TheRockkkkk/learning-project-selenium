package com.itrace.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itrace.util.GenericMethods;
import com.itrace.util.LocalDriverManager;

public class DriverFactory {

	public static WebDriver driver = LocalDriverManager.getDriver();

	public static WebDriver createInstance(String browserName)  {

		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + LocalDriverManager.getPropertiesFileObject().getProperty("chrome.driver.path"));
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + LocalDriverManager.getPropertiesFileObject().getProperty("firefox.driver.path"));
			driver = new FirefoxDriver();
		}	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(GenericMethods.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GenericMethods.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		return driver;
	}


}
