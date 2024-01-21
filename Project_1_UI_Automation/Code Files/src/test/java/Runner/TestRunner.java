package Runner;


import org.junit.runner.RunWith;
import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "Features/SignUpPage.feature",
		glue = "StepDefinitions",
		tags="@SignUpPage"
		)


public class TestRunner extends AbstractTestNGCucumberTests {	
	
}