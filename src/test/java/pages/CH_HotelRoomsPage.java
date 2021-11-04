package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class CH_HotelRoomsPage {

    WebDriver driver;
    public CH_HotelRoomsPage(){
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

    @FindBy (xpath = "//*[text()='List Of Hotelrooms']")
    public WebElement listofHotelRoomsYazisi;

    @FindBy (xpath = "//*[@class='btn btn-xs default']")
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

    @FindBy (id = "btnDelete")
    public WebElement deleteButonu;

    @FindBy (linkText = "Properties")
    public WebElement propertiesButonu;

    @FindBy(id = "lkpBarcodeTypes")
    public WebElement tipDropDown;



    public void loginCH() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        CH_HotelRoomsPage ch_hotelRoomsPage=new CH_HotelRoomsPage();
        Thread.sleep(3000);
        ch_hotelRoomsPage.ilkLoginLinki.click();
        Thread.sleep(200);
        ch_hotelRoomsPage.usernameKutusu.sendKeys(ConfigReader.getProperty("username"));
        ch_hotelRoomsPage.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));
        ch_hotelRoomsPage.loginButonu.click();
    }






}

