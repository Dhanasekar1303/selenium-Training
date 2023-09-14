package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Gmail.feature", glue = "org.GmailStepdefinition", monochrome = true, dryRun = true)

public class GmailTestRunnerClass {

}
