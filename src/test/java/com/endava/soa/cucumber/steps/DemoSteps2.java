package com.endava.soa.cucumber.steps;

import com.endava.soa.cucumber.Child;
import com.endava.soa.cucumber.Constants;
import com.endava.soa.cucumber.ScenarioContext;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;

import java.util.List;

public class DemoSteps2 {

    @Given("this step uses the first step data")
    public void secondStep(){
        int i= ScenarioContext.getInstance().get(Constants.TRANSFERRED_VALUE);
        System.out.println(i);
    }

    @Given("this is a data table")
    public void tableStep(List<Child> tableData){
        for (Child child: tableData){
           Scenario scenario=ScenarioContext.getInstance().get("Scenario");
           scenario.write(child.getName()+" "+child.getAge());

        }
    }
}
