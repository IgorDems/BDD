package com.serenity.webelements.dropdowns;

import net.thucydides.core.pages.components.HtmlTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import net.thucydides.core.matchers.*;

import java.util.List;
import java.util.Map;

import static net.thucydides.core.matchers.BeanMatchers.the;
import static net.thucydides.core.pages.components.HtmlTable.inTable;
import static net.thucydides.core.pages.components.HtmlTable.withColumns;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;


@DefaultUrl("http://localhost:7080/tables")
public class TablePage extends PageObject {
    @FindBy(how = How.ID, using = "table2")
    protected WebElementFacade table;

    //Read the complete row
    public void readCompleteTable() throws InterruptedException {
        open();
        System.out.println(getImplicitWaitTimeout().toString());
        List<Map<Object, String>> tbl = HtmlTable.rowsFrom(table);
        System.out.println(tbl);
    }
    public void rowsFromTable() throws InterruptedException{
        open();
        List<WebElement> rowValuees = HtmlTable.filterRows(table,the("Email",endsWith("yahoo.com")));
        for(WebElement e : rowValuees){
            System.out.println(e.getText());
        }

    }
    public void headingsExtr() throws InterruptedException{
        open();
        List<String> headings = inTable(table).getHeadings();
        for(String h : headings){
            System.out.println(h);
        }

    }

    public void allTableRows() throws InterruptedException{
        open();
        List<WebElement> rowElements = inTable(table).getRowElements();
        for(WebElement e : rowElements){
            System.out.println(e.getText());
        }
        inTable(table).getRowElements().stream()
                .forEach(e -> System.out.println(e.getText()));

    }
    public void rowOnConditionExtr() throws InterruptedException{
        open();

//                inTable(table).getRowElementsWhere(the("First Name",equalTo("Frank")))
//                .stream().forEach(e -> System.out.println(e.getText()));

        List<Map<Object, String>> tbl = withColumns("Last Name","First Name","  ","  ","  ").readRowsFrom(table);
        System.out.println(tbl);
    }

    public void assertOnTable() throws InterruptedException{
        open();
                inTable(table).shouldHaveRowElementsWhere(the("First Name", equalTo("Frank")));
                inTable(table).shouldNotHaveRowElementsWhere(the("First Name", equalTo(null)));
    }
}