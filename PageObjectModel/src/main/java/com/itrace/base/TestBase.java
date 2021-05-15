package com.itrace.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.itrace.util.ExtentReport;
import com.itrace.util.GenericMethods;
import com.itrace.util.LocalDriverManager;

import org.apache.log4j.*;

public class TestBase {

    public ExtentReport report;
    WebDriver driver;
	public static Logger log = Logger.getLogger("devpenoylogger");
	//implement sl4j logger
	@BeforeSuite
	public void getPropertiesFile() throws URISyntaxException, IOException {
		
		Properties prop = null;
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com"
					+ "/itrace/config/config.properties");
			prop.load(ip);	
			log.debug("Properties file loaded !!!");
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
		GenericMethods gmGenericMethods = new GenericMethods(driver);
	}
	
	    @AfterMethod(alwaysRun = true)
	    public void closeBrowser() throws IOException {
	        driver.close();

	    }
		/*
	    @AfterSuite(alwaysRun = true)
	    public void generateExcelReport() throws Throwable {
	    }*/
    @AfterSuite
    public void closeDriver(){
    	driver.quit();
    	log.debug("Test execution completed !!!");

    }
    
    /*
    config.properties file workflow
	We have a configuration.properties file. Java has Properties class and load() method, this load() method will help to load the config file. It has one get() method which help us to get the value from config.prop file. Properties class can't read the file directly then we need to take help of "File" class or BufferReader. The file calss or Buffer Reader helps to get the file path only and provide it to Properties class. Property class will load it and convert it into a HashMap, then we need to pass the key name and get the value.
    }*/

}