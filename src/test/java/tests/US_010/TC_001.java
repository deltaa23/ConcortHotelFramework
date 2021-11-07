package tests.US_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US10_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_001 extends ReusableMethods {
    //1- Bir kullanici olarak crystalkeyhotels sitesine girin
    //2- Sag ustteki Login butonuna tiklayin
    //3- Username textbox'ina bir username girin
    //4- Password textbox'ina bir password girin
    //5- Log in butonuna tiklayin
    //6- Acilan sayfanin title'inin "Profile" icerdgini dogrula
    //6- Ana sayfaya gidin
    //7- "Check Availability" butonuna tikla
    //8- Acilan sayfanin tite'inin"Rooms" kelimesini icerdigini dogrula
    //9- Listelenen odalardan birini tikla
    //10- Acilan sayfanin title'inin "Room detail" icerdigini dogrula


    US10_page us10_page = new US10_page();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void TC001() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        us10_page.ilkLoginLinki.click();

        us10_page.usernameTextbox.sendKeys(ConfigReader.getProperty("kullaniciUsername"));

        us10_page.userPasswordTextbox.sendKeys(ConfigReader.getProperty("kullaniciPassword"));

        us10_page.ikinciLoginLink.click();

        String expectedProfileTitle = "Profile";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedProfileTitle),"Acilan sayfanin title'i Profile icermiyor");

        us10_page.anasayfaLinki.click();

        us10_page.checkAvailabilityButonu.click();

        String expectedRoomsTitle = "Rooms";
        String actualRoomsTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualRoomsTitle.contains(expectedRoomsTitle),"Acilan sayfanin title'i Rooms icermiyor");

        us10_page.ilkRoomBookNow.click();

        String expectedRoomDetailTitle = "Room detail";
        String actualRoomDetailTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualRoomDetailTitle.contains(expectedRoomDetailTitle),"Acilan sayfanin title'i Room detail icermiyor");
    }

    @Test
    public void TC002() {
        //Giris tarihi textbox'ina gecerli ve ileri tarihli bir veri girin
        //Cikis tarihi textbox'ina gecerli ve ileri tarihli bir veri girin
        //Adult Count dropdown'ina tiklayip bir vizible texti sec
        //Children Count dropdown'ina tiklayip bir vizible texti sec
        //Harflerden olusan bir Kredi karti name datasi gir
        //16 rakamdan olusan Kredi karti numarasi datasi gir
        //Kredi karti son kullanma yili dropbox'indan bir visible text sec
        //Kredi karti son kullanma ayi dropbox'indan bir visible text sec
        //CVV textbox'ina 3 rakamdan olusan bir data gir
        //Mesaj textbox'ina gecerli bir data gir
        //Book this room butonuna tikla
        //"Reservation was made successfully" yazisinin gorundugunu dogrula

        //actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN);
        us10_page.checkInDateTextbox.clear();
        us10_page.checkInDateTextbox.sendKeys("11/12/2021" + Keys.TAB);
        us10_page.checkOutDateTextbox.sendKeys("11/13/2021");

        Select selectAdultCount = new Select(us10_page.adultCountTextBox);
        selectAdultCount.selectByIndex(2);

        Select selectChildrenCount = new Select(us10_page.childrenCountTextBox);
        selectChildrenCount.selectByIndex(2);

        us10_page.nameOnCreditCardTextbox.sendKeys("Mathiew Mcdonald");

        us10_page.creditCardNumberTextbox.sendKeys("1234123412341234");

        Select selectCCExpirationYear = new Select(us10_page.creditCardExpirationYearTextbox);
        selectCCExpirationYear.selectByIndex(3);

        Select selectCCExpirationMonth = new Select(us10_page.ceditCardExpirationMonthTextbox);
        selectCCExpirationMonth.selectByVisibleText("July");

        us10_page.cvvTextbox.sendKeys("123");

        us10_page.messageTextbox.sendKeys("qwerqerwetqet");

        us10_page.bookThisRoomButton.click();

        waitFor(3);
        Assert.assertTrue(us10_page.reservationsuccessfullyText.isDisplayed());

        us10_page.okSuccessfullyButton.click();
    }



}
