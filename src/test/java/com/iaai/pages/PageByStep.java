package com.iaai.pages;

import net.thucydides.core.annotations.Step;

public class PageByStep {
    // HomePage analog
    LoginPage tbs;
    PreLogin pl;
    AdvSearch as;
    MainPage mp;

    @Step("This step will verify the title")
    public void verifyFirstTitle() throws InterruptedException {
        pl.verifyFirst();
    }

    @Step("This step will allow us to login to the app")
    public void enterCredentials() throws InterruptedException {
        tbs.enterCredentials();
    }

    @Step("This step will allow us to handle 'drop-down' menu")
    public void menuHandling() throws InterruptedException {
        mp.menuHandling();
    }

    @Step
    public void srchHandling() throws InterruptedException {
        as.searchHandling();
    }
}
