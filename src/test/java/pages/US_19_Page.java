package pages;



import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import utilities.Driver;



import java.util.List;



public class US_19_Page {

    private WebDriver driver;


    public US_19_Page(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver, this);

    }



    @FindBy(className="text-secondary")

    private WebElement BusinessOwnerButton;




    @FindBy(linkText="Account Management")

    private WebElement accountManagement;



    @FindBy(linkText="Roles")

    private WebElement rolesButton;



        

    @FindBy(xpath="//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2']")

    public List<WebElement> allRoles;



      

    public void clickAllRoles() {



        for(int i =0 ; i<allRoles.size() ; i++) {

            allRoles.get(i).click();

            Driver.getDriver().navigate().back();

        }}



    public void clickRoles() {

        rolesButton.click();

    }



        

    public void allRolesDisplayed() {

        WebElement roleName=driver.findElement(By.id("MainContent"));

        Assert.assertTrue(roleName.isDisplayed());



    }

    public void clickBusiness() {

        BusinessOwnerButton.click();



    }



    public void clickaccount() {

        accountManagement.click();

    }}