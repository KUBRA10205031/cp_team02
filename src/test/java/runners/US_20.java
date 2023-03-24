

package runners;



import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(

        features= {"src/test/resources/features/US_20.feature"},

        glue = {"stepDefinitions","Hooks"}

)


public class US_20 {

}

