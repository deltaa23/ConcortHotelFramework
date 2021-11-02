package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConcortHPage {


    public ConcortHPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id = "UserName")
    public WebElement usernameKutusu;

    @FindBy(id = "Password")
    public WebElement passwordKutusu;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement HotelManagement;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement HotelListLink;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement AddHotelLink;

    @FindBy(id = "Code")
    public WebElement Code;

    @FindBy(id = "Name")
    public WebElement Name;

    @FindBy(id = "Address")
    public WebElement Adres;

    @FindBy(id = "Phone")
    public WebElement Phone;

    @FindBy(id = "Email")
    public WebElement Gmail;

    @FindBy(id = "IDGroup")
    public WebElement Grup;

    @FindBy(id = "btnSubmit")
    public WebElement Savebutonu;

}
