package com.ari.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.ari.stepdef"},
        features ={"src/test/resources"},
        plugin = {"pretty","html:reports/cucumberApi.html","json:reports/cucumberApi.json"},
        tags = "@api"
)

public class ApiRunner {
}