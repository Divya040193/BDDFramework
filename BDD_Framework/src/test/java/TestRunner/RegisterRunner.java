package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ADMIN\\Desktop\\TNS_719\\BDD_Framework\\FeatureFiles\\Register.feature",
		glue="StepDefination",
		dryRun = false,
		monochrome = true,
		plugin= {"html:target/register_report.html"}
		)		
	
public class RegisterRunner {
	
}
	
	
