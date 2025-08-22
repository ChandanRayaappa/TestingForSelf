package com.Automation.pageObejct;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
    private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();
    private static ExtentReports extent = ExtentManager.getExtentReports();

    public static ExtentTest getTest() {
        return testThread.get();
    }

    public static ExtentTest startTest(String testName, String description) {
        ExtentTest test = extent.createTest(testName, description);
        testThread.set(test);
        return test;
    }

    public static void flush() {
        extent.flush();
    }
}