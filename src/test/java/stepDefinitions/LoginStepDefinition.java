package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginStepDefinition {

    LoginPage loginPage=new LoginPage(Driver.getDriver());

    @Given("Kullanici RxDrugsHub sayfasina gider")
    public void kullaniciRxDrugsHubSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

    }
    @When("Kullanici gecerli bir email ve password girer.")
    public void kullaniciGecerliBirEmailVePasswordGirer() {
        loginPage.Login();
    }
    @And("Kullanici sign in butonuna tiklar.")
    public void kullaniciSignInButonunaTiklar() {
        loginPage.signIn.click();

    }
    @Then("All Products goruntuler.")
    public void allProductsGoruntuler() {
        Assert.assertTrue(loginPage.AllProducts.isDisplayed());
        Driver.closeDriver();
    }
}
