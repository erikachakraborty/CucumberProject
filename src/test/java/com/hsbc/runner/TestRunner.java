package com.hsbc.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/features",
 glue= {"com.hsbc.stepdefinition"},
 tags = {"@Trade"},
 format={"pretty","html:target/cucumber-reports/cucumber-html-reports", 
		 "json:target/cucumber-reports/cucumber-html-reports/common.json"},
 monochrome = true
 )

public class TestRunner {
	
	
} 