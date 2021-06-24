package com.sei.page;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LocatorExamplesTest {

	@Managed
	WebDriver driver;

	LocatorExamplesPage page;
	
	@Test
	public void tc1() throws InterruptedException{
		page.sel_clickOnLink();
	}
	@Test
	public void tc2() throws InterruptedException{
		page.sel_grabAllLinks();
	}
	@Test
	public void tc3() throws InterruptedException{
		page.ser_clickOnLink();
		page.ser_grabAllLinks();
	}
}
