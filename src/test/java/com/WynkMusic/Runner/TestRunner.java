package com.WynkMusic.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	
@CucumberOptions(features = "src/test/resources/features", // Specify the path to your feature files
		glue = { "com.WynkMusic.StepDefintions" }, // Specify the package where your step definitions are located
		tags = "@WynkMusicTest", // Specify the tags if you want to run only specific scenarios
		plugin = { "pretty", "html:target/cucumber-reports" } // Specify the desired output formats
)
public class TestRunner extends AbstractTestNGCucumberTests  {
	// This class will be empty
}
