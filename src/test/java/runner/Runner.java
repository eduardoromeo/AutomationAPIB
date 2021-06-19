package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @autor: Eduardo M.T
 **/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/user.feature"}
)
public class Runner {
}
