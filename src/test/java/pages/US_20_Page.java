package pages;



import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import utilities.Driver;



import java.util.List;



public class US_20_Page {



    private WebDriver driver;



    public US_20_Page(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver, this);

    }

    @FindBy(className="text-secondary")

    private WebElement BusinessOwnerButton;



        

    @FindBy(linkText="Account Management")

    private WebElement accountManagement;



    @FindBy(linkText="Roles")

    private WebElement rolesButton;



    @FindBy(className="col-lg-4 col-md-4 col-sm-6 col-12 d-grid mb-2")

    private  WebElement permissions;



    @FindBy(xpath="//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2']")

    public List<WebElement> allRoles;



        

    public void clickRoles() {

        rolesButton.click();

    }



    public void clickBusiness() {

        BusinessOwnerButton.click();





    }

    public void clickaccount() {

        accountManagement.click();





    }

    public void permissionsList() {

        List<WebElement> permissionList=driver.findElements(By.className("col-lg-4 col-md-4 col-sm-6 col-12 d-grid mb-2"));



        for (int i=0; i < allRoles.size(); i++) {

            for (WebElement each : permissionList) {

                System.out.println("permissionList = " + each.getText());

                Driver.getDriver().navigate().back();



                { } }

        }

    }

    public void permissionDisplayed(){

        Assert.assertTrue(permissions.isDisplayed());

    }

}