package com.itrace.parallelexecution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.itrace.testcases.LoginTest;

public class TestChrome {
	
	@Test
	public void chrome() throws MalformedURLException, InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("OS", "Linux");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),options);
		//driver.get("https://ittuat.itradenetwork.net");
		Thread.sleep(4000);
		driver.quit();
	}
}
