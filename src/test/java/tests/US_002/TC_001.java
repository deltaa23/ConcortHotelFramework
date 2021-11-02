package tests.US_002;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.US02_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_001 extends TestBaseReport {

//    Ana sayfada login butonuna tiklandiginda Login sayfasina yonlendirmelidir.

//    1.Kullanici https://www.concorthotel.com/ anasayfasina giris yapar.
//    2.Sag ust kosedeki login butonuna tiklar.
//    3.Login sayfasina giris yapip yapmadigini kontrol eder.

    private US02_page page;


    @BeforeClass
    public void setUp() {
        page = new US02_page();
    }

    @Test
    public void loginPageTest() {
        extentTest = extentReports.createTest("loginPageTest");
        page.anaSayfa();
        extentTest.info("Sag ust kosedeki login butonuna tikla.");
        page.ilkLoginLinki.click();
        extentTest.info("Login sayfasina giris yapip yapmadigini kontrol et.");
        String expectedLoginUrl = ConfigReader.getProperty("CHQALoginUrl");
        String actualLoginUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedLoginUrl, actualLoginUrl, "Login sayfasi basariyla acildi");
        extentTest.info("Login sayfasina giris yapip yapmadigini kontrol edildi.");
        extentTest.pass("");
    }

    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }
}
