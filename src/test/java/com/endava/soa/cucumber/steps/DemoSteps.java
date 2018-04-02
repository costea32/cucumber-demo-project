package com.endava.soa.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DemoSteps {

    @Given("^this is my first step$")
    public void firstStep(){
        System.out.println("demo");
    }

    @When("^I use (.*) as a parameter")
    public void usingParam(int i){
        System.out.println(i);
    }

    @When("^I use (.*) and one more as a parameter")
    public void usingParamWillFail(int i){
        System.out.println(i);
    }
}
