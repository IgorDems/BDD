package com.serenity.webelements.dropdowns;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.Dropdown;

@DefaultUrl("http://localhost:7080/dropdown")
public class DropeDownPage extends PageObject {

    @FindBy(id = "dropdown")
    private WebElementFacade dropdownId;
    public void selectValue() throws InterruptedException {

        open();
        Dropdown.forWebElement(dropdownId).selectByValue("2");
        Thread.sleep(3000);
        Dropdown.forWebElement(dropdownId).select("Option1");
        Thread.sleep(3000);
    }
}
