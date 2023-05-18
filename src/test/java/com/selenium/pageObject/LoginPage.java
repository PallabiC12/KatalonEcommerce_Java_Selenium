package com.selenium.pageObject;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }

    public void loginaApplication(String url) {
        driver.get(url);
    }
}
