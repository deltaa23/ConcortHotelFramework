package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.ConfigReader;
import utilitis.Driver;

public class ConcortHotelPage {

   public ConcortHotelPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    public void anaSayfa(){
       Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @FindBy(linkText = "Home")
    public WebElement homeButonu;


}


