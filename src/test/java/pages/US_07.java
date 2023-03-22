package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_07 {
    private WebDriver driver;

    public US_07(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "link3")
    private WebElement departmentsBttn;

    @FindBy(xpath = "//div[@class='col-3']")
    private List<WebElement> depList;

    public void departmentsClick(){
        departmentsBttn.click();
    }

    public void departmentsDisplay(){
        for (WebElement e:depList
             ) {
            Assert.assertTrue(e.isDisplayed());

        }
    }






}
