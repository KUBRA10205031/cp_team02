package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US_02 {
    private WebDriver driver;
    public US_02(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

   // @FindBy(id = "divCollapseUncollapse")
    @FindBy(css = "svg[alt='Collapse']")
    private WebElement kenarcubugu;

    @FindBy(id = "link11")
    private WebElement menuler;

    @FindBy(className = "navbar-brand")
    private WebElement logo;

    @FindBy(id = "searchWord")
    private WebElement search;



    public void Clikkenar(){
        kenarcubugu.click();
    }
    public void menudogrulama(){
        Assert.assertFalse(menuler.isDisplayed());
    }
    public void logo(){
        logo.click();
    }
    public void aramagorulme(){
        Assert.assertTrue(search.isDisplayed());

    }

}
