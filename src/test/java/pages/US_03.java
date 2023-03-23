package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US_03 {
    private WebDriver driver;

    public US_03(WebDriver driver) {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "btn-group")

    private WebElement kullaniciRolu;

    public void kullaniciRoluGorulme() {
        Assert.assertTrue(kullaniciRolu.isDisplayed());
    }

}