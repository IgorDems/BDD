package com.iaai.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageObject {
    //    OrangeHRMHomePage analog
//    @FindBy(xpath = "/html/body/section/header/div[2]/div/div[2]/div/a[1]")
//    public WebElementFacade login;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    public WebElementFacade email;
    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElementFacade pass;
    @FindBy(xpath = "//*[@id=\"account\"]/div/div/div[6]/button")
    public WebElementFacade button;


    public void enterCredentials() throws InterruptedException {
        Thread.sleep(1000);
        email.type("igors.acco@gmail.com");
        pass.typeAndEnter("Dems_1975");
    }




}
