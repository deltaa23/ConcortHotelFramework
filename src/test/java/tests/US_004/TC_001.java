package tests.US_004;

import org.testng.annotations.Test;
import pages.ConcortHPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001 {



    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ConcortHPage concortHPage = new ConcortHPage();
        concortHPage.ilkLoginLinki.click();
        concortHPage.usernameKutusu.sendKeys(ConfigReader.getProperty("manager"));
        concortHPage.passwordKutusu.sendKeys(ConfigReader.getProperty("Manager1!"));
        concortHPage.loginButonu.click();
        concortHPage.HotelManagement.click();
        concortHPage.HotelListLink.click();
        concortHPage.AddHotelLink.click();

        concortHPage.Code.sendKeys(ConfigReader.getProperty("123456"));
        concortHPage.Name.sendKeys(ConfigReader.getProperty("Artvin"));
        concortHPage.Adres.sendKeys(ConfigReader.getProperty("Macahel/Artvin"));
        concortHPage.Phone.sendKeys(ConfigReader.getProperty("5452543233"));
        concortHPage.Gmail.sendKeys(ConfigReader.getProperty("macahelhote@gmail.com"));
        concortHPage.Phone.sendKeys(ConfigReader.getProperty("5452543233"));
        concortHPage.Grup.sendKeys(ConfigReader.getProperty("Hotel Type 1"));
        concortHPage.Savebutonu.click();
    }
}