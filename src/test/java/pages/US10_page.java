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


    @FindBy(id = "checkin_date")
    public WebElement checkInDateTextbox;

    @FindBy(id = "checkout_date")
    public WebElement checkOutDateTextbox;

    @FindBy(id = "AdultCount")
    public WebElement adultCountTextBox;

    @FindBy(id = "ChildrenCount")
    public WebElement childrenCountTextBox;

    @FindBy(id = "NameOnCreditCard")
    public WebElement nameOnCreditCardTextbox;

    @FindBy(id = "CreditCardNumber")
    public WebElement creditCardNumberTextbox;

    @FindBy(id = "CreditCardExpirationYear")
    public WebElement creditCardExpirationYearTextbox;

    @FindBy(id = "CreditCardExpirationMonth")
    public WebElement ceditCardExpirationMonthTextbox;

    @FindBy(id = "CVV")
    public WebElement cvvTextbox;

    @FindBy(id = "Message")
    public WebElement messageTextbox;

    @FindBy(xpath = "//input[@value='Book this room']")
    public WebElement bookThisRoomButton;

    @FindBy(className = "bootbox-body")
    public WebElement reservationsuccessfullyText;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okSuccessfullyButton;



    @FindBy(xpath = "//label[@for='checkin_date']")
    public WebElement checkinDateErrorText;

    @FindBy(xpath = "//label[@for='checkout_date']")
    public WebElement checkoutDateErrorText;

    @FindBy(xpath = "//label[@for='AdultCount']")
    public WebElement adultCountErrorText;

    @FindBy(xpath = "//label[@for='ChildrenCount']")
    public WebElement childrenCountErrorText;

    @FindBy(xpath = "//label[@for='NameOnCreditCard']")
    public WebElement nameOnCreditCardErrorText;

    @FindBy(xpath = "//label[@for='CreditCardNumber']")
    public WebElement creditCardNumberErrorText;

    @FindBy(xpath = "//label[@for='CreditCardExpirationYear']")
    public WebElement creditCardExpirationYearErrorText;

    @FindBy(xpath = "//label[@for='CreditCardExpirationMonth']")
    public WebElement ceditCardExpirationMonthErrorText;

    @FindBy(xpath = "//label[@for='CVV']")
    public WebElement cvvErrorText;

    @FindBy(xpath = "//label[@for='Message']")
    public WebElement messageErrorText;













}
