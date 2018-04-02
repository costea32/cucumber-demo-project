package com.endava.soa.cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "com.endava.soa.cucumber.steps",
        tags = {"@Must,@Optional"},
//        tags = {"@Must","@Optional"},
        plugin = {"pretty", "html:target/cucumber"},
        dryRun = false)
public class DemoRun {
}
