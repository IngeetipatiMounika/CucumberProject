package com.capgemini.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"F:\\AutomationSeleniumCucumberTestNG\\SeleniumCucumberTestNG\\Feature\\TC_02.feature"},
                 glue = {"com.capgemini.stepdefinition"}, 
		         plugin = {"pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json"},
		         tags= {"@1E"},
	             dryRun = false,
		         monochrome = true
                 )
public class TC_02_TestRunner extends AbstractTestNGCucumberTests{

}
