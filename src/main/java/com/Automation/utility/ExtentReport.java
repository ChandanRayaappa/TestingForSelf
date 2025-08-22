package com.Automation.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentReports extentreport() {
	 spark=new ExtentSparkReporter("./extentReport/extentReport.html");
		spark.config().setDocumentTitle("DocumentTitle");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("ReportName");
	
		
		 report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Environment", "TestNG environment");
		report.setSystemInfo("ReporterName", "Chandan_Rayappa ");
		report.setSystemInfo("Platform", "Windows 11");
		report.setSystemInfo("UnitTesting Tool", " TESTNG");
		report.setSystemInfo("Build management Tool", "Maven");
		report.setSystemInfo("AutomationTool", "Selenium ");
		return report;
	}
	
	public static void testStepHandle(String teststatus,WebDriver driver,ExtentTest extenttest,Throwable throwable) {
		switch (teststatus) {
		case "FAIL":		
			extenttest.fail(MarkupHelper.createLabel("Test Case is Failed : ", ExtentColor.RED));			
			
			
			
			if (driver != null) {
				driver.quit();
			}		
		break;
		
		case "PASS":			
			extenttest.pass(MarkupHelper.createLabel("Test Case is Passed : ", ExtentColor.GREEN));
			break;
			
		default:
			break;
		}
}}
