package com.ksenoZaur;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^Alice is hungry$")
    public void aliceIsHungry() {
    }

    @When("^she eats (\\d+) cucumbers$")
    public void sheEatsCucumbers(int arg0) {
    }

    @Then("^she will be full$")
    public void sheWillBeFull() {
    }
}
