package medicareUser;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="Features"
				, glue = "medicareUser"	
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
