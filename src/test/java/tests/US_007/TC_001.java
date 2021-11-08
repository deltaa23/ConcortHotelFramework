package tests.US_007;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US07_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_001 {
    //1)Hotel rooms sayfasinin acik oldugunu doğrula
    //2)"Detail" butonuna tikla
    //3)"Edit Hotelroom" yazisinin gorunebilir oldugunu test et

    @Test
    public void test() throws InterruptedException {
        US07_page uS07page =new US07_page();
        uS07page.loginCH();
        Driver.getDriver().get(ConfigReader.getProperty("hrpage"));


        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        WebElement flag= uS07page.detailsButonu;
        jse.executeScript("arguments[0].scrollIntoView();",flag);
        ReusableMethods.waitFor(2);

        uS07page.detailsButonu.click();

        Assert.assertEquals(uS07page.editHotelRoomYazisi.getText(),"Edit Hotelroom");
        Driver.getDriver().close();





    }
}
