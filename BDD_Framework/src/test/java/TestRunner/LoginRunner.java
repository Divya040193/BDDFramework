package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ADMIN\\Desktop\\TNS_719\\FreeCrmBDDFramework\\FeatureFiles\\login.feature",
		glue="StepDefination",
		dryRun = false,
		monochrome = true,
		plugin= {"html:target/cucumber_report.html"}
		
		)

public class LoginRunner {

}
