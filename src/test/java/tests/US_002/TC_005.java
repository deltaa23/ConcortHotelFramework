package tests.US_002;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.US02_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_005 extends TestBaseReport {

//    Yonetici henuz kaydolmadiysa login sayfasindan kayit sayfasina gidebilmelidir.

//    1.Kullanici https://www.concorthotel.com/ anasayfasina giris yapar
//    2.Sag ust kosedeki login sayfasina tiklar.
//    3."Create a new account" butonuna tiklar.
//    4. Register sayfasinda oldugunu kontrol eder.

    private US02_page page;

    @BeforeClass
    public void beforeClass() {
        page = new US02_page();
    }

    @Test
    public void positiveLoginTest() {

        extentTest = extentReports.createTest("positiveLoginTest");
        page.anaSayfa();
        page.ilkLoginLinki.click();
        extentTest.info("Login linkine tiklandi.");
        page.createNewAccountButonu.click();
        extentTest.info("Login butonuna tiklandi.");

        String expectedUrl= ConfigReader.getProperty("CHQACreateAccountNewPage");
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        extentTest.info("Register sayfasina gidildigi dogrulandi.");
        extentTest.pass("");

    }

    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }

}