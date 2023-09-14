package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", dryRun = false, monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {
		"html:Reort", "Junit:Reort\\JunitReport.xml", "Json:Reort\\JsonReport.json" })

public class TestRunnerClassicici {

}
