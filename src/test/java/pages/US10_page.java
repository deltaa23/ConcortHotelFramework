package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10_page {

    public US10_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilkLoginLinki;

    @FindBy(id = "UserName")
    public WebElement usernameTextbox;

    @FindBy(id = "Password")
    public WebElement userPasswordTextbox;

    @FindBy(id = "btnSubmit")
    public WebElement ikinciLoginLink;

    @FindBy(linkText = "Home")
    public WebElement anasayfaLinki;

    @FindBy(xpath = "//input[@value='Check Availability']")
    public WebElement checkAvailabilityButonu;

    @FindBy(xpath = "(//a[@class='btn-custom'])[1]")
    public WebElement ilkRoomBookNow;
}
