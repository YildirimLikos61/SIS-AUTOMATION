package com.neotech.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
		
				features = "src/test/resources/features/",
				glue = "com.neotech.steps",
				dryRun =false,
				tags = "@Addteacher",
				monochrome = true,
				
				
			plugin = 
					{
					//"pretty",
					"html:target/cucumber-default-report.html",
					"json:target/cucumber.json",
					"rerun:target/failed.txt"
					}
				   


)






public class TestRunner {

}
