package tests.US_005;

import org.openqa.selenium.By;
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
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get(ConfigReader.getProperty("url"));
        WebElement login= driver.findElement(By.xpath("//a[.='Log in']"));
        login.click();
        WebElement username=driver.findElement(By.xpath("//input[@id='UserName']"));
        username.sendKeys("manager");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("manager1!");
        WebElement button=driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        button.click();

    }
}
