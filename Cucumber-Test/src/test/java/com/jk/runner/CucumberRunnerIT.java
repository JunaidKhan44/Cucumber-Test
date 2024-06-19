package com.jk.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/test.feature",
        glue = {"com.jk.test"}
)
public class CucumberRunnerIT extends AbstractTestNGCucumberTests {
}
