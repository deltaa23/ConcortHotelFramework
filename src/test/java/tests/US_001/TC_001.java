package tests.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.Driver;

public class TC_001 {

    ConcortHotelPage concortHotelPage = new ConcortHotelPage();

    @Test
    public void girisTesti(){
        concortHotelPage.anaSayfa();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa-environment.concorthotel.com/";
        Assert.assertEquals(actualUrl,expectedUrl,"url ler uyusmuyor");
        Driver.closeDriver();
    }
// yazi

}
