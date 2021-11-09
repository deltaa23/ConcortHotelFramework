package tests.US_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.US01_page;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_005 extends TestBaseReport {
    //Ana sayfada Our Rooms bölümünün altında Happy Guests,Rooms, Staffs, Destination yazıları gözükmeli
    //1- Kullanıcı concorthotel sayfasına gider
    //2-Kullanıcı our rooms bölümünün altına gider
    //3-Kullanıcı istenen yazıları görmeli
    US01_page us01_page = new US01_page();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void test() throws InterruptedException {
        extentTest=extentReports.createTest("gorulmesi istenen yazilar");
        us01_page.anaSayfa();
        actions.sendKeys(""+ Keys.PAGE_DOWN+Keys.PAGE_DOWN+Keys.PAGE_DOWN+Keys.PAGE_DOWN+Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        WebElement yazi = Driver.getDriver().findElement(By.xpath("//span[.='Happy Guests']"));
        Assert.assertTrue(yazi.isDisplayed());
        extentTest.pass("");
    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
