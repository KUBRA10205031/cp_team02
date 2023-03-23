package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.Us_0016Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Us_0016stepDefinitions {
    LoginPage loginOl=new LoginPage(Driver.getDriver());
    Us_0016Page users=new Us_0016Page(Driver.getDriver());
    @Given("Kullanici URL e gider")
    public void kullaniciURLEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @When("Kullanici sayfaya login olur ve G simgesine tıklar")
    public void kullaniciSayfayaLoginOlurVeGSimgesineTıklar() {
        loginOl.collectiveLogin();
        users.gTıkla();
    }

    @Then("Kullanici açılan menüden Account Management bölümüne tıklar")
    public void kullaniciAçılanMenüdenAccountManagementBölümüneTıklar() {
        users.accountManagement();
    }

    @When("Kullanici  default rolunu silinemeyecegini goruntuler.")
    public void kullaniciDefaultRolunuSilinemeyeceginiGoruntuler() {
        users.defaultGor();
        users.defaultSilme();
    }

    @When("Kullanici  meailinin degiştirilemeyecegini goruntuler.")
    public void kullaniciMeailininDegiştirilemeyeceginiGoruntuler() {
        users.emailGor();
        users.emailSilme();
    }

    @When("Kullanici usurname i bos bırakamyacagını goruntuler")
    public void kullaniciUsurnameIBosBırakamyacagınıGoruntuler() {
        users.username();
      users.usernameBos();

    }

    @When("Kullanici  user bolumune tıklar.")
    public void kullaniciUserBolumuneTıklar() {
        users.users();

    }

    @Then("Kullanici search yerine emailini girer ve tıklar")
    public void kullaniciSearchYerineEmailiniGirerVeTıklar() {
       users.search();
        users.emailTıkk();
    }

    @And("Kullanici Reset Password sekmesini tıklar")
    public void kullaniciResetPasswordSekmesiniTıklar() {
        users.resetPassword();
    }

    @And("Kullanici  confirme tıklar.")
    public void kullaniciConfirmeTıklar() {
        users.confirmTıkk();
    }

    @And("Kullanici paswordunu resetleyebilecegini goruntuler")
    public void kullaniciPaswordunuResetleyebileceginiGoruntuler() {
        users.cancelTıkk();
        users.errorGor();
    }

    @When("Kullanıcı  user bolumune tıklar.")
    public void kullanıcıUserBolumuneTıklar() {
        users.users();
    }

    @Then("Kullanıcı search yerine emailini girer ve tıklar")
    public void kullanıcıSearchYerineEmailiniGirerVeTıklar() {
        users.search();
        users.emailTıkk();
    }

    @And("Kullanıcı + sekmesine tıklar.")
    public void kullanıcıSekmesineTıklar() {
        users.artıTıkk();
    }

    @And("Kullanıcı acılan sekmede farkı bır role secer")
    public void kullanıcıAcılanSekmedeFarkıBırRoleSecer() {
        users.roleSec();
        users.storeManagerTıkk();
    }

    @And("Kullanıcı save butonuna tıklar.")
    public void kullanıcıSaveButonunaTıklar() {
        users.saveTıkk();
    }

    @And("Kullanıcı New role added for this user successfuly yazısını goruntuler.")
    public void kullanıcıNewRoleAddedForThisUserSuccessfulyYazısınıGoruntuler() {
        users.roleEkle();
    }
}
