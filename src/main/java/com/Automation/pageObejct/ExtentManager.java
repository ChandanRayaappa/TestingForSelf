package com.Automation.pageObejct;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("target/extent-report.html");
            spark.config().setDocumentTitle("Automation Report");
            spark.config().setReportName("Cucumber Test Results");

          
            
            spark=new ExtentSparkReporter("./extentReport/extentReport.html");
    		spark.config().setDocumentTitle("DocumentTitle");
    		spark.config().setTheme(Theme.DARK);
    		spark.config().setReportName("ReportName");
    	
    		
    		extent = new ExtentReports();
    		extent.attachReporter(spark);
    		extent.setSystemInfo("Environment", "TestNG environment");
    		extent.setSystemInfo("ReporterName", "Chandan_Rayappa ");
    		extent.setSystemInfo("Platform", "Windows 11");
    		extent.setSystemInfo("UnitTesting Tool", " TESTNG");
    		extent.setSystemInfo("Build management Tool", "Maven");
    		extent.setSystemInfo("AutomationTool", "Selenium ");
    		
    		
        }
        return extent;
    }
}