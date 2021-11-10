package tests.US_002;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.US02_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_003 extends TestBaseReport {

//    Kullanici adi veya sifre yanlis girildiginde girise izin vermemeli
//    ve "Username or password is incorrect, please correct it and try again" mesaji alinmalidir.

//    1.Kullanici https://www.concorthotel.com/ anasayfasina giris yapar ve login butonuna tiklar.
//    2.Kullanici, kullanici adi kutusuna gecersiz bir kullanici ismi girer.
//    3. Kullanici, sifre kutusuna gecersiz bir sifre girer.
//    4.Login butonuna tiklar ve hata mesaji alir.

    private US02_page page;

    @BeforeClass
    public void beforeClass() {
         page = new US02_page();
    }

    @Test
    public void wrongUsernameTest() {
        extentTest = extentReports.createTest("wrongUsernameTest");

        page.anaSayfa();
        page.ilkLoginLinki.click();
        extentTest.info("Login linkine tiklandi.");
        page.usernameKutusu.clear();
        page.passwordKutusu.clear();
        page.usernameKutusu.sendKeys(ConfigReader.getProperty("CHQAInvalidUsername"));
        page.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        page.loginButonu.click();
        extentTest.info("Login butonuna tiklandi.");
        Assert.assertTrue(page.loginFailedYazisi.isDisplayed());
        extentTest.info("Login hatasi mesaji alindi.");
    }

    @Test
    public void wrongPasswordTest() {
        extentTest = extentReports.createTest("wrongPasswordTest");

        page.anaSayfa();
        page.ilkLoginLinki.click();
        extentTest.info("Login linkine tiklandi.");
        page.usernameKutusu.clear();
        page.passwordKutusu.clear();
        page.usernameKutusu.sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
        page.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAInvalidPassword"));
        page.loginButonu.click();
        extentTest.info("Login butonuna tiklandi.");
        Assert.assertTrue(page.loginFailedYazisi.isDisplayed());
        extentTest.info("Login hatasi mesaji alindi.");
        extentTest.pass("");
    }

    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }
}
