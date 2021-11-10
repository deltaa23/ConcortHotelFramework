package tests.US_002;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.US02_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_004 extends TestBaseReport {

//    Yonetici dogru kullanici adi ve sifre ile giris yapabilmelidir.

//    1.Kullanici https://www.concorthotel.com/ anasayfasina giris yapar ve login butonuna tiklar.
//    2.Kullanici, kullanici adi kutusuna gecerli bir kullanici ismi girer.
//    3. Kullanici, sifre kutusuna gecerli bir sifre girer.
//    4. Login butonuna tiklar.
//    5. Sag ust kosede yonetici yazisinin tiklanabilir oldugunu kontrol eder.

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
        page.usernameKutusu.clear();
        page.passwordKutusu.clear();
        page.usernameKutusu.sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
        page.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        page.loginButonu.click();
        extentTest.info("Login butonuna tiklandi.");
        String expectedUrl = ConfigReader.getProperty("CHQAAdminPage");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        extentTest.info("Yonetici yazisina tiklanabildigi dogrulandi");
        extentTest.pass("");
    }

    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }

}