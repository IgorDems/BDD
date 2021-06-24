package com.synchronization.page;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class WaitTest {

	@Managed
	WebDriver driver;

	ImplicitWaitExamplePage page;
	ExplicitWaitExamplePage explicit_page;
	
	@Test
	public void tc1() throws InterruptedException{
     
//		page._implictWaitExample1();
//		page._implictWaitExample2();
//		Thread.sleep(3000);
		 explicit_page._explicitWaitExamples();
		 
		
	}
}
