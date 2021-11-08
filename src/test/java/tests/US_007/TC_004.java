package tests.US_007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US07_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_004 {
    //4)save e tikla Code Name Location errorun gorundugunu test et
    //5)Max Adult Count Max Children Count kisimlarina gecersiz karakter ile giris yap(harf, ozel karakter)
    //6)save e tikla Fill All Fields Please html alert ciktigini dogrula

    US07_page page=new US07_page();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
    Faker faker=new Faker();
    TC_003 setup=new TC_003();

    @Test
    public void negativeTest(){
        setup.setUp();
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        page.maxAdult.sendKeys(ConfigReader.getProperty("invalidCharacter1"));
        actions.sendKeys(Keys.TAB)
                .sendKeys("invalidCharacter2")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        ReusableMethods.waitFor(2);
        Assert.assertTrue(page.invalidCharHtmlError.isDisplayed());

        // Driver.getDriver().close();



    }
}
