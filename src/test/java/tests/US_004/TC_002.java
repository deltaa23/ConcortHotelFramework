package tests.US_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_002 {
    //otel oluştturma negatif test
    //code  girilmiyor

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ConcortHPage concortHPage = new ConcortHPage();
        concortHPage.ilkLoginLinki.click();
        concortHPage.usernameKutusu.sendKeys(ConfigReader.getProperty("username"));
        concortHPage.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));
        concortHPage.loginButonu.click();
        concortHPage.HotelManagement.click();
        concortHPage.HotelListLink.click();
        concortHPage.AddHotelLink.click();

        concortHPage.Code.sendKeys(ConfigReader.getProperty("code1"));
        concortHPage.Name.sendKeys(ConfigReader.getProperty("name"));
        concortHPage.Adres.sendKeys(ConfigReader.getProperty("adres"));
        concortHPage.Phone.sendKeys(ConfigReader.getProperty("tlf"));
        concortHPage.Gmail.sendKeys(ConfigReader.getProperty("mail"));
        concortHPage.Grup.sendKeys(ConfigReader.getProperty("grup"));
        Thread.sleep(2000);

        concortHPage.Savebutonu.click();
        Thread.sleep(3000);
        Driver.closeDriver();

    }

}

