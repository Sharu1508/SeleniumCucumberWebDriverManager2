package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue={"utility", "stepDefinition"},
        //plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"}
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)
public class TestRunner {



}
