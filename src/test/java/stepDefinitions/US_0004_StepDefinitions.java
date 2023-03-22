package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPage;
import pages.US_0004Pages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static utilities.JSUtils.driver;

public class US_0004_StepDefinitions {

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    LoginPage loginPage=new LoginPage(Driver.getDriver());

    US_0004Pages kubra=new US_0004Pages(Driver.getDriver());


    // ortak stepler

    @When("Kullanici login butonuna tiklar ve gecerli bir email ve password girerek siteye giris yapar.")
    public void kullaniciGecerliBirEmailVePasswordGirer() {

        kubra.US_0004_KubraLogin();

        System.out.println("Siteye giriş yapıldı.");
    }

    @Then("All Products goruntuler.")
    public void allProductsGoruntuler() {

        Assert.assertTrue(kubra.AllProducts.isDisplayed());
        System.out.println("All Products yazisi goruntulendi.");

    }

    @And("Sagdaki Bussiness Owner butonuna tiklar.")
    public void sagdakiBussinessOwnerButonunaTiklar() {

        kubra.BusinessOwnerButton.click();

        System.out.println("Business Owner butonuna tıklandı.");
    }

    @And("Acilan pencereden Account Management sekmesine tiklar.")
    public void acilanPenceredenAccountManagementSekmesineTiklar() {
        kubra.AccountManagement.click();
        System.out.println("DropDown menusunden Account Management sekmesi secildi.");
    }
    @And("My Profile yazisini goruntuler.")
    public void myProfileYazisiniGoruntuler() {
        Assert.assertTrue(kubra.MyProfile.isDisplayed());

        System.out.println("My Profile yazisi goruntulendi.");
    }

    @Given("Change_ password butonuna tiklar")
    public void change_PasswordButonunaTiklar() {

        ReusableMethods.waitFor(10);

        ReusableMethods.waitUntilClickableAndClick(kubra.ChangePasswordButton);

        System.out.println("change password butonu tıklandı.");
    }

    @And("Kurallara uymayan bir {string} girisi yapar  .")
    public void kurallaraUymayanBirGirisiYapar(String password1) {
        kubra.NewPasswordButton1.sendKeys(password1);
    }

    @And("Dogrulamak icin Kurallara uymayan bir {string} girisi_yapar")
    public void dogrulamakIcinKurallaraUymayanBirGirisi_yapar(String password2) {
        kubra.NewPasswordButton2.sendKeys(password2);

    }
    @And("Confirm_ butonuna tiklar .")
    public void confirm_ButonunaTiklar() {
        kubra.ConfirmButton.click();
        System.out.println("confirm butonu tıklandı.");
    }
    @When("Hata {string} goruntuler.")
    public void hataGoruntuler(String mesaj) {
        Assert.assertTrue(mesaj.contains(kubra.ortakHata.getText()));
        System.out.println("Hata mesajı görüntülendi. ");
    }

    @Then("cancel_ butonuna tiklar.")
    public void cancel_ButonunaTiklar() {
        kubra.cancelButton.click();
    }

    // 2- E-mail değiştirilemediğini doğrulama
    @When("Sagdaki kalem ikonuna tiklar.")
    public void sagdakiKalemIkonunaTiklar() {

        //wait.until(ExpectedConditions.visibilityOf(kubra.kalemikonu));
        kubra.kalemikonu.click();
        System.out.println("kalem ikonu tıklandı.");
    }
    @When("E-mail butonuna tiklar.")
    public void eMailButonunaTiklar() {
        //wait.until(ExpectedConditions.visibilityOf(kubra.email));
        kubra.email.click();
        System.out.println("email butonu tıklandı.");
    }

    @Then("E-Mail butonunun degisim icin aktif olmadigini goruntuler.")
    public void eMailButonununDegisimIcinAktifOlmadiginiGoruntuler() {
        //wait.until(ExpectedConditions.visibilityOf(kubra.email));
        Assert.assertTrue(kubra.email.getText().contains("test123@test.com"),"e-mail değişikliği yapılabiliyor.");
    }

// 3- Başarılı password değişikliği

    @When("Change Password butonuna tiklar.")
    public void changePasswordButonunaTiklar() {
        kubra.ChangePasswordButton.click();
        System.out.println("changepassword butonu tıklandı");
    }

    @And("Kurallara uyan yeni bir password olusturur.")
    public void kurallaraUyanYeniBirPasswordOlusturur() {

        kubra.NewPasswordButton1.sendKeys("test123TEST123..");
        kubra.NewPasswordButton2.sendKeys("test123TEST123..");
        System.out.println("yeni şifre girişi yapıldı");

    }

    @And("Confirm butonuna tiklar.")
    public void confirmButonunaTiklar() {
        kubra.ConfirmButton.click();
        System.out.println("confirm butonu tıklandı.");
    }

    @When ("My Profile_yazisini goruntuler.")
    public void MyProfile_YazisiniGoruntuler() {
        Assert.assertTrue(kubra.MyProfile.isDisplayed());
    }

}
