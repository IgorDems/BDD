package com.synchronization.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:7080/dynamic_loading/2")
public class ExplicitWaitExamplePage extends PageObject {
	
	@FindBy(css = "#start > button")
	private WebElementFacade startButton;

	@FindBy(xpath = "(//h42)[2]")
	private WebElementFacade heading;

	public ExplicitWaitExamplePage(WebDriver driver) {
		super();
	}

	public void _explicitWaitExamples() throws InterruptedException {
		
		open();
		
//		startButton.waitUntilClickable().click();
		
//		startButton.withTimeoutOf(10, TimeUnit.SECONDS).click();
		
//		waitFor(startButton).click();
//
////		waitFor(ExpectedConditions)
//
//		waitForTitleToAppear("The Internet").waitFor(startButton).click();
//
//		waitForTextToAppear("Dynamically Loaded Page Elements").waitFor(startButton).click();
//
//	  waitForAllTextToAppear("Dynamically Loaded Page Elements","Example 2: Element rendered after the fact")
//	  .waitFor(startButton).click();
//
//		startButton.waitUntilClickable().click();
//
//		String s = waitForAbsenceOf("//div[@id='loading']/img").findBy("(//h4)[2]").getText();
//
//		System.out.println(s.toUpperCase());

		System.out.println( getWaitForTimeout().toString() );
		
		Thread.sleep(3000);
	}
	
}
