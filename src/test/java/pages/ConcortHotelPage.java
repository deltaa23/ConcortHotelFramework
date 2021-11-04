package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

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


