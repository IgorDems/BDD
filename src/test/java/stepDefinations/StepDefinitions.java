package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)

public class StepDefinitions {
@Managed
WebDriver driver;

//FirstPage  firstPage = new FirstPage();
//LoginPage   loginPage = new LoginPage();

    @Before
    public void setup(){
        System.out.println("Step started: ");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Given("^User is on landing \"([^\"]*)\"$")
    public void userIsOnLanding(String arg1) throws Throwable {
        System.out.println(arg1);
        throw new PendingException();
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String arg1, String arg2) {
        System.out.println(arg1);
        System.out.println(arg2);
        throw new PendingException();
    }


    @Then("^Navigated to the home page title$")
    public void navigated_to_the_home_page(String title) throws Throwable {
        throw new PendingException();
    }
//
//    @And("^Main menu is visible$")
//    public void main_menu_is_visible() throws Throwable {
//        throw new PendingException();
//    }


}
