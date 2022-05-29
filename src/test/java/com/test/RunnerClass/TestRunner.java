package com.test.RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Automation\\BDD_Automation_UI\\src\\test\\java\\com\\test\\features\\",
        glue = {"com/test/glueCode"},
        		dryRun = false,
        		monochrome = true,
        	    plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class TestRunner {

}
