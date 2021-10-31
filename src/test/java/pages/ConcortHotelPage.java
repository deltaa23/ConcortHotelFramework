package pages;

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

}


