package com.itrace.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.itrace.testcases.LocalDriverManager;
import com.itrace.util.TestUtil;

public class DriverFactory {

	public static WebDriver driver = LocalDriverManager.getDriver();

	public static WebDriver createInstance(String browserName)  {

		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/home/hiteshy/workspace/PageObjectModel/Library/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "/home/hiteshy/workspace/PageObjectModel/Library/geckodriver");
			driver = new FirefoxDriver();
		}	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		return driver;
	}


}
