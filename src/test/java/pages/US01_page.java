package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_page {

   public US01_page(){
       PageFactory.initElements(Driver.getDriver(),this);
    }


    public void anaSayfa(){

      Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @FindBy(linkText = "Home")
    public WebElement homeButonu;

   @FindBy(xpath = "//span[@class='icon-twitter']")
    public WebElement twitterButonu;

   @FindBy(xpath = "(//span[@class='icon-facebook'])[2]")
    public WebElement facebookButonu;

   @FindBy(xpath = "(//span[@class='icon-instagram'])[2]")
    public WebElement instagramButonu;

   @FindBy(xpath = "(//span[@class='price mr-2'])[1]")
    public WebElement odaFiyati;


}


