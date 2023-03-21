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

    @FindBy(xpath = "//button[text()='Save']")
    private WebElement save;

    @FindBy(className = "text-danger")
    private WebElement uyari;
    ////div[@class='col-3']

    @FindBy(xpath = "test-output")
    private List <WebElement> depList;
    public void deneme(){
        for (WebElement e:depList
             ) {
            Assert.assertTrue(e.isDisplayed());

        }
    }


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
        ReusableMethods.waitUntilClickableAndClick(save);
        Assert.assertFalse(nameBeforeSendKeys.equals(name.getAttribute("value")));
        Assert.assertFalse(mailBeforeSendKeys.equals(email.getAttribute("value")));

        //Thread.sleep(5000);


        //save.click();

    }

    public void emailWithoutName(String isim,String mail){
        name.clear();
        name.sendKeys(isim);
        email.clear();
        email.sendKeys(mail);
        ReusableMethods.waitUntilClickableAndClick(save);


    }
    public void uyariGoruntuleme(){
        Assert.assertTrue(uyari.isDisplayed());
    }
    public void nameWithoutEmail(String isim,String mail){
        name.clear();
        name.sendKeys(isim);
        email.clear();
        email.sendKeys(mail);

    }
    public void saveValidate(){
        Assert.assertFalse(edit.isDisplayed());

    }


}
