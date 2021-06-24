package com.iaai.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class PreLogin extends PageObject {

    @FindBy(xpath = "/html/body/section/header/div[2]/div/div[2]/div/a[1]")
    public WebElementFacade login;

    public void verifyFirst() throws InterruptedException {
        Thread.sleep(1000);
        String title = getDriver().getTitle();
        Assert.assertTrue(title.contains("Salvage Cars for Sale | IAA"));
        login.click();
    }


}
