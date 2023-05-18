package com.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {


     static WebDriver driver;
    public static WebDriver driverInit(){
        System.setProperty("webdriver.chrome.driver", "src/test/resource/binaryfiles/chromedriver.exe");
        driver= new ChromeDriver(capabilities());
        return driver;
    }

    public static ChromeOptions capabilities(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        return option;

    }
}
