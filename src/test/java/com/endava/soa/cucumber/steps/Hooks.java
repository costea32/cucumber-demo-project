package com.endava.soa.cucumber.steps;

import com.endava.soa.cucumber.ScenarioContext;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks {

    @Before()
    public void beforeHook(Scenario scenarioObj){
        ScenarioContext.getInstance().add("Scenario",scenarioObj);
    }
}
