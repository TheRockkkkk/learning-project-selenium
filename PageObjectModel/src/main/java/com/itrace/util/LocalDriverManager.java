package com.itrace.util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class LocalDriverManager {

    private static InheritableThreadLocal<Properties> properties = new InheritableThreadLocal<Properties>();	
	private static InheritableThreadLocal<WebDriver> webDriver = new InheritableThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        // System.out.println("Thread hash code at local" + Thread.class.hashCode());
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
        
    public static Properties getPropertiesFileObject() {
        return properties.get();
    }

    public static void setPropertiesFileObject(Properties propFileObject) {
        properties.set(propFileObject);
    }
}
