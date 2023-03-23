package pages;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;


public class US_15Pages {
    private WebDriver driver;

    public US_15Pages(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @FindBy (xpath="(//*[text()='Business Owner'])[1]")
    public WebElement dropdown;

    @FindBy(linkText = "Account Management")
    public WebElement accountManagement;

    @FindBy(linkText ="Users")
    WebElement Users;

    @FindBy(id="search")
    WebElement search;

    @FindBy(xpath = "(//tr[@role='row'])[1]")
    WebElement firstrow;


    public void BusinessOwner() {
        dropdown.click();

    }

    public void accountManagement() {
        accountManagement.click();
    }

    public void Users() {
        Users.click();
    }

    public  void search(){

        wait.until(ExpectedConditions.visibilityOf(firstrow));

        search.sendKeys("julie.baumbach"+ Keys.ENTER);

    }
    public  void green(){
        Assert.assertTrue(firstrow.isDisplayed());

    }

    public  void redSearch(){

        wait.until(ExpectedConditions.visibilityOf(firstrow));

        search.sendKeys("sirus.48"+ Keys.ENTER);

    }

    public  void red(){

        Assert.assertTrue(firstrow.isDisplayed());

    }

}
