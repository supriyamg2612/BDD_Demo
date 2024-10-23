package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features   = "src/main/java/com/features",
		glue       = "com.stepdefination",
		plugin     = "html:target",
		monochrome = true,
		dryRun     = false,
		tags = {"@login, @Title , @logo"}
		
		
		
)

public class TestRunner {

}
