package com.sei.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class LocatorExamplesPage extends PageObject {

    public LocatorExamplesPage(WebDriver driver) {
        super();
    }

    public void sel_clickOnLink() throws InterruptedException {

        open();

        WebElement link = getDriver().findElement(By.xpath("//a[@href='/abtest']"));
        link.click();

        Thread.sleep(3000);
    }

    public void sel_grabAllLinks() throws InterruptedException {

        open();

        List<WebElement> links = getDriver().findElements(By.tagName("a"));

        for (WebElement link : links) {
            System.out.println(link.getText().toUpperCase());
        }

        Thread.sleep(3000);
    }

    public void ser_clickOnLink() throws InterruptedException {

        open();

        //WebElementFacade link =find(By.xpath("//a[@href='/abtest']"));
        //WebElementFacade link =find(By.cssSelector("a[href='/abtest']"),By.xpath("//a[@href='/abtest']"));
        //WebElementFacade link = findBy("//a[@href='/abtest']");
        WebElementFacade link = $("//a[@href='/abtest']");

        //link.getWrappedElement();

        link.click();
        Thread.sleep(3000);
    }

    public void ser_grabAllLinks() throws InterruptedException {

        open();

        List<WebElementFacade> links = findAll(By.tagName("a"));

        //	for (WebElement link : links) {
        //		System.out.println(link.getText().toUpperCase());
        //	}

        links.forEach(e -> System.out.println(e.getText()));

        Thread.sleep(3000);
    }
}
