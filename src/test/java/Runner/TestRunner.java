package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions (features="C:\\Users\\lenovo\\eclipse-workspace\\CucumberDemo\\Features\\TestScenario.feature", glue= {"StepDefination"},

monochrome=true
		)

public class TestRunner {
	


}
