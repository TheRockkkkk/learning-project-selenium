package com.itrace.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.itrace.testcases.LocalDriverManager;
import com.itrace.util.TestUtil;

public class TestBase {

    public ExtentReports report;
    WebDriver driver;

	@BeforeSuite
	public void getPropertiesFile() throws URISyntaxException, IOException {
		
		Properties prop = null;

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/home/hiteshy/workspace/PageObjectModel/src/main/java/com"
					+ "/itrace/config/config.properties");
			prop.load(ip);		
			LocalDriverManager.setPropertiesFileObject(prop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
    @Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void setupBrowser(String browserName)  {    	
    	
    	driver = DriverFactory.createInstance(browserName);
		LocalDriverManager.setWebDriver(driver);
	}
	
		/*@Parameters("platform")
	    @AfterMethod(alwaysRun = true)
	    public void closeBrowser(@Optional String platform) throws IOException {
	    }

	    @AfterSuite(alwaysRun = true)
	    public void generateExcelReport() throws Throwable {
	    }*/
    @AfterSuite
    public void closeDriver(){
    	driver.quit();
    }


}