package com.itrace.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class GenericMethods {
	
	public static WebDriver driver;

	public GenericMethods(WebDriver webDriver){
		driver = webDriver;		
	}

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 30;
	public static String screenshotPath;


	public static WebElement getElement(By locator) {
		return driver.findElement(locator);		
	}

	/*public static void selectDropdownValue(By locator, String type, String value) {

		Select select = new Select(getElement(locator));

		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;

		default:
			System.out.println("Please pass the correct selection criteria...");
			break;
		}
	}*/

	public static WebElement presenceOfElementLoacated(By locator){
		WebDriver driver = LocalDriverManager.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;

	}

	public static WebElement elementToBeClickable(By locator){
		WebDriver driver = LocalDriverManager.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
	}

	//common method for Explicit wait to check element is visible or not
	public static void waitForElementVisible(WebElement element, long timeout) {

		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
		} catch (ElementNotVisibleException e) {
			Reporter.log(element.toString() + "is not visible");
			Reporter.log(e.getStackTrace().toString());
		}

	}


	//method is used for selecting value from dropdown
	public static void selectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}		
	//overload method to select dropdown value by index 
	public static void selectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}	
	//overload method to select dropdown value by value 
	public static void selectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}	
	
	//switch to a window
		public static void switchToWindow(String window)
		{
			try{
			driver.switchTo().window(window);
			}
			catch(Exception e)
			{
				
			}			
			
		}
		
		// get a arraylist of the windows
		public static List<String> getWindowsList()
		{
			List<String> myList = new ArrayList<String>();
			try{
			Set<String> mySet=driver.getWindowHandles();
			Iterator<String> itr = mySet.iterator();
	        
	        for(int i=0;i<mySet.size();i++){
	       	 myList.add(itr.next());
	       	 
	        }
			}
			catch(Exception e)
			{
				
			}
			return myList;
			
		}
		
		//get a set of the windows
		public static Set<String> getWindowsSet()
		{
			Set<String> mySet=driver.getWindowHandles();	      
			return mySet;			
		}
		
		//capture screenshot
		/*public static void takeScreenshot(WebDriver driver, String fileName) throws IOException{
	
			try{
				
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("/home/hiteshy/workspace/PageObjectModel/Screenshots"+fileName+".jpg"));
			}
			catch(Exception e) {
				System.out.println("Exception while taking screenshot" + e.getMessage());
		}*/
	//capture screenshot
	public static void captureScreenshot() throws Exception {
		try{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("./Screenshots/"+"screenshotName"+".png"));
		}
		catch(Exception e) {
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}
	}
		
}

