package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {
    private WebDriver driver;



    public LoginPage(WebDriver driver) {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//button[@id='loginButton']")
       public WebElement loginButton;
    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    @FindBy(tagName = "h4")
    public WebElement AllProducts;

    public LoginPage() {
    }
    public void Login(){
        loginButton.click();
        userName.clear();
        userName.sendKeys(ConfigReader.getProperty("email"));
        password.clear();
        password.sendKeys(ConfigReader.getProperty("password"));

    }

    public void collectiveLogin(){
        loginButton.click();
        userName.clear();
        userName.sendKeys(ConfigReader.getProperty("email"));
        password.clear();
        password.sendKeys(ConfigReader.getProperty("password"));
        signIn.click();

    }
}
