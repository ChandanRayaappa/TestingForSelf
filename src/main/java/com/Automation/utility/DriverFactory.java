package com.Automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import other browsers as needed

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                // driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Browser not supported: " + browser);
        }
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
