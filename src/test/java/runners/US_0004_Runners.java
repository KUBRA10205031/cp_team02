
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features/US_0004.feature"},
        glue = {"stepDefinitions","Hooks"},
        tags = "@FirstTest or @notchangepassword or  @cannotbechangeemail or @changepassword"

)

public class US_0004_Runners {


}

