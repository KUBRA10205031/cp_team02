package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.US_17Pages;
import utilities.Driver;

public class US_17NewUsers {
    US_17Pages ss=new US_17Pages(Driver.getDriver());
    @Given("Kullanici url gıder ve kullanici login olur.")
    public void kullaniciUrlGıderVeKullaniciLoginOlur() {
        LoginPage ll=new LoginPage(Driver.getDriver());
        ll.collectiveLogin();
    }

    @When("Kullanici G butonuna tıklar ve Account Managenent bolumune tıklar")
    public void kullaniciGButonunaTıklarVeAccountManagenentBolumuneTıklar() {
        ss.BusinessOwner();
        ss.accountManagement();

    }

    @Then("Kullanici acılan sayfada  Users sayfada Users bolumune tıklar")
    public void kullaniciAcılanSayfadaUsersSayfadaUsersBolumuneTıklar() {
        ss.Users();
    }

    @When("Kullanici New User Registion sekmesine tıklar ve role bolumunden secim yapar")
    public void kullaniciNewUserRegistionSekmesineTıklarVeRoleBolumundenSecimYapar() {
        ss.RegistionAndRole();
    }

    @And("Kullanici email kısmına gecerli email girer ve Register butonuna basar")
    public void kullaniciEmailKısmınaGecerliEmailGirerVeRegisterButonunaBasar() {
        ss.setEmail();
    }

    @Then("Kullanici Succesful mesajını dogrular")
    public void kullaniciSuccesfulMesajınıDogrular() {
        ss.setAlertmessaj();

        System.out.println("Mesaj 1 görüldü");
    }

    @And("Kullanici sayfasını kapatır")
    public void kullaniciSayfasınıKapatır() {
        Driver.closeDriver();
    }

    @When("Kullanici New User Invitation sekmesine tıklar ve roles bolumunden secim yapar")
    public void kullaniciNewUserInvitationSekmesineTıklarVeRolesBolumundenSecimYapar() {
        ss.Invitation();
    }

    @And("Kullanici email kısmına gecerli email girer ve Send Invitation butonuna basar")
    public void kullaniciEmailKısmınaGecerliEmailGirerVeSendInvitationButonunaBasar() {
        ss.setEmail2();
    }

    @Then("Kullanici green renklteki dogrulama mesajını gorur")
    public void kullaniciGreenRenkltekiDogrulamaMesajınıGorur() {
        ss.setSendInvitation();

        System.out.println("Mesaj 2 görüldü");
    }

    @And("Kullanici email kısmına gecersiz bir email girer ve Send Invitation butonuna tıklar")
    public void kullaniciEmailKısmınaGecersizBirEmailGirerVeSendInvitationButonunaTıklar() {
        ss.NFirst();

    }

    @Then("Kullanici acılan sayfada bilgilendirme mesajını gorur ve kayıt olamaz")
    public void kullaniciAcılanSayfadaBilgilendirmeMesajınıGorurVeKayıtOlamaz() {

        ss.GmailTest();

        System.out.println("Mesaj 3 görüldü");
    }

    @When("Kullanici New User Invitation sekmesine tıklar ve roles bolumunden secim yapmaz")
    public void kullaniciNewUserInvitationSekmesineTıklarVeRolesBolumundenSecimYapmaz() {
        ss.NSecond();
    }


    @And("Kullanici gecerli email adress girer ve Send Invitation butonuna tıklar")
    public void kullaniciGecerliEmailAdressGirerVeSendInvitationButonunaTıklar() {
        ss.setEmail4();
    }

    @Then("Kullanici bilgilendirme mesajını gorur ve kayıt olamaz")
    public void kullaniciBilgilendirmeMesajınıGorurVeKayıtOlamaz() {
        ss.RoleTest();
        System.out.println("Mesaj 4 görüldü");

    }
}
