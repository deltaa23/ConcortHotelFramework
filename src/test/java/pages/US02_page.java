package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US02_page {

    public US02_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void anaSayfa(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id="UserName")
    public WebElement usernameKutusu;

    @FindBy(id="Password")
    public WebElement passwordKutusu;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//*[.='Try again please']")
    public WebElement loginFailedYazisi;

    @FindBy(xpath = "//label[@for='UserName' and text()='This field is required.']")
    public WebElement userNameInputRequired;

    @FindBy(xpath = "//label[@for='Password' and text()='This field is required.']")
    public WebElement passwordInputRequired;

    @FindBy(xpath = "//*[@id=\"add-form\"]/div[4]/a/span")
    public  WebElement createNewAccountButonu;
}
