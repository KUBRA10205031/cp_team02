package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_05 {
    private WebDriver driver;

    public US_05() {
    }

    public US_05(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "text-secondary")
    private WebElement dropDown;

    @FindBy(linkText = "Account Management")
    private WebElement accountManagement;

    @FindBy(id = "link1")
    private WebElement subscriptionsButton;

    @FindBy(xpath = "//div[contains(@class,'card')]")
    private WebElement subscriptionsList;

    @FindBy(className = "mb-0")
    private WebElement subscriptionA3m;

    @FindBy(className = "card-title")
    private WebElement subInformation;


    public void clickSub(){
        dropDown.click();
        accountManagement.click();

    }
    public void displaySubscriptionsList(){
        subscriptionsButton.click();
        Assert.assertTrue(subscriptionsList.isDisplayed());

    }
    public void clikA3m(){
        subscriptionA3m.click();
    }public void subInformationDisplay(){
        Assert.assertTrue(subInformation.isDisplayed());
    }

}
