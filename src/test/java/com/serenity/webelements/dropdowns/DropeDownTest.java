package com.serenity.webelements.dropdowns;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class DropeDownTest {
    @Managed
    WebDriver driver;
    DropeDownPage dropdown;
    @Test
    public void  ts1() throws InterruptedException{

        dropdown.selectValue();

    }
}
