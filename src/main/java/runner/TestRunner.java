package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features=".//src//test//java//feature//GMO.feature",
		glue="stepDefination",
		dryRun=false,
		tags= {"@test1"},
		monochrome = true,
		strict=true,
		//plugin= {"pretty", "html:target/cucumber-report"},
		plugin= {"pretty","json:target/cucumber-report/cucumber.xml"}
		)

public class TestRunner {

}
