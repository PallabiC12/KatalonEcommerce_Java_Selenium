package com.selenium.pageObject;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class DashboardPage extends  BasePage{

    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[normalize-space(.)='Add to cart']")
    List<WebElement> Items;

    @FindBy(xpath = "//h1[normalize-space(.)='Shop']") WebElement Header;

    @FindBy(xpath = "//*[normalize-space(.)='View cart']") WebElement ViewCart;

    @FindBy(xpath = "//a[normalize-space(.)='Cart']")WebElement CartLink;

    @FindBy(xpath = "//h1[normalize-space(.)='Cart']")WebElement CartHeader;

    public void clickOnItems() {
        findElement(Header);
        for(int i =0; i<=3; i++){
            Items.get(i).click();
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                e.printStackTrace();
            }

            findElement(ViewCart);
        }
    }

    public boolean  clickonCartLink()  {
        boolean flag = false;
        moveToElement(CartLink);
        findElement(CartLink);

        CartLink.click();
//        try{
//            Thread.sleep(8000);
//        }catch (Exception exec){
//            exec.getMessage();
//        }

        flag= CartHeader.isDisplayed();
         return flag;
    }
}
