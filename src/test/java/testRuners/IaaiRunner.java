package testRuners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "C:\\Users\\igoru\\IdeaProjects\\BDD\\src\\test\\java\\features\\iaai.feature",
        glue = "C:\\Users\\igoru\\IdeaProjects\\BDD\\src\\test\\java\\stepDefinations\\StepDefinitions.java",
//        plugin = {"pretty", "summary"},
        snippets = CAMELCASE)
public class IaaiRunner {

}
