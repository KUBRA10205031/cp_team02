package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;

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


    public void clickCompanyAndEdit(){
        ReusableMethods.waitUntilElementVisible(company);
        ReusableMethods.waitUntilClickableAndClick(company);

        edit.click();
    }
    public void enterNameAndMail(String isim,String mail) throws InterruptedException {
        String nameBeforeSendKeys=name.getAttribute("value");
        String mailBeforeSendKeys=email.getText();
        name.clear();
        name.sendKeys(isim);
        email.clear();
        email.sendKeys(mail);
        Assert.assertFalse(nameBeforeSendKeys.equals(name.getText()));
        Assert.assertFalse(mailBeforeSendKeys.equals(email.getText()));

        //Thread.sleep(5000);

        ReusableMethods.waitUntilClickableAndClick(save);
        //save.click();

    }
    public void saveValidate(){
        ReusableMethods.waitUntilElementVisible(edit);

        Assert.assertTrue(edit.isDisplayed());
    }

}
