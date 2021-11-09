package tests.US_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US10_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_004 {

//Giris tarihi textbox'ina gecerli ve ileri tarihli bir veri girin
//Cikis tarihi textbox'ina gecerli ve ileri tarihli bir veri girin
//Adult Count dropdown'ina tiklayip bir vizible texti sec
//Children Count dropdown'ina tiklayip bir vizible texti sec
//Harflerden olusan bir Kredi karti name datasi gir
//13 rakamdan olusan eksik Kredi karti numarasi datasi gir
//Kredi karti son kullanma yili dropbox'indan bir visible text sec
//Kredi karti son kullanma ayi dropbox'indan bir visible text sec
//CVV textbox'ina 3 rakamdan olusan bir data gir
//Mesaj textbox'ina gecerli bir data gir
//Book this room butonuna tikla

    @Test
    public void negativeMissingCreditCard() {

        US10_page us10_page = new US10_page();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        us10_page.ilkLoginLinki.click();
        us10_page.usernameTextbox.sendKeys(ConfigReader.getProperty("kullaniciUsername"));
        us10_page.userPasswordTextbox.sendKeys(ConfigReader.getProperty("kullaniciPassword"));
        us10_page.ikinciLoginLink.click();
        us10_page.anasayfaLinki.click();
        us10_page.checkAvailabilityButonu.click();
        us10_page.ilkRoomBookNow.click();

        us10_page.checkInDateTextbox.clear();
        us10_page.checkInDateTextbox.sendKeys("11/12/2021" + Keys.TAB);
        us10_page.checkOutDateTextbox.sendKeys("11/13/2021");

        Select selectAdultCount = new Select(us10_page.adultCountTextBox);
        selectAdultCount.selectByIndex(2);

        Select selectChildrenCount = new Select(us10_page.childrenCountTextBox);
        selectChildrenCount.selectByIndex(2);

        us10_page.nameOnCreditCardTextbox.sendKeys("Mathiew Mcdonald");

        us10_page.creditCardNumberTextbox.sendKeys("1234123412341");

        Select selectCCExpirationYear = new Select(us10_page.creditCardExpirationYearTextbox);
        selectCCExpirationYear.selectByIndex(3);

        Select selectCCExpirationMonth = new Select(us10_page.ceditCardExpirationMonthTextbox);
        selectCCExpirationMonth.selectByVisibleText("July");

        us10_page.cvvTextbox.sendKeys("123");

        us10_page.messageTextbox.sendKeys("qwerqerwetqet");

        us10_page.bookThisRoomButton.click();

        ReusableMethods.waitFor(3);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(us10_page.creditCardNumberErrorText.isDisplayed(),"Credit Card Number hata mesaji goruntulenemedi");

        softAssert.assertAll();
    }
}
