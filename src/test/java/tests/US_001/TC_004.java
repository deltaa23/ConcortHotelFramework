package tests.US_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US01_page;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_004 extends TestBaseReport {
    //Ana sayfada Our Rooms bölümünde oda fiyatları görünür olmalıdır.
    //1- Kullanıcı concorthotel sayfasına gider
    //2-Kullanıcı our rooms bölümüne gider
    //3-Kullanıcının oda fiyatlarını görmesi gerekir
    US01_page us01_page = new US01_page();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void odaFiyatlari() throws InterruptedException {
        extentTest=extentReports.createTest("odaFiyatlari");
        us01_page.anaSayfa();
        actions.sendKeys(""+Keys.PAGE_DOWN+Keys.PAGE_DOWN+Keys.PAGE_DOWN+Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(us01_page.odaFiyati.isDisplayed(),"oda fiyati gorunmuyor");
        softAssert.assertAll();
        extentTest.pass("");
    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
