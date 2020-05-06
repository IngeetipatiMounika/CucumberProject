package com.capgemini.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"F:\\AutomationSeleniumCucumberTestNG\\SeleniumCucumberTestNG\\Feature\\TC_03.feature"},
                 glue = {"com.capgemini.stepdefinition"}, 
                 plugin = {"pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json"},
                 tags="@2E",
                 dryRun = false,
                 monochrome = true
                 )
public class TC_03_TestRunner  extends AbstractTestNGCucumberTests{

}
