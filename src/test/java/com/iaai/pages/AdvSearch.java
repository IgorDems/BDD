package com.iaai.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdvSearch extends PageObject {
    @FindBy(xpath = "//*[@id=\"savedSearches\"]")
    private WebElementFacade saved;
    @FindBy(xpath = "//*[@id=\"SearchSelectedProfile\"]/a")
    private WebElementFacade go;

    public void searchHandling() throws InterruptedException {
        saved.selectByVisibleText("AcuraTLX-Honda").click();
        go.click();
        Thread.sleep(3000);

    }

}
