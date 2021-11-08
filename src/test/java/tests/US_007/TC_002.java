package tests.US_007;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US07_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_002 {
    //1)Hotel dropdown ile degistir
    //2)Code kismina degistir
    //3)Name kismini degistir
    //4)Location kismini degistir
    //5)Description kismini sil yenisini ekle
    //6)price kismina yeni deger ata
    //7)Max adult sayisini guncelle
    //8)Max children sayisini guncelle
    //9)IsAvailable a tikla
    //10)Save butonuna tiklanildigi zaman "HotelRoom was updated successfully" html alert gorunebilir oldugunu test et

    @Test
            public void test() throws InterruptedException {
        US07_page uS07page = new US07_page();
        uS07page.loginCH();
        ReusableMethods.waitFor(2);
        Driver.getDriver().get(ConfigReader.getProperty("hrpage"));
        ReusableMethods.waitFor(2);
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        WebElement flag= uS07page.detailsButonu;

        jse.executeScript("arguments[0].scrollIntoView();",flag);
        ReusableMethods.waitFor(2);

        uS07page.detailsButonu.click();


        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());

        Select select=new Select(uS07page.hotelDropDown);
        select.selectByIndex(8);

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.number().digit())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("500")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.number().digit())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.number().digit())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();


        Assert.assertTrue(uS07page.saveBasariliHtmlError.isEnabled());



    }

}
