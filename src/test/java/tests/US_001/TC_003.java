package tests.US_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US01_page;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_003 extends TestBaseReport {
    //Sayfanın en altında sosyal medya bağlantıları olmalı
    //1-Kullanıcı concorthotel sayfasına gider
    //2-Kullanıcı sayfanın en altına iner
    //3-Kullanıcı linkleri görüp tıklar

    US01_page us01_page = new US01_page();
    Actions actions = new Actions(Driver.getDriver());
    @BeforeMethod
    public void setup(){
        us01_page.anaSayfa();
    }

    @Test
    public void test01_twitter(){
        extentTest=extentReports.createTest("twitter");
        String title = Driver.getDriver().getTitle();
        extentTest.info("sayfanin en altina gidildi");
        actions.sendKeys(Keys.END).perform();
        us01_page.twitterButonu.click();
        String newTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(!title.equals(newTitle),"twitter linki calismiyor");
        extentTest.pass("test basarisiz");
    }
    @Test
    public void test02_facebook(){
        extentTest=extentReports.createTest("facebook");
        String title = Driver.getDriver().getTitle();
        extentTest.info("sayfanin en altina gidildi");
        actions.sendKeys(Keys.END).perform();
        us01_page.facebookButonu.click();
        String newTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(!title.equals(newTitle),"facebook linki calismiyor");
        extentTest.fail("test basarisiz");

    }
    @Test
    public void test03_instagram(){
        extentTest=extentReports.createTest("instagram");
        String title = Driver.getDriver().getTitle();
        extentTest.info("sayfanin en altina gidildi");
        actions.sendKeys(Keys.END).perform();
        us01_page.instagramButonu.click();
        String newTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(!title.equals(newTitle),"instagram linki calismiyor");
        extentTest.fail("test basarisiz");

    }
}
