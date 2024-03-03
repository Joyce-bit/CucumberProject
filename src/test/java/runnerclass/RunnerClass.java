package runnerclass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
					features="src/test/resources/features",
					glue={"stepdefinition","hooks"},
					monochrome=true,
					plugin= {"pretty", "junit:target/CucumberXMLReport.xml"}
					
				)

public class RunnerClass {
	
}
