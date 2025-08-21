package com.Automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public  static WebDriver driver;
    protected static ConfigReader config;

    public void setUp() {
//        config = new ConfigReader();
//        driver = DriverFactory.initDriver(config.getBrowser());
    	driver=new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get(config.getAppUrl());
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
