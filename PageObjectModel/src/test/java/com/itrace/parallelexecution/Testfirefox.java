package com.itrace.parallelexecution;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testfirefox {

	@Test
	public void firefox() throws MalformedURLException, InterruptedException {
		
		FirefoxOptions fOptions = new FirefoxOptions();
		fOptions.setCapability("OS", "Linux");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),fOptions);
		driver.get("https://ittuat.itradenetwork.net");
		Thread.sleep(4000);
		driver.quit();
	}
}
