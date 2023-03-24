package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_19_Page;
import utilities.Driver;

public class US_19_StepDefinition {
    US_19_Page US19Page=new US_19_Page(Driver.getDriver());



        

    @Given("Kullanici login olur")

    public void KullaniciLoginOlur() {

        LoginPage loginPage = new LoginPage(Driver.getDriver());

        loginPage.collectiveLogin();

    }



    @When("Kullanici Businnes Owner simgesine ve Account Management butonuna tıklar")

    public void kullaniciBusinnesOwnerSimgesineVeAccountManagementButonunaTıklar() {

        US19Page.clickBusiness();

        US19Page.clickaccount();

    }



        

    @When("Kullanici Roles bolumune tiklar")

    public void kullaniciRolesBolumuneTiklar() {

        US19Page.clickRoles();

    }



        

    @Then("Kullanici All Roles yazili sayfadaki tum rolleri tiklayarak ayricaliklarini görüntülediğini doğrular")

    public void kullaniciAllRolesYaziliSayfadakiTumRolleriTiklayarakAyricaliklariniGörüntülediğiniDoğrular() {



        US19Page.clickAllRoles();

        US19Page.allRolesDisplayed();

        Driver.closeDriver();



    }
}
