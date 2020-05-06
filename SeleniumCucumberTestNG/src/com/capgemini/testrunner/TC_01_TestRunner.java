package com.capgemini.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= {"F:\\AutomationSeleniumCucumberTestNG\\SeleniumCucumberTestNG\\Feature\\TC_01.feature"},
                 glue= {"com.capgemini.stepdefinition"},
                 plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
                 tags = "@0E",
                 dryRun = false,
                 monochrome=true
                 )
public class TC_01_TestRunner extends AbstractTestNGCucumberTests {
   
}

