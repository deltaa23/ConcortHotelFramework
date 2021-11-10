package tests.US_002;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.US02_page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_002 extends TestBaseReport {

//    Herhangi bir alanin bos birakilmasi durumunda  (Kullanici adi ya da sifre) login butonuna
//    tiklandiginda girise izin vermemeli ve "This field is requireed." hata mesaji alinmalidir.
//
//    1.Kullanici https://www.concorthotel.com/ anasayfasina giris yapar ve login sayfasina tiklar.
//    2.Kullanici adi kutusu bos birakilir
//    3.Password alani bos birakilir.
//    4.Login butonuna tiklanir.
//    5.Kullanici kutusu altinda "This field is required" hata mesaji gorulmelidir.
//    6.Sifre kutucugu altinda "This field is required" mesaji gorulmelidir.

    private US02_page page;

    @BeforeClass
    public void beforeClass() {
         page = new US02_page();
    }

    @Test
    public void emptyUserNameInputTest() {
        extentTest = extentReports.createTest("emptyUserNameInputTest");
        page.anaSayfa();
        ReusableMethods.waitForClickablility(page.ilkLoginLinki, 10);
        page.ilkLoginLinki.click();
        extentTest.info("Login linkine tiklandi.");
        ReusableMethods.waitForClickablility(page.loginButonu, 10);
        page.loginButonu.click();
        extentTest.info("Login butonuna tiklandi.");
        Assert.assertTrue(page.userNameInputRequired.isDisplayed());
        extentTest.info("This field is required hata mesaji goruldu");
    }

    @Test
    public void emptyPasswordInputTest() {
        extentTest = extentReports.createTest("emptyPasswordInputTest");
        page.anaSayfa();
        ReusableMethods.waitForClickablility(page.ilkLoginLinki, 10);
        page.ilkLoginLinki.click();
        extentTest.info("Sag ust kosedeki login linkine tiklandi.");
        ReusableMethods.waitForClickablility(page.loginButonu, 10);
        page.loginButonu.click();
        extentTest.info("Login butonuna tikla.");
        Assert.assertTrue(page.passwordInputRequired.isDisplayed());
        extentTest.info("This field is required mesaji goruldu");
        extentTest.pass("");
    }

    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }
}
