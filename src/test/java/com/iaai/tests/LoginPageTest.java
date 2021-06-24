package com.iaai.tests;

import com.iaai.pages.PageByStep;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class LoginPageTest extends PageObject {

    @Managed
    WebDriver driver;
    @Steps
    PageByStep pbs;



    @Test
    public void testLogin() throws InterruptedException {
        driver.get("http://iaai.com");
        pbs.verifyFirstTitle();
        pbs.enterCredentials();
        pbs.menuHandling();
        pbs.srchHandling();



    }


}
