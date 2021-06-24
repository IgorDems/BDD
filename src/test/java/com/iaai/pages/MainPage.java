package com.iaai.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends PageObject {

    @FindBy(xpath = "//*[contains(@class,'nav__item dropdown  nav__link-js-vehicles-dropdown')]")
    private WebElementFacade vehiclauct;
    @FindBy(xpath = "//*[contains(@href,'/Vehicles/VehicleAdvSearch.aspx')]")
    private WebElementFacade advsearch;

    public void menuHandling() throws InterruptedException {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(vehiclauct).perform(); //this makes the submenu appear
        actions.moveToElement(advsearch).click().perform(); //this click the submenu

        Thread.sleep(3000);
    }

}
