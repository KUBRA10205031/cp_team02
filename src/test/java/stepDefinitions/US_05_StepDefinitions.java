package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_05;
import utilities.Driver;

public class US_05_StepDefinitions {
    US_05 sub = new US_05(Driver.getDriver());
    @Given("Kullanici  sayfaya gider ve login olur")
    public void kullaniciSayfayaGiderVeLoginOlur() {
        LoginPage lp = new LoginPage(Driver.getDriver());
        lp.collectiveLogin();

    }

    @When("Kullanici Account Management ve Subscriptions butonuna tiklar")
    public void kullaniciAccountManagementVeSubscriptionsButonunaTiklar() {
        sub.clickSub();

    }

    @Then("Subscriptions listesi görüntülenir")
    public void subscriptionsListesiGörüntülenir() {
        sub.displaySubscriptionsList();
    }

    @And("Kullanici bir subscriptiona tiklar")
    public void kullaniciBirSubscriptionaTiklar() {
        sub.clikA3m();
    }

    @Then("Subscription bilgileri görüntülenir")
    public void subscriptionBilgileriGörüntülenir() {
        sub.subInformationDisplay();
        Driver.closeDriver();
    }
}
