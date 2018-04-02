package com.endava.soa.cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com.endava.soa.cucumber.steps"},
       // tags = {"@Must","@Optional"}
       //tags = {"~@Must"},
        plugin = {"json:target/cucumber1.json"}
)
public class DemoRun {
}
