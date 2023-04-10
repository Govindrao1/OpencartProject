package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 @CucumberOptions(
		features= {"src\\test\\resources\\FeaturesFiles\\RegistrationPage.feature"},
		glue= {"StepDefs"},
		monochrome=true,
		plugin= {"pretty","html:target/PassResults.txt","rerun:target/FailedResult.txt"})
 
public class Runner_1 extends AbstractTestNGCucumberTests{

}
