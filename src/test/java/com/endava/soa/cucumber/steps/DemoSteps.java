package com.endava.soa.cucumber.steps;

import com.endava.soa.cucumber.Constants;
import com.endava.soa.cucumber.ScenarioContext;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoSteps {



    @Given("this is my first step")
    public void firstStep(){
        System.out.println("demo");
        int i=555;
        ScenarioContext.getInstance().add(Constants.TRANSFERRED_VALUE,i);
    }



    @When("^I use '(.*)' as a parameter")
    public void usingParam(int i){
        Scenario scenario=ScenarioContext.getInstance().get("Scenario");
        scenario.write(String.valueOf(i));
    }

    @When("^I use '(.*)' and one more as a parameter")
    public void usingParamWillFail(int i){
        System.out.println(i);
    }

    @Then("There (are|is) (.*) parameters")
    public void test(int i){}

}
