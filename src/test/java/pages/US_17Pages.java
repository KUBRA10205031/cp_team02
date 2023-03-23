package pages;


import com.github.javafaker.Faker;
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
import utilities.Driver;

import java.time.Duration;

public class US_17Pages {
    private WebDriver driver;

    public US_17Pages(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @FindBy(xpath = "(//*[text()='Business Owner'])[1]")
    public WebElement dropdown;

    @FindBy(linkText = "Account Management")
    public WebElement accountManagement;

    @FindBy(linkText = "Users")
    public WebElement Users;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement NewUserRegistion;

    @FindBy(id = "react-select-2-input")
    public WebElement selectRole;

    @FindBy(xpath = "//label[@for='roles']")
    public WebElement roles;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement Register;

    @FindBy(xpath = "//div[@class='toast-body']")
    public WebElement alertmessaj;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement Invitation;

    @FindBy(xpath = "//*[text()='Send Invitation']")
    public WebElement SendInvitation;

    @FindBy(xpath = "//*[text()='Please enter a valid email']")
    public WebElement Please;

    @FindBy(xpath = "//*[text()='Please select a role for the user you will add']")
    public WebElement Please2;

    public void BusinessOwner() {

        dropdown.click();

    }

    public void accountManagement() {

        accountManagement.click();

    }

    public void Users() {

        Users.click();

    }

    public void RegistionAndRole() {

        wait.until(ExpectedConditions.visibilityOf(NewUserRegistion));

        NewUserRegistion.click();

        wait.until(ExpectedConditions.visibilityOf(roles));

        selectRole.sendKeys("Store" + Keys.ENTER);


    }

    public void setEmail() {


        Faker faker = new Faker();

        String gmail = faker.name().firstName().toLowerCase() + "." + faker.number().digit() + "@gmail.com";

        email.sendKeys(gmail + Keys.ENTER);

        Register.click();

    }

    public void setAlertmessaj() {

        wait.until(ExpectedConditions.visibilityOf(alertmessaj));

        Assert.assertTrue(alertmessaj.getText().contains("successful"));

    }

    public  void Invitation(){

        wait.until(ExpectedConditions.visibilityOf(Invitation));

        Invitation.click();

        wait.until(ExpectedConditions.visibilityOf(roles));

        selectRole.sendKeys("Store" + Keys.ENTER);


    }

    public  void setEmail2(){

        Faker faker = new Faker();

        String gmail = faker.name().firstName().toLowerCase() + "." + faker.number().digit() + "@gmail.com";

        email.sendKeys(gmail + Keys.ENTER);

       SendInvitation.click();


    }

    public  void  setSendInvitation(){
        Assert.assertTrue(Invitation.isDisplayed());
    }

    public  void NFirst(){

        wait.until(ExpectedConditions.visibilityOf(Invitation));

        Invitation.click();

        wait.until(ExpectedConditions.visibilityOf(roles));

        selectRole.sendKeys("Store" + Keys.ENTER);



        wait.until(ExpectedConditions.visibilityOf(SendInvitation));

        email.sendKeys("@gmail" + Keys.ENTER);

        SendInvitation.click();


    }

    public  void setEmail3(){


        Faker faker = new Faker();

        String gmail = faker.number().digit() + "@gmail.com";

        email.sendKeys(gmail + Keys.ENTER);

        SendInvitation.click();

    }


    public  void  GmailTest(){
        wait.until(ExpectedConditions.visibilityOf(Please));

        Assert.assertTrue(Please.getText().contains("Please"));

    }

    public  void NSecond(){

        wait.until(ExpectedConditions.visibilityOf(Invitation));

        Invitation.click();

        wait.until(ExpectedConditions.visibilityOf(roles));

        selectRole.sendKeys("" + Keys.ENTER);


    }

    public  void setEmail4(){


        Faker faker = new Faker();

        String gmail = faker.name().firstName().toLowerCase() + "." + faker.number().digit() + "@gmail.com";;

        email.sendKeys(gmail + Keys.ENTER);

        SendInvitation.click();

    }


    public  void  RoleTest(){

        Assert.assertTrue(Please2.isDisplayed());

    }










}
