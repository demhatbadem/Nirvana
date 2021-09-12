package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        glue ="stepDefinitions",
        dryRun =false,
        tags= "@excel",
        //strict = true,
        plugin = {"pretty","html:target/cucumber-default-reports.html",// generate default html reports
        "rerun:target/FailedTests.txt",
        "json:target/cucumber.json"}
)
public class TestRunner {
}
