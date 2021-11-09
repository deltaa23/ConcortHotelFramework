package SmokeTest;

import com.aventstack.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.logging.Logger;

public class PositiveLoginTest {


    private Object extentTest;

    @Test(groups = "smoke")
    public void positiveSmokeTest(ExtentReports extentTest){
        Logger ExtentTest = extentTest.createTest("Positive giris testi", "Concort Hotel dogru kullanici adi ve sifre giris testi");
        extentTest.info("Concort hotel adresine git");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ConcortHPage concortHPage = new ConcortHPage();
        concortHPage.ilkLoginLinki.click();
        extentTest.info("Ilk login tusuna tikla");
        concortHPage.usernameKutusu.sendKeys(ConfigReader.getProperty("username"));
        extentTest.info("Dogru kullanici adini gir");
        concortHPage.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Dogru sifreyi gir");
        concortHPage.loginButonu.click();
        extentTest.info("Login butonuna tikla");
        concortHPage.HotelManagement.click();
        concortHPage.HotelListLink.click();
        concortHPage.AddHotelLink.click();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("chotel_basarili_giris_url"));
       // extentTest.pass("Basarili sekilde giris yapildi, Test PASSED");
        Driver.closeDriver();



    }
}