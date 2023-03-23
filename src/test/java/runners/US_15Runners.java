package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/US_15_Displays.feature",
        glue = {"stepDefinitions","Hooks"},
        tags = " "
)

public class US_15Runners {

}
