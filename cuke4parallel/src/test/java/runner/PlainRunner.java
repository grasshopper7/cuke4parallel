package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(glue= {"stepdef"}, 
				features= {"src/test/resources/features/parallel/"})
public class PlainRunner {
	
}
