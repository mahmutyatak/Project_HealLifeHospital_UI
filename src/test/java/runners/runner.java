package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html"},
        features = "src/test/resources",
        glue = "stepDefinitions",
        tags = " @tpa5",
        dryRun = false
)



public class runner {
}
