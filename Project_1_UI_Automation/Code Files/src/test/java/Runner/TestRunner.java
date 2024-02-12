package Runner;

// Import statements for necessary libraries and annotations
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// Annotation to specify TestNG test options for Cucumber
@CucumberOptions(
		features = "Features/SignUpPage.feature", // Path to the feature file(s)
		glue = "StepDefinitions", // Package where step definitions are located
		tags="@SignUpPage" // Tags to filter scenarios to be executed
		)

// TestRunner class that extends AbstractTestNGCucumberTests to run Cucumber tests with TestNG
public class TestRunner extends AbstractTestNGCucumberTests {	
	
}
