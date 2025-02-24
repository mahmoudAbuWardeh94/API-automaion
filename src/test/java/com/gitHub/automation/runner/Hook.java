package com.gitHub.automation.runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void beforeScenario() {
        System.out.println("custom Before scenario hook");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("custom After scenario hook");
    }

}