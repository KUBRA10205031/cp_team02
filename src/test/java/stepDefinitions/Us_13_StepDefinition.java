package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.US_13;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_13_StepDefinition {
    US_13 us = new US_13(Driver.getDriver());
    static int teamsSayisiBefore;

    LoginPage loginPage = new LoginPage(Driver.getDriver());

    @Given("Kullanici  URL ye  gider ve login olur")
    public void kullaniciURLYeGiderVeLoginOlur() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        loginPage.collectiveLogin();
    }


    @And("Kullanici Account Managment buttonunu tiklar")
    public void kullaniciAccountManagmentButtonunuTiklar() {
        us.clickAccountManagementButton();

    }

    @And("Kullanici Teams buttonunu tiklar")
    public void kullaniciTeamsButtonunuTiklar() {
        us.teamsButton.click();

    }

    @And("Kullanici Add New Team  buttonunu tiklar")
    public void kullaniciAddNewTeamButtonunuTiklar() {
        us.addNewTeamButton.click();
        System.out.println("yeni team ekle tıklandı");

    }

    @And("Kullanici Team name girer")
    public void kullaniciTeamNameGirer() {
        us.teamName.sendKeys("team02brs");
        System.out.println("team name girildi");
    }

    @And("Kullanici Department Type secer")
    public void kullaniciDepartmentTypeSecer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

        actions.sendKeys("Team" + Keys.ENTER).perform();
        System.out.println("Department Type olarak Team seçildi");

    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        ReusableMethods.waitUntilClickableAndClick(us.saveButton);

        System.out.println("save edildi");
    }
    @Then("Kullanici Please enter a name for department hatasini goruntuler")
    public void kullaniciPleaseEnterANameForDepartmentHatasiniGoruntuler() {
        //ReusableMethods.waitUntilElementVisible(us.teamNameErr);
        Assert.assertTrue(us.teamNameErr.isDisplayed());
                System.out.println("Team name zorunludur");
    }

    @Then("Kullanici Please Select a type for department hatasini goruntuler")
    public void kullaniciPleaseSelectATypeForDepartmentHatasiniGoruntuler() {

        ReusableMethods.waitUntilClickableAndClick(us.saveButton);
        ReusableMethods.waitUntilElementVisible(us.departmentTypeErr);
        Assert.assertTrue(us.departmentTypeErr.isDisplayed());

        System.out.println("Department type zorunludur");


    }


    @And("Kullanici Sol Menudeki Teams buttonunu tiklar")
    public void kullaniciSolMenudekiTeamsButtonunuTiklar() {
        us.teamsButton.click();
        System.out.println("teamsler tıklandı");
    }

    @And("Kullanici  gecersiz bir Team name girer")
    public void kullaniciGecersizBirTeamNameGirer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click( us.teamName).sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).perform();

        System.out.println("Hatali team name girildi");

    }

    @And("Kullanici mevcut team sayisini gorur")
    public void kullaniciMevcutTeamSayisiniGorur() {
        teamsSayisiBefore=us.teamsSizeBefore.size();
        System.out.println("us.teamsSizeBefore.size() = " + us.teamsSizeBefore.size());
    }

    @Then("Kullanici Hatali oldugu halde yeni bir team eklendigini dogrular")
    public void kullaniciHataliOlduguHaldeYeniBirTeamEklendiginiDogrular() {
        int teamsSayisiAfter=us.teamsSizeAfter.size();
        System.out.println("us.teamsSizeAfter.size() = " + us.teamsSizeAfter.size());
        Assert.assertNotEquals(teamsSayisiAfter, teamsSayisiBefore);

    }


    @Then("Kullanici yeni eklenen Team i dogrular")
    public void kullaniciYeniEklenenTeamIDogrular() {


        us.searchBox.sendKeys("team02brs"+Keys.ENTER);
        ReusableMethods.waitUntilElementVisible(us.newTeam);
        Assert.assertTrue(us.newTeam.isDisplayed());
        System.out.println("Eklenen team görüldü");


       //
       // us.newTeam.click();
       // System.out.println("Eklenen team tıklandı");
       // Assert.assertTrue(us.newTeamName.isDisplayed());





    }


    @And("Kullanici ekledigi team e tiklar")
    public void kullaniciEkledigiTeamETiklar() {
        us.searchBox.sendKeys("team02brs"+Keys.ENTER);
        ReusableMethods.waitUntilElementVisible(us.newTeam);
        us.newTeam.click();
        System.out.println("eklenen team e tıklandı");


    }

    @And("Kullanici Edit team buttonuna tiklar")
    public void kullaniciEditTeamButtonunaTiklar() {
        ReusableMethods.waitUntilElementVisible(us.editTeamButton);
        us.editTeamButton.click();
        System.out.println("edit team e tıklandı");
    }

    @And("Kullanici yeni bir Team name girer")
    public void kullaniciYeniBirTeamNameGirer() {
        us.teamName.clear();
        us.teamName.sendKeys("team02brs2");
        System.out.println("yeni team name girildi");



    }

    @Then("Kullanici duzenledigi Team i dogrular")
    public void kullaniciDuzenledigiTeamIDogrular() {
        us.searchBox.sendKeys("team02brs2"+Keys.ENTER);
        ReusableMethods.waitUntilElementVisible(us.editedTeam);
        Assert.assertTrue(us.editedTeam.isDisplayed());
        System.out.println("düzenlenen team dogrulandı");
    }

    @And("Kullanici browser i kapatir.")
    public void kullaniciBrowserIKapatir() {
        Driver.closeDriver();
    }


    @And("Kullanici  Team name kismini bos birakir")
    public void kullaniciTeamNameKisminiBosBirakir() {
        ReusableMethods.waitUntilElementVisible(us.teamName);
        us.teamName.clear();







    }

    @And("Kullanici Department Type kismini bos birakir")
    public void kullaniciDepartmentTypeKisminiBosBirakir() {

        ReusableMethods.waitUntilClickableAndClick(us.departmentTypeCancel);
    }

    @And("Kullanici Delete Department butonuna tiklar")
    public void kullaniciDeleteDepartmentButonunaTiklar() {
        ReusableMethods.waitUntilClickableAndClick(us.deleteTeam);
        System.out.println("deleted");


    }

    @And("Kullanici acilan onay penceresinde tamam i tiklar")
    public void kullaniciAcilanOnayPenceresindeTamamITiklar() {
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
        ReusableMethods.waitUntilElementVisible(us.teams);
        System.out.println("ok");
    }

    @Then("Kullanici silinen team in  goruntulenemedigini dogrular")
    public void kullaniciSilinenTeamInGoruntulenemediginiDogrular() {
        us.searchBox.sendKeys("team02brs");
        ReusableMethods.waitUntilElementVisible(us.teams);
        System.out.println(us.confirmDeletedTeam.getText());
        System.out.println(us.den.getText());


    }


    //@And("Kullanici Delete Department butonuna tiklar")
   //public void kullaniciDeleteDepartmentButonunaTiklar() {
   //    us.deleteTeam.click();
   //}

   //@And("Kullanici acilan onay penceresinde tamam i tiklar")
   //public void kullaniciAcilanOnayPenceresindeTamamITiklar() {
   //    us.confirm();


   //}

   //@Then("Kullanici silinen team in  goruntulenemedigini dogrular")
   //public void kullaniciSilinenTeamInGoruntulenemediginiDogrular() {
   //    us.searchBox.sendKeys("team02brs2"+Keys.ENTER);
   //    ReusableMethods.waitUntilElementVisible(us.newTeam);
   //    int teamsSayisi=us.teamsSizeAfter.size();
   //    Assert.assertEquals(0, teamsSayisi);


   //}

   //@And("Save butonuna tiklayip kaydeder")
   //public void saveButonunaTiklayipKaydeder() {
   //    us.saveButton1.click();
   //}
}
