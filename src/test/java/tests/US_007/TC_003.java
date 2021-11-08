package tests.US_007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US07_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.image.Kernel;

public class TC_003 {

    //1)Hotel dropdowndan "SelectHotel..." Room type dan "Select GroupRoomType" sec
    //2)save e tikla Select Hotel ve Select GroupRoomType errorun gorundugunu test et
    //3)Code Name Location kismini sil
    //4)save e tikla Code Name Location errorun gorundugunu test et
    //5)Max Adult Count Max Children Count kisimlarina gecersiz karakter ile giris yap(harf, ozel karakter)
    //6)save e tikla Fill All Fields Please html alert ciktigini dogrula

US07_page page=new US07_page();
Actions actions=new Actions(Driver.getDriver());
SoftAssert softAssert=new SoftAssert();
Faker faker=new Faker();

    public void setUp(){

        ReusableMethods.setup();
        ReusableMethods.waitFor(2);
        page.hotelManagementLink.click();
        page.hotelRoomsLink.click();
        ReusableMethods.waitFor(2);
        page.detailsButonu.click();

    }

    @Test(priority = -1)
    public void negativeTest() {
        setUp();

        Select select = new Select(page.hotelDropDown);
        select.selectByIndex(0);

        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        ReusableMethods.waitFor(3);
        page.saveButonu.click();

        softAssert.assertTrue(page.selectHotelLabelError.isDisplayed(), "Select Hotel error gorunmedi");
        softAssert.assertTrue(page.codeLabelError.isDisplayed());
        softAssert.assertTrue(page.nameLabelError.isDisplayed());
        softAssert.assertTrue(page.locationLabelError.isDisplayed());


        softAssert.assertAll();
Driver.getDriver().close();
    }
               }








