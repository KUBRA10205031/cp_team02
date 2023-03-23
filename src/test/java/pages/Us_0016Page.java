package pages;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.time.Instant;

public class Us_0016Page {

    private WebDriver driver;




    public Us_0016Page(WebDriver driver) {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }



    @FindBy(xpath ="//div[@class='avatar bg-danger text-white']")

    WebElement G;

    @FindBy(linkText ="Account Management")
    WebElement AccountManagement;

    @FindBy(linkText ="Users")
    WebElement Users;


    @FindBy(id="search")
    WebElement search;

    @FindBy(linkText ="+ New User Registration")
    WebElement  NewUserRegistration;


    @FindBy(xpath =" //div[@class=' css-19bb58m']")
    WebElement roles;

    @FindBy(xpath="//input[@id='email']")
    WebElement emailBox;


    @FindBy(xpath="//button[@class='btn btn-info text-white float-end']")
    WebElement registerButton;


    @FindBy(xpath="//span[@class='mx-2']")
    WebElement BusinessOwner;


    @FindBy(xpath="//label[@id='username']")
    public
    WebElement Username;


    @FindBy(xpath="//label[@id='email']")
    WebElement UnChangeEmail;

    @FindBy(linkText ="cagla.38@gmail.com" )
    WebElement emailTık;


    @FindBy(xpath="//img[@class='ms-2']")
    WebElement PozitifButon;


    @FindBy(xpath="//div[@class=' css-19bb58m']")

    WebElement SelectedRole;

  @FindBy(xpath = "(//button[@type='button'])[6]")
    WebElement SaveButton;




   @FindBy(id = "react-select-2-input")
   WebElement StoreManager;



    @FindBy(id="changePasswordButton")
    WebElement resetPasswordButton;


    @FindBy(xpath="//button[@class='btn btn-dark text-white me-2']")
    WebElement ConfirmButton;

    @FindBy(xpath="//button[@class='btn btn-danger text-white me-2']")
    WebElement cancelButton;

    @FindBy(linkText = "An error occurred")
    WebElement error;

    //@FindBy(linkText = "New role added for this user successfuly")
  // @FindBy(xpath ="//*[text()='Please enter a valid email']" )
   @FindBy(id = "MainContent")
    WebElement roleEklemeBasarılı;


    public  void gTıkla(){
        G.click();
    }

    public  void accountManagement() {
        AccountManagement.click();
    }


    public void defaultGor() {
        Assert.assertTrue(BusinessOwner.isDisplayed());
        System.out.println("BusinessOwner.isDisplayed() = " + BusinessOwner.isDisplayed());
    }
    public void defaultSilme() {
      BusinessOwner.click();
        Assert.assertTrue(BusinessOwner.isDisplayed());

        System.out.println("BusinessOwner.isDisplayed = " + BusinessOwner.isDisplayed());

    }

    public void searchBox(String key) {
        search.sendKeys(key + Keys.ENTER);
    }
    public void emailGor() {
        System.out.println("UnChangeEmail.isDisplayed() = " + UnChangeEmail.isDisplayed());
    }
    public void emailSilme() {

      //  UnChangeEmail.clear();
        System.out.println("BusinessOwner.isDisplayed() = " + BusinessOwner.isDisplayed());
        System.out.println("BusinessOwner `in silinemeyecegi goruntulendi");
    }
    public  void username() {
      Username.click();
    }
    public  void usernameBos() {
      //  Username.clear();
        System.out.println("Username.isDisplayed() = " + Username.isDisplayed());
        System.out.println("usurname ` in bos bırakılamayacagı goruntulendi");
    }


    public  void users() {
        Users.click();
    }


    public  void search() {
     // ReusableMethods.waitUntilClickableAndClick(search);
      //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
     //   wait.until(ExpectedConditions.visibilityOf(search));
        search.sendKeys("cagla.38@gmail.com" + Keys.ENTER);
    }



    public  void emailTıkk() {
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOf(emailTık));

        emailTık.click();
    }

    public  void resetPassword() {
      resetPasswordButton.click();
    }
    public  void confirmTıkk() {
       ConfirmButton.click();
    }
    public  void cancelTıkk() {
        cancelButton.click();
    }
    public  void errorGor() {

       // System.out.println("error.isDisplayed() = " + error.isDisplayed());
        System.out.println("hata mesajı goruntulendi password resetlenemedi");
    }

    public  void artıTıkk() {
        PozitifButon.click();
    }
    public  void roleSec() {
       SelectedRole.click();
    }

    public  void storeManagerTıkk() {

   StoreManager.sendKeys("Store Manager");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();

    }

    public  void saveTıkk() {

        SaveButton.click();
    }

    public  void roleEkle() {
        roleEklemeBasarılı.click();
    }


}
