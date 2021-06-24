package com.test4test;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

@DefaultUrl("https://google.com")
public class Google extends PageObject {
    public Google(WebDriver driver) {
        super();
    }
//    @FindBy(id = "input")
//    private WebElementFacade search;

    public void goGoogle() {
        open();
//        search.sendKeys("aaaaaaaaaaaaa");
    }
}

