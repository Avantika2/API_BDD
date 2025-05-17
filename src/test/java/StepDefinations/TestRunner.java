package StepDefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles", // path to your feature files
        glue = "StepDefinations", // path to your step definition files
        plugin = {"pretty", "html:target/cucumber-html-report"} // reporting plugins
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
