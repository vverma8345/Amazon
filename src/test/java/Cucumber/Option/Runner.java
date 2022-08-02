package Cucumber.Option;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/Resources/features",
        glue = {"StepDefinitions","Hooks"},
       //plugin = {"pretty", "html:target/cucumber-reports.html" }
      plugin = {"pretty","json:target/cucumber-reports/cucumber.json"}


)
public class Runner {
}
