package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US03_page {
    public US03_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement logIn;
    @FindBy (xpath = "//*[text()='Create a new account' ]")
    public WebElement createNewAcc;
    @FindBy (id="UserName")
    public WebElement userName;
    @FindBy (id="IDCountry")
    public WebElement countryDropDown;
    @FindBy (id="btnSubmit")
    public WebElement saveButon;
    @FindBy (css = "div[class='bootbox-body']")
    public WebElement kayitYazisi;
    @FindBy (xpath = "//*[text()='OK']")
    public WebElement okButonu;
}
