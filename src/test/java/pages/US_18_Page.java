package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_18_Page {

    private WebDriver driver;



    public US_18_Page(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver, this);

    }



    @FindBy(className="text-secondary")

    private WebElement BusinessOwnerButton;





    @FindBy(linkText="Account Management")

    private WebElement accountManagement;



    @FindBy(linkText="Roles")

    private WebElement rolesButton;





    public void clickBusiness() {

        BusinessOwnerButton.click();



    }



    public void clickaccount() {

        accountManagement.click();

    }



    public void clickRoles() {

        rolesButton.click();

    }


    public void allRolesList() {



        List<WebElement> allRoles=driver.findElements(By.xpath("//button[@class='btn btn-light border w-100 mw-100 text-start']"));

        for (WebElement each : allRoles) {

            System.out.println(each.getText());

        }



    }



    public void allRolesDisplayed() {

        WebElement roleName=driver.findElement(By.id("MainContent"));

        Assert.assertTrue(roleName.isDisplayed());



    }



}
