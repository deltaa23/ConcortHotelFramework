package tests.US_003;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US03_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_001 extends TestBaseReport {
    Faker faker;
    Actions actions;
    Select select;
    @Test
    public void gecerliKayitTest(){
        extentTest = extentReports.createTest("gecerliKayitTesti");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("concorthotel sayfasına gidilir");
        US03_page concortPage = new US03_page();
        concortPage.logIn.click();
        extentTest.info("Login butonuna basılır");
        concortPage.createNewAcc.click();
        extentTest.info("Create New Accaunt butonuna basilir");
         faker = new Faker();
         actions = new Actions(Driver.getDriver());
        actions.click(concortPage.userName)
                .sendKeys(faker.name().firstName()+Keys.TAB)
                .sendKeys("Asdfg1?"+Keys.TAB)
                .sendKeys(faker.internet().emailAddress()+Keys.TAB)
                .sendKeys(faker.name().fullName()+Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()+Keys.TAB)
                .sendKeys(faker.idNumber().invalid()+Keys.TAB)
                .sendKeys(faker.random().hex()).perform();
        select = new Select(concortPage.countryDropDown);
        select.selectByVisibleText("Turkey");
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress()+Keys.TAB)
                .sendKeys(faker.job().field()+Keys.TAB)
                .sendKeys("11/1/2021").perform();
        extentTest.info("tum bosluklar doldurulur");
        concortPage.saveButon.click();
        extentTest.info("save butonuna basilir");
        Assert.assertTrue(concortPage.okButonu.isEnabled());
        extentTest.info("basarili kayit yapıldıgı dogrulanır");


    }
}
