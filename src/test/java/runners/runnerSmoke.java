package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\paralelReport1.html",
                "json:target/json-reports/newPatientReport.json",
                "junit:target/xml-report/newPatientReport.xml"
        },
        features = "src/test/resources",
        glue = "stepDefinitions",
        tags = "@wip",
        dryRun = false
)

public class runnerSmoke {

}
