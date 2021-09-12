package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/FailedTests.txt",
        glue ="stepDefinitions",
        //strict = true,
        plugin = {"pretty",
                "html:target/cucumber-default-reports.html"// generate default html reports
                }
)
public class FailedRunner {
}
