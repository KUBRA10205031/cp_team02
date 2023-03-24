package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_18_Page;
import utilities.Driver;

public class US_18_StepDefinition {
    US_18_Page US18Page=new US_18_Page(Driver.getDriver());
    @Given("Kullanici  sayfaya gider ve url login olur")
    public void kullaniciSayfayaGiderVeUrlLoginOlur() {
        LoginPage lp=new LoginPage(Driver.getDriver());

        lp.collectiveLogin();
    }

    @When("Kullanici G Businnes Owner simgesine ve Account Management butonuna tıklar")
    public void kullaniciGBusinnesOwnerSimgesineVeAccountManagementButonunaTıklar() {
        US18Page.clickBusiness();

        US18Page.clickaccount();
    }

    @When("Kullanici Roles bolumune gider")
    public void kullaniciRolesBolumuneGider() {
        US18Page.clickRoles();
    }

    @Then("Kullanici All Roles yazan sayfada tüm kayitlari görüntüledigini ve listelediğini dogrular")
    public void kullaniciAllRolesYazanSayfadaTümKayitlariGörüntülediginiVeListelediğiniDogrular() {
        US18Page.allRolesList();

        US18Page.allRolesDisplayed();

        Driver.closeDriver();
    }
}
