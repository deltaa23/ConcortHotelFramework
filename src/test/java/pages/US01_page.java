package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_page {

   public US01_page(){
       PageFactory.initElements(Driver.getDriver(),this);
    }


    public void anaSayfa(){

      Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @FindBy(linkText = "Home")
    public WebElement homeButonu;


}


