package runnerTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\Manisha\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\cucumberDemo3\\src\\test\\resources\\cucumberDemo3\\cucumber3.feature",
		glue = "stepDefination3"
		)


public class RunnerClassTestNG3 extends AbstractTestNGCucumberTests{

}
