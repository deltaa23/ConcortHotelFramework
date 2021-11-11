package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.US01_page;
import utilities.Driver;
import utilities.TestBaseReport;

public class s1TC_001 extends TestBaseReport {

    US01_page us01_page = new US01_page();

    @Test(groups = "smoke")
    public void girisTesti() {
        us01_page.anaSayfa();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa-environment.concorthotel.com/";
        Assert.assertEquals(actualUrl, expectedUrl, "url ler uyusmuyor");
        Driver.closeDriver();
    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}
