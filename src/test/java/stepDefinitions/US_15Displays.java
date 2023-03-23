package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_15Pages;
import utilities.Driver;

public class US_15Displays {

    US_15Pages ss=new US_15Pages(Driver.getDriver());
    @Given("Kullanici login butonuna tıklar ve login olur")
    public void kullaniciLoginButonunaTıklarVeLoginOlur() {
        LoginPage ll=new LoginPage(Driver.getDriver());
        ll.collectiveLogin();
    }

    @When("Kullanici   G butonuna tıklar")
    public void kullaniciGButonunaTıklar() {
        ss.BusinessOwner();
    }

    @Then("Kullanici acılan menüden Account Management simgesine tıklar")
    public void kullaniciAcılanMenüdenAccountManagementSimgesineTıklar() {
        ss.accountManagement();
    }

    @And("Kullanici acılan sayfada  Users simgesine tıklar")
    public void kullaniciAcılanSayfadaUsersSimgesineTıklar() {
        ss.Users();
    }

    @When("Kullanici acılan sayfada Search by username or email arama cubuguna {string} girer")
    public void kullaniciAcılanSayfadaSearchByUsernameOrEmailAramaCubugunaGirer(String arg0) {
        ss.search();
    }

    @Then("Kullanici acılan ekranda emailinde onayladıgı hesabında green tick gorur")
    public void kullaniciAcılanEkrandaEmailindeOnayladıgıHesabındaGreenTickGorur() {
         ss.green();
        System.out.println("Green tick görüldü");

    }

    @And("Kullanici sayfayı kapatır")
    public void kullaniciSayfayıKapatır() {
        Driver.closeDriver();
    }

    @When("Kullanici acılan sayfada Search by username or email arama cubugun {string} girer")
    public void kullaniciAcılanSayfadaSearchByUsernameOrEmailAramaCubugunGirer(String arg0) {
              ss.redSearch();
    }

    @Then("Kullanici acılan ekranda emailinde onaylamadıgı hesabında red tick gorur")
    public void kullaniciAcılanEkrandaEmailindeOnaylamadıgıHesabındaRedTickGorur() {
         ss.red();
        System.out.println("Red tick görüldü");
    }
}
