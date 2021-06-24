package com.serenity.webelements.dropdowns;

import com.gargoylesoftware.htmlunit.html.HtmlTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

@RunWith(SerenityRunner.class)
public class TableTest extends PageObject {

    @Managed
    WebDriver dtiver;
    TablePage table;

    @Test
    public void ts1() throws InterruptedException {

        table.readCompleteTable();
    }
    @Test
    public void ts2()throws InterruptedException{
        table.rowsFromTable();
    }
    @Test
    public void ts3()throws InterruptedException{
        table.headingsExtr();
    }
    @Test
    public void ts4()throws InterruptedException{
//        table.allTableRows();
        table.rowOnConditionExtr();
    }
    @Test
    public void ts5()throws InterruptedException{

        table.assertOnTable();
    }

}
