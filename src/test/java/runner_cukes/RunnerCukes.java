package runner_cukes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/",
		glue={"step_definitions", "runner_cukes", "helper_classes"},  // These two must be glued
		tags = {"@GoogleFooterLinkDataTable"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-html_report", "junit:target/cucumber-junit-results.xml"}

		)

public class RunnerCukes extends AbstractTestNGCucumberTests {

}
