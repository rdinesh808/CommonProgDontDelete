package com.cucumber.learn;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                 dryRun = false,
		         features = "../CommonProgramFileRead/Feature/Feature",
		         glue = "com.cucumber.learn")
public class CucumberRunner {

}
