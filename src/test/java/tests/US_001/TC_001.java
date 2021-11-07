package tests.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
<<<<<<< HEAD
import pages.ConcortHotelPage;
import utilities.Driver;
=======
import pages.US01_page;
import utilities.Driver;
import utilities.TestBaseReport;
>>>>>>> master

public class TC_001 extends TestBaseReport {

    US01_page concortHotelPage = new US01_page();

    @Test
    public void girisTesti(){
        concortHotelPage.anaSayfa();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa-environment.concorthotel.com/";
        Assert.assertEquals(actualUrl,expectedUrl,"url ler uyusmuyor");
        Driver.closeDriver();
    }

}
