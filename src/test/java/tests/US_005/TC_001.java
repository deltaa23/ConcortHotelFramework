package tests.US_005;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.ConfigReader;
import utilitis.WebDriverFactory;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.Set;

public class TC_001 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        //Thread.sleep(3000);
        // driver.quit();
    }


    //======================================================================================================================

    @Test
    public void test1() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement numara = driver.findElement(By.xpath("(//input[@class='form-control input-lg required'])[1]"));
        numara.click();
        numara.clear();
        numara.sendKeys("123112");

        WebElement button2 = driver.findElement(By.xpath("//button[.='Save']"));
        button2.click();

        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Hotel was updated successfully"));
    }


    @Test
    public void test2() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement hotelIsim = driver.findElement(By.xpath("(//input[@class='form-control input-lg required'])[2]"));
        hotelIsim.click();
        hotelIsim.clear();
        hotelIsim.sendKeys("huseyin");

        WebElement button2 = driver.findElement(By.xpath("//button[.='Save']"));
        button2.click();
        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Hotel was updated successfully"));

    }

//============================================================================================================================

    @Test
    public void test3() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement hotelAdress = driver.findElement(By.xpath("//input[@id='Address']"));
        hotelAdress.click();
        hotelAdress.clear();
        hotelAdress.sendKeys("Ourense");
        Thread.sleep(2000);
        WebElement button2 = driver.findElement(By.xpath("//button[.='Save']"));
        button2.click();
        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Hotel was updated successfully"));

    }

    //===========================================================================================================================

    @Test
    public void test4() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement HotelPhone = driver.findElement(By.xpath("//input[@id='Phone']"));
        HotelPhone.click();
        HotelPhone.clear();
        HotelPhone.sendKeys("625907605");

        WebElement button2 = driver.findElement(By.xpath("//button[.='Save']"));
        button2.click();
        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Hotel was updated successfully"));
    }

    //----------------------------------------------------------------------------------------------------------------------

    @Test
    public void test5() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        //WebElement E_mail_bigi= driver.findElement(By.id("Email"));
        WebElement E_mail_bigi = driver.findElement(By.xpath("//input[@id='Email']"));
        E_mail_bigi.click();
        E_mail_bigi.clear();
        E_mail_bigi.sendKeys("karahanhuseyin2@gmail.com");

        WebElement button2 = driver.findElement(By.xpath("//button[.='Save']"));
        button2.click();
        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Hotel was updated successfully"));
    }


    //==========================================================================================================================
    @Test
    public void test6() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(2000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement properties = driver.findElement(By.xpath("//a[.='Properties']"));
        properties.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        WebElement button2 = driver.findElement(By.id("btnDelete"));
        button2.click();
        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Would you like to continue?"));
        WebElement button3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button3.click();

    }

    //========================================================================================================================
    @Test
    public void test7() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement properties = driver.findElement(By.xpath("//a[.='Properties']"));
        properties.click();
        WebElement type = driver.findElement(By.id("lkpBarcodeTypes"));
        type.click();
        WebElement select = driver.findElement(By.xpath("//option[@value='3']"));
        select.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        WebElement selectElement = driver.findElement(By.xpath("(//select[@class='form-control input-lg required'])[2]"));
        Select select2 =new Select(selectElement);
        select2.selectByValue("3");
        select2.getFirstSelectedOption().click();
        WebElement saveButtonu=driver.findElement(By.xpath("(//button[@class='btn green'])[2]"));
        saveButtonu.click();

    }
    

    //==============================================================================================================================
    @Test

    public void test8() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement photos = driver.findElement(By.xpath("//*[.='Photos']"));
        photos.click();
        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Hotel was updated successfully"));

    }

//===========================================================================================================================
    @Test
    public void test9() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");

        WebElement button = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

        WebElement HotelManagement = driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();

        WebElement HotelList = driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();

        String ilkSayfaHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        WebElement Details = driver.findElement(By.xpath(("(//a[@class='btn btn-xs default'])[1]")));
        Details.click();

        Set<String> tumWindowsHandllari = driver.getWindowHandles();
        String ikinciWindowHandle = "";
        for (String each : tumWindowsHandllari) {
            if (!each.equals(ilkSayfaHandle)) {
                ikinciWindowHandle = each;
            }
        }
        driver.switchTo().window(ikinciWindowHandle);
        Thread.sleep(3000);
        WebElement properties = driver.findElement(By.xpath("//a[.='Properties']"));
        properties.click();
        WebElement type = driver.findElement(By.id("lkpBarcodeTypes"));
        type.click();
        WebElement code=driver.findElement(By.id("txtBarcodeCode"));
        code.click();
        WebElement value=driver.findElement(By.id("txtBarcode"));
        value.click();
        Thread.sleep(2000);
        String success = driver.findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        Assert.assertTrue(success.equals("Hotel was updated successfully"));
    }

}

