package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_13 {
    private WebDriver driver;

    public US_13(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement businessOwner;


    @FindBy(linkText = "Account Management")
    public WebElement accountManagement;

    @FindBy(id = "link5")
    public WebElement teamsButton;


    @FindBy(xpath = "//button[text()=' Add New ']")
    public WebElement addNewTeamButton;


    @FindBy(id = "name")
    public WebElement teamName;

    //div[@class=' css-1dimb5e-singleValue']
    //  @FindBy(xpath = "//div[@class=' css-1dimb5e-singleValue']")
    //  public WebElement departmentType;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement saveButton;

    //  @FindBy(xpath = "//button[text()='Save']")
    //  public WebElement saveButton1;


    @FindBy(xpath = "(//b[text()='team02brs'])[1]")
    public WebElement newTeam;

    @FindBy(id = "search")
    public WebElement searchBox;

    @FindBy(xpath = "(//a[text()='Teams'])[2]")
    public WebElement teamsBut;

    @FindBy(xpath = "//span[contains(@class,'text-danger')]")
    public WebElement teamNameErr;
    //
    @FindBy(xpath = "//span[text()='Please select a type for department']")
    public WebElement departmentTypeErr;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement departmentTypeCancel;


    //
    @FindBy(xpath = "//p[@class='card-text']")
    public List<WebElement> teamsSizeBefore;
    //
    @FindBy(xpath = "//p[@class='card-text']")
    public List<WebElement> teamsSizeAfter;
    //
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement editTeamButton;

    @FindBy(xpath = "(//b[text()='team02brs2'])[1]")
    public WebElement editedTeam;
    //
    @FindBy(xpath = "//button[text()='Delete Department']")
    public WebElement deleteTeam;
    //
    @FindBy(xpath = "//div[@class='col'])[8]]")
    public WebElement confirmDeletedTeam;

   // @FindBy(xpath = "(//div[@class='col'])[8]")
   // public WebElement bosTeamShow;


    @FindBy(xpath = "//div[@class='row mb-3']")
   public WebElement den;

    @FindBy(xpath = "//h3[text()='Teams']")
    public WebElement teams;















  /*  @FindBy(xpath = "//span[text()='team02brs']")
    public WebElement addedTeamVisible;

   */







/*
    @FindBy(xpath = "//button[text()='Save']")
    public WebElement saveButton;

    Actions actions = new Actions(Driver.getDriver());

public void sendValidKeys() {
        teamName.sendKeys("team02brs");
        departmentType.click();

        saveButton.click();


    }

    */


    public void clickAccountManagementButton() {
        businessOwner.click();
        System.out.println("BussinesOwner tıklandı");
        accountManagement.click();
        System.out.println("Account Management tıklandı");

    }

    /*

     */


}
