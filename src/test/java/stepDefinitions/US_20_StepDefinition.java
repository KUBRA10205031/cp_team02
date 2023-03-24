

package stepDefinitions;



import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import pages.LoginPage;

import pages.US_19_Page;

import pages.US_20_Page;

import utilities.Driver;



        

public class US_20_StepDefinition {

    US_19_Page US19PAGE= new US_19_Page(Driver.getDriver());



    @Given("Kullanici sayfaya giderek login olur")

    public void KullaniciSayfayaGiderekLoginOlur(){

        LoginPage loginPage =new LoginPage(Driver.getDriver());

        loginPage.collectiveLogin();



    }

    @When("Kullanici Businnes Owner simgesine daha sonra Account Management butonuna tıklar")

    public void KullaniciBusinnesOwnerSimgesineDahaSonraAccountManagementButonunaTıklar(){



        US19PAGE.clickBusiness();

        US19PAGE.clickaccount();

    }

    @When("Kullanici Roles bolumune giderek All Roles sayfasini goruntuler")

    public void KullaniciRolesBolumuneGiderekAllRolesSayfasiniGoruntuler(){

        US_19_Page US19PAGE= new US_19_Page(Driver.getDriver());



        US19PAGE.clickRoles();



    }

    @Then("Kullanici tum rolleri tiklayarak permissions bolumunun goruntulediğini ve listelendigini dogrular")

    public void KullaniciTumRolleriTiklayarakPermissionsBolumununGoruntulediğiniVeListelendiginiDogrular(){

        US_20_Page US20Page=new US_20_Page(Driver.getDriver());



        US20Page.permissionsList();

        US20Page.permissionDisplayed();

        Driver.closeDriver();



    }

}

