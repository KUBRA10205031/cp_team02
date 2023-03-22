package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_05;
import pages.US_07;
import utilities.Driver;

public class US_07_StepDefinition {
    US_07 us7 = new US_07(Driver.getDriver());
    @Given("Kullanici login olur ve account menagement'e gider")
    public void kullaniciLoginOlurVeAccountMenagementEGider() {
        LoginPage lp = new LoginPage(Driver.getDriver());
        US_05 us5 = new US_05(Driver.getDriver());
        lp.collectiveLogin();
        us5.clickSub();
    }

    @When("Departments'e tiklar")
    public void departmentsETiklar() {
        us7.departmentsClick();
    }

    @Then("Departments listesini görüntüler")
    public void departmentsListesiniGörüntüler() {
        us7.departmentsDisplay();

    }
}
