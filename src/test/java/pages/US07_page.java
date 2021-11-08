package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US07_page {

    WebDriver driver;
    public US07_page(){
        this.driver=driver;
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id="UserName")
    public WebElement usernameKutusu;

    @FindBy(id="Password")
    public WebElement passwordKutusu;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLink;

    @FindBy(partialLinkText = "Hotel Rooms")
    public  WebElement hotelRoomsLink;

    @FindBy (xpath = "//*[text()='List Of Hotelrooms']")
    public WebElement listofHotelRoomsYazisi;

    @FindBy (xpath = "(//*[@class='btn btn-xs default'])[7]")
    public WebElement detailsButonu;

    @FindBy (xpath = "(//div[@class='caption'])[1]")
    public WebElement editHotelRoomYazisi;

    @FindBy (id = "IDHotel")
    public WebElement hotelDropDown;

    @FindBy (xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButonu;

    @FindBy (xpath = "//*[text()='HotelRoom was updated successfully']")
    public WebElement saveBasariliHtmlError;

    @FindBy (className = "btn btn-primary")
    public WebElement htmlOKbutonu;

    @FindBy(xpath ="//label[text()='Select Hotel']")
    public WebElement selectHotelLabelError;

    @FindBy(xpath ="//label[text()='Code']")
    public WebElement codeLabelError;

    @FindBy(xpath ="//label[text()='Name']")
    public WebElement nameLabelError;

    @FindBy(xpath ="//label[text()='Location']")
    public WebElement locationLabelError;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdult;

    @FindBy(xpath = "//*[text()='Fill All Fields Please']")
    public WebElement invalidCharHtmlError;

    @FindBy (id = "btnDelete")
    public WebElement deleteButonu;

    @FindBy (linkText = "Properties")
    public WebElement propertiesButonu;

    @FindBy(xpath = "(//div[@class='caption'])[3]")
    public WebElement addPropertiesButonu;

    @FindBy(id = "lkpBarcodeTypes")
    public WebElement tipDropDown;

    @FindBy(xpath = "//*[text()='Value added']")
    public WebElement valueAddedHtml;



    public void loginCH() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        US07_page uS07page =new US07_page();
        ReusableMethods.waitFor(2);
        uS07page.ilkLoginLinki.click();
        ReusableMethods.waitFor(2);
        uS07page.usernameKutusu.sendKeys(ConfigReader.getProperty("username"));
        uS07page.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));
        uS07page.loginButonu.click();
    }






}

