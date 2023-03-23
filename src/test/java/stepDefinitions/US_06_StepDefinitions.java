package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_05;
import pages.US_06;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_06_StepDefinitions {
    US_06 comp = new US_06(Driver.getDriver());
    @Given("Kullanici web sitesine gider ve login olur")
    public void kullaniciWebSitesineGiderVeLoginOlur() {
        LoginPage lp = new LoginPage(Driver.getDriver());
        lp.collectiveLogin();
    }

    @When("Account management'a tiklanir")
    public void accountManagementATiklanir() {
        US_05 us5 = new US_05(Driver.getDriver());
        us5.clickSub();
    }

    @And("Company ve Edit'e tiklanir")
    public  void companyVeEditETiklanir() {




        comp.clickCompanyAndEdit();

    }

    @And("isim {string} ve email  {string} girilir")
    public void isimVeEmailGirilir(String arg0, String arg1) throws InterruptedException {
        comp.enterNameAndMail(arg0,arg1);
    }

    @Then("Degisiklik kaydedilir")
    public void degisiklikKaydedilir() {

        comp.saveValidate1();
    }

    @And("Isim bos {string} birakilir mail {string} girilir")
    public void isimBosBirakilirMailGirilir(String arg0, String arg1) throws InterruptedException {
        comp.emailWithoutName(arg0,arg1);

    }

    @Then("Uyari alinir")
    public void uyariAlinir() throws IOException {
        comp.uyariGoruntuleme();
        //ReusableMethods.getScreenshot(Driver.getDriver(), "s");

    }

    @And("isim girilir {string} mail bos {string} biraklilir")
    public void isimGirilirMailBosBiraklilir(String arg0, String arg1) throws InterruptedException {
        comp.nameWithoutEmail(arg0,arg1);

    }

    @Then("Kayit yapilamaz")
    public void kayitYapilamaz() {
        comp.saveValidate();

    }





}
