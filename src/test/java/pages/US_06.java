package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US_06 {
    private WebDriver driver;

    public US_06(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @FindBy(id = "link2")
    private WebElement company;

    @FindBy(xpath = "//button[contains(@class, 'btn btn-outline-dark')]")
    private WebElement edit;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(name = "email")
    private WebElement email;

    //@FindBy(xpath = "//button[text()='Save']")
    //@FindBy(linkText = "Save")
    @FindBy(xpath = "//button[contains(@class,'px-3')]")
    private WebElement save;


    @FindBy(className = "text-danger")
    private WebElement uyari;
    ////div[@class='col-3']





    public void clickCompanyAndEdit(){
        ReusableMethods.waitUntilElementVisible(company);
        ReusableMethods.waitUntilClickableAndClick(company);

        edit.click();
    }
    public void enterNameAndMail(String isim,String mail) throws InterruptedException {
        String nameBeforeSendKeys=name.getAttribute("value");
        String mailBeforeSendKeys=email.getAttribute("value");

        name.clear();
        name.sendKeys(isim);
        email.clear();
        email.sendKeys(mail);
        Boolean firstCondition=!nameBeforeSendKeys.equals(name.getAttribute("value"));
        Boolean secondCondition=!mailBeforeSendKeys.equals(email.getAttribute("value"));
        //Thread.sleep(5000);
        if (firstCondition&&secondCondition)
        ReusableMethods.waitUntilClickableAndClick(save);


    }
    public void saveValidate1(){
        save.click();
        ReusableMethods.waitUntilElementVisible(edit);
        Assert.assertTrue(edit.isDisplayed());


    }

    public void emailWithoutName(String isim,String mail) throws InterruptedException {
        name.clear();
        name.sendKeys(isim);
        email.clear();
        email.sendKeys(mail);
        Thread.sleep(5000);
        ReusableMethods.waitUntilClickableAndClick(save);


    }
    public void uyariGoruntuleme(){
        Assert.assertTrue(uyari.isDisplayed());
    }
    public void nameWithoutEmail(String isim,String mail) throws InterruptedException {
        name.clear();
        name.sendKeys(isim);
        email.clear();
        email.sendKeys(mail);
        Thread.sleep(5000);
        ReusableMethods.waitUntilClickableAndClick(save);

    }
    public void saveValidate(){
        Assert.assertFalse(edit.isDisplayed());

    }


}
