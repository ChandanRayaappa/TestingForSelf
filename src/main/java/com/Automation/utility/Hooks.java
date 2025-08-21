package com.Automation.utility;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    // Runs once before each scenario
    @Before(order = 0)
    public void launchBrowser(Scenario scenario) {
        System.out.println("====[ BEFORE SCENARIO ]====");
        System.out.println("Starting Scenario: " + scenario.getName());
        setUp();
    }

    // Optional: Additional setup with higher order (executes after lower order)
    @Before(order = 1)
    public void logBeforeScenario() {
        System.out.println("Setting up test data / context...");
    }

    // Runs before each step
    @BeforeStep
    public void beforeEachStep(Scenario scenario) {
        System.out.println("----[ BEFORE STEP ]---- " + scenario.getName());
    }

    // Runs after each step
    @AfterStep
    public void afterEachStep(Scenario scenario) {
        System.out.println("----[ AFTER STEP ]---- " + scenario.getName());
    }

    // Optional: Additional teardown before the main teardown
    @After(order = 1)
    public void logAfterScenario(Scenario scenario) {
        System.out.println("Completed Scenario: " + scenario.getName());
        System.out.println("Status: " + scenario.getStatus());
    }

    // Runs once after each scenario
    @After(order = 0)
    public void closeBrowser() {
        System.out.println("====[ AFTER SCENARIO ]====");
        tearDown();
    }
}
