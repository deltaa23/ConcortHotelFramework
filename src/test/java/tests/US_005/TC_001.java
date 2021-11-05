package tests.US_005;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilitis.ConfigReader;
import utilitis.WebDriverFactory;

public class TC_001 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void afterMethod()throws InterruptedException{
        // Thread.sleep(3000);
        //driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        WebElement login= driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();
        WebElement username=driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");
        WebElement button=driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();
        WebElement HotelManagement=driver.findElement(By.xpath("//span[.='Hotel Management']"));
        HotelManagement.click();
        WebElement HotelList=driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        HotelList.click();
        Thread.sleep(5000);
        WebElement Details=driver.findElement(By.xpath("//a[@href='./HotelAdmin/Edit?Id=2206']"));
        Details.click();
        Thread.sleep(3000);
        WebElement numara=driver.findElement(By.id("Code"));
        numara.click();
        numara.clear();
        numara.sendKeys("123112");

        WebElement button2=driver.findElement(By.xpath("//button[.='Save']"));
        button2.click();

    }
}
