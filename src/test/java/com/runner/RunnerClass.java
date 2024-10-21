package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", dryRun=false, glue = "com.step", plugin="json:jsonreport\\report.json")

public class RunnerClass {
	
	

}
