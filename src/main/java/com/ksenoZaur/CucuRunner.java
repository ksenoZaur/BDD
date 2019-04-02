package com.ksenoZaur;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/main/resources/com.ksenoZaur"}
)
public class CucuRunner {
}