package com.selenium.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/features",
        glue = {"com/selenium/stepDefinations", "com/selenium/utils"},
        plugin = {"pretty", "json:target/report/cucumber.json", "pretty", "html:target/report/cucumber.html"}
//        dryRun = true
//        tags = "@launch"
)
public class TestRunner {
}

