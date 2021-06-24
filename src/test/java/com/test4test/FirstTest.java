package com.test4test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class FirstTest {

 @Managed
    WebDriver driver;
    Google google;
@Title("The First Serenity Test For Test")
 @Test
    public void navigateToGooglePage() throws InterruptedException{
//     driver.navigate().to("https://google.com/");
//     Thread.sleep(3000);
     driver.get("https://iaai.com");
     Thread.sleep(3000);
     google.goGoogle();
     Thread.sleep(3000);
 }



}
