package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_03;
import utilities.ConfigReader;
import utilities.Driver;

public class US_3_StepDefinition {
    US_03 sub = new US_03(Driver.getDriver());



    @Given("Kullanici RxDrugsHub sayfasina gider.")
    public void kullaniciRxDrugsHubSayfasinaGider() {
        {Driver.getDriver().get(ConfigReader.getProperty("URL"));}

    }

    @When("Kullanici gecerli bir email ve password girer")
    public void kullaniciGecerliBirEmailVePasswordGirer() {  LoginPage lp = new LoginPage(Driver.getDriver());
        lp.collectiveLogin();

    }

    @And("Kullanici sign in butonuna tıklar.")
    public void kullaniciSignInButonunaTıklar() {

    }

    @Then("Kullanici adı ve rolü görülür.")
    public void kullaniciAdıVeRolüGörülür() {
        sub.kullaniciRoluGorulme();


    }
}
