package tests.US_010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US10_page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001 {
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


}
