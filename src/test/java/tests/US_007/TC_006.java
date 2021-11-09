package tests.US_007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US07_page;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_006 {
    //1)"Properties" butonuna tikla
    //2)"Add property" gorunebilir oldugunu dogrula
    //
    //4)Value kismini bos birak
    //5)"Value couldn't be added, provide a value please" HTML alert i geldigini dogrula
    US07_page page=new US07_page();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert;

    TC_003 setup=new TC_003();

    @Test
    public void test() {
        softAssert=new SoftAssert();
        setup.setUp();
        page.propertiesButonu.click();
        ReusableMethods.waitFor(2);

        actions.sendKeys(Keys.END).sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(page.addPropertiesButonu.isDisplayed());
        ReusableMethods.waitFor(2);
        softAssert.assertAll();
        page.propertiesSaveButonu.click();

        Assert.assertTrue(page.propertiesHtmlValueAlert.isEnabled());


        Driver.getDriver().close();
    }

}
