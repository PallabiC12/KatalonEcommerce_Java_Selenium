package com.selenium.stepDefinations;

import com.selenium.pageObject.CartPage;
import com.selenium.utils.ScenarioContext;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartStepDef {

    ScenarioContext scenarioContext;
    WebDriver driver;
    CartPage cartPage;
    public CartStepDef(ScenarioContext scenarioContext){
        this.scenarioContext = scenarioContext;
        driver = (WebDriver) scenarioContext.getScenariocontext("driver");
        cartPage = new CartPage(driver);

    }


    @Then("I find total four items listed in my cart")
    public void i_find_total_four_items_listed_in_my_cart() {
        Assertions.assertThat(cartPage.ValidateCart()==5).isTrue();

    }
}
