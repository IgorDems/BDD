package com.synchronization.page;

import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:7080/dynamic_loading/2")
public class ImplicitWaitExamplePage extends PageObject {

	public ImplicitWaitExamplePage(WebDriver driver) {
		super();
	}

@FindBy(css = "#start > button")
private WebElementFacade startButton;

@FindBy(xpath = "(//h42)[2]")
private WebElementFacade heading;

public void _implictWaitExample1() throws InterruptedException {
	
	try {
		
		open();
//		setImplicitTimeout(5,TimeUnit.SECONDS);
//
		System.out.println( getImplicitWaitTimeout().toString() );
		startButton.click();
		
		System.out.println(heading.getText().toUpperCase() );
		Thread.sleep(5000);
		
	}finally {
		resetImplicitTimeout();
	}
	
 }


public void _implictWaitExample2() throws InterruptedException {
	
	try {
		
		open();		
		System.out.println( getImplicitWaitTimeout().toString() );
		//startButton.click();
		//Thread.sleep(5000);
		
	}finally {
		
	}
	
 }


}
