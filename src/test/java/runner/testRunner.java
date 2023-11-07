package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources//features//", glue = "stepDefinition", dryRun = false, monochrome = true, plugin = {
		"pretty" })

public class testRunner extends AbstractTestNGCucumberTests {

}
