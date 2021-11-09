package tests.US_010;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US10_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_003 {

    //Book this room butonuna tikla
    //Adult sayisi bos birakildiginda hata mesajini dogrula
    //Children sayisi bos birakildiginda hata mesajini dogrula
    //Credit Cart Name bos birakildiginda hata mesajini dogrula
    //Credit Cart Number bos birakildiginda hata mesajini dogrula
    //Expration Year bos birakildiginda hata mesajini dogrula
    //Expration Month bos birakildiginda hata mesajini dogrula
    //CVV bos birakildiginda hata mesajini dogrula
    //Message bos birakildiginda hata mesajini dogrula


    @Test
    public void negativeEmptyBoxTest() {
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
        us10_page.checkOutDateTextbox.clear();

        us10_page.bookThisRoomButton.click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(us10_page.checkinDateErrorText.isDisplayed(),"Checkin hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.checkoutDateErrorText.isDisplayed(),"Checkout hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.adultCountErrorText.isDisplayed(),"Adult Count hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.childrenCountErrorText.isDisplayed(),"Children Count hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.nameOnCreditCardErrorText.isDisplayed(),"Name On Credit Cart hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.creditCardNumberErrorText.isDisplayed(),"Credit Card Number hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.creditCardExpirationYearErrorText.isDisplayed(),"creditCardExpirationYear hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.ceditCardExpirationMonthErrorText.isDisplayed(),"ceditCardExpirationMonth hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.cvvErrorText.isDisplayed(),"CVV hata mesaji goruntulenemedi");
        softAssert.assertTrue(us10_page.messageErrorText.isDisplayed(),"Message hata mesaji goruntulenemedi");

        softAssert.assertAll();
    }
}
