package pages;

import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class ConcortHotelPage {
   public ConcortHotelPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }
}
