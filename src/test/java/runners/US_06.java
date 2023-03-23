package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utilities.ReusableMethods;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/US_06.feature",
        glue = {"stepDefinitions", "Hooks"})
public class US_06 extends ReusableMethods {
    




}
