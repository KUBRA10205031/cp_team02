package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_02;
import utilities.ConfigReader;
import utilities.Driver;

public class US_2_StepDefinition { US_02 sub = new US_02(Driver.getDriver());

    @Given("Kullanici RxDrugsHub  gider")
    public void kullaniciRxDrugsHubGider() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));}

    @When("Kullanici gecerli  email ve password girer.")
        public void kullaniciGecerliEmailVePasswordGirer() { LoginPage lp = new LoginPage(Driver.getDriver());
            lp.collectiveLogin();
        }


    @And("kenar çubuguna  tıklanır")
    public void kenarÇubugunaTıklanır() {
       sub.Clikkenar();}

    @Then("menu listesi kapanir")
    public void menuListesiKapanir() {
        sub.menudogrulama();}

    @And("logo tiklanir")
    public void logoTiklanir() {
        sub.logo();}

    @Then("Arama sayfası gorulur.")
    public void aramaSayfasıGorulur() {
       sub.aramagorulme();
    }


    }


