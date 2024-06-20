package com.jk.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author Junaid.Khan
 */

@CucumberOptions(
        features = "src/test/resources/test.feature",
        glue = {"com.jk.test"}
)
public class CucumberRunnerIT extends AbstractTestNGCucumberTests {
}
