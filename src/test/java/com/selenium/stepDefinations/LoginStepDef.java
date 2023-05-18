package com.selenium.stepDefinations;

import com.selenium.pageObject.LoginPage;
import com.selenium.utils.ScenarioContext;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

    ScenarioContext scenarioContext;
    WebDriver driver;
    LoginPage loginPage;
    public LoginStepDef(ScenarioContext scenarioContext){
        this.scenarioContext = scenarioContext;
        driver = (WebDriver) scenarioContext.getScenariocontext("driver");
        loginPage = new LoginPage(driver);
    }

    @Given("User launches the URL {string}")
    public void user_launches_the_url(String url) {
        loginPage.loginaApplication(url);
    }
}
