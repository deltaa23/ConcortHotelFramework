package tests.US_007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US07_page;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_005 {
   //1)"Properties" butonuna tikla
    //2)"Add property" gorunebilir oldugunu dogrula
    //3)Tip kismini dropdown ile sec
    //4)code gir
    //5)value gir
    //6)Save e tikla "Value added" HTML alert gorulebilir oldugunu dogrula
    //7)ok a tikla
    //8)update e tikla "Value was updated Succesfully" html alert gorundugunu dogrula
    //9)Remove a tikla "Do you want to delete this barcode?"html alert gorundugunu dogrula
    //10) ok a tiklayina "Value was deleted Succesfully" html alert geldiini dogrula


    US07_page page=new US07_page();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
    Faker faker=new Faker();
    TC_003 setup=new TC_003();

    @Test
    public void test(){
        setup.setUp();
        page.propertiesButonu.click();
        ReusableMethods.waitFor(2);

        actions.sendKeys(Keys.END).sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(page.addPropertiesButonu.isDisplayed());
        softAssert.assertAll();

        Select select=new Select(page.tipDropDown);
        select.selectByIndex(3);

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.number().digit())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.number().digits(4))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .perform();

        Assert.assertTrue(page.valueAddedHtml.isDisplayed() ,"HTML alet gorunmedi");

        Driver.getDriver().close();



    }






}
