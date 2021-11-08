package tests.US_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US01_page;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_002 extends TestBaseReport {
    //Navbardaki yönlendirmelere tıklanabilmeli
    //1- https://qa-environment.concorthotel.com/ linkini arama çubuğuna yaz
    //2- home butonunu kontrol et
    //3- rooms butonunu kontrol et
    //4- restaurant butonunu kontrol et
    //5- about butonunu kontrol et
    //6-blog butonunu kontrol et
    //7- contact butonunu kontrol et
    //8- login butonunu kontrol et

    US01_page us01_page = new US01_page();
    Actions actions = new Actions(Driver.getDriver());

    @BeforeMethod
    public void setup(){
        us01_page.anaSayfa();
    }

    @Test
    public void test01_home(){
        us01_page.homeButonu.click();
        String baslik = Driver.getDriver().getTitle();
        Assert.assertTrue(baslik.contains("Home"),"home butonu calismiyor");
    }
    @Test
    public void test02_rooms(){
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        String roomsUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(roomsUrl.contains("rooms"));
    }
    @Test
    public void test03_restaurant(){
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        String restaurantUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(restaurantUrl.contains("restaurant"));
    }
    @Test
    public void test04_about(){
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        String aboutUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(aboutUrl.contains("about"));
    }
    @Test
    public void test05_blog(){
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        String blogUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(blogUrl.contains("blogs"));
    }
    @Test
    public void test06_contact(){
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        String contactUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(contactUrl.contains("contact"));
    }
    @Test
    public void test07_login(){
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        String loginUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(loginUrl.contains("Logon"));
    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}
