package tests.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US01_page;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_001 extends TestBaseReport {

    US01_page us01_page = new US01_page();

    @Test
    public void girisTesti(){
        us01_page.anaSayfa();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa-environment.concorthotel.com/";
        Assert.assertEquals(actualUrl,expectedUrl,"url ler uyusmuyor");
        Driver.closeDriver();
    }
    //deneme

}
