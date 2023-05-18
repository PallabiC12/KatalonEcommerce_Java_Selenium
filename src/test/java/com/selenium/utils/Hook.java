package com.selenium.utils;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hook {

    WebDriver driver;
    ScenarioContext scenarioContext;
    public Hook(ScenarioContext scenarioContext){
        this.scenarioContext = scenarioContext;
    }

    @Before
    public void initialization(){
        driver = Driver.driverInit();
        scenarioContext.setScenariocontext("driver", driver);

    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            byte[]screenshot = Shutterbug.shootPage(driver, Capture.FULL_SCROLL).getBytes();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
            driver.quit();
    }
}
