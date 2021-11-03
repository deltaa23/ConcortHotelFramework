package tests.US_007;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CH_HotelRoomsPage;
import pages.ConcortHotelPage;
import utilitis.ConfigReader;
import utilitis.Driver;

import javax.swing.text.html.parser.DTD;

public class TC_001 {
    //1)Hotel rooms sayfasinin acik oldugunu doğrula
    //2)"Detail" butonuna tikla
    //3)"Edit Hotelroom" yazisinin gorunebilir oldugunu test et

    @Test
    public void test() throws InterruptedException {
        CH_HotelRoomsPage ch_hotelRoomsPage=new CH_HotelRoomsPage();
        ch_hotelRoomsPage.loginCH();
        Driver.getDriver().get(ConfigReader.getProperty("hrpage"));


        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        WebElement flag=ch_hotelRoomsPage.detailsButonu;
        jse.executeScript("arguments[0].scrollIntoView();",flag);
        Thread.sleep(2000);

        ch_hotelRoomsPage.detailsButonu.click();

        Assert.assertEquals(ch_hotelRoomsPage.editHotelRoomYazisi.getText(),"Edit Hotelroom");
        Driver.getDriver().close();





    }
}
