package com.selenium.stepDefinations;

import com.selenium.pageObject.DashboardPage;
import com.selenium.utils.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;

public class DashboardStepDef {

    ScenarioContext scenarioContext;
    WebDriver driver;
    DashboardPage dashboardPage;
    public DashboardStepDef(ScenarioContext scenarioContext){
        this.scenarioContext = scenarioContext;
        driver = (WebDriver) scenarioContext.getScenariocontext("driver");
        dashboardPage = new DashboardPage(driver);
    }

    @Given("I add four random items to my cart")
    public void i_add_four_random_items_to_my_cart() {
        dashboardPage.clickOnItems();


    }

    @When("I view my cart")
    public void i_view_my_cart() {
        Assertions.assertThat(dashboardPage.clickonCartLink());
    }
}
