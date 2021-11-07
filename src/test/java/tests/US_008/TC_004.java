package tests.US_008;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US08_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TC_004 extends TestBaseReport {
    US08_page page = new US08_page();
    Actions actions= new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    Faker faker = new Faker();
    TC_002 hotelManagement = new TC_002();
    @Test
    public void dateFormatTest(){

        extentTest=extentReports.createTest("Room Reservation Testing","Date Format Testi");
        extentTest.info("Kullanici Room Reservation sayfasinda");
        hotelManagement.setUp();


        extentTest.info("ID-User-Select User dropDown menusunden secim yapti");
        Select select = new Select(page.selectUser);
        select.selectByIndex(1);

        extentTest.info("SelectHotelRoom DropDown menusunden secim yapti");
        select= new Select(page.selectHotelRoom);
        select.selectByIndex(1);

        extentTest.info("Price kismina number girdi");
        ReusableMethods.waitFor(2);
        page.price.sendKeys(ConfigReader.getProperty("price"));

        extentTest.info("DateStart kismina MM/dd/yy formatinda date gonderdi");
        Format f = new SimpleDateFormat("MM/dd/yy");
        String strDate = f.format(new Date());
        page.dateStart.sendKeys(strDate);

        extentTest.info("DateEnd kismina MM/dd/yy formatinda date gonderd");
        page.dateEnd.sendKeys(strDate);

        extentTest.info("AdultAmount kismina number girdi");
        page.adultAmount.sendKeys("2");

        extentTest.info("ChildrenAmount kismina number girdi");
        page.childrenAmount.sendKeys("1");

        extentTest.info("ContactNameSurname kismina bilgi girdi");
        page.contactNameSurname.sendKeys(faker.name().fullName());

        extentTest.info("ContactPhone kismina telno girdi");

        page.contactPhone.sendKeys(ConfigReader.getProperty("validPhoneNum"));

        extentTest.info("ContactEmail kismina emaild girdi");
        page.contactEmail.sendKeys(faker.internet().emailAddress());

        extentTest.info("Notes kismina bilgi girdi");
        page.notes.sendKeys(faker.lorem().paragraph());

        extentTest.info("Approved kutucugunu tiklandi");
        page.approved.click();

        extentTest.info("IsPaid kutucugunu tiklandi");
        page.isPaid.click();

        verify();
        extentTest.info("DateStart kismina dd-MM-yyyy formatinda date gonderdi");
        actions.moveToElement(page.dateStart).perform();
        ReusableMethods.waitFor(2);
        page.dateStart.clear();

        f = new SimpleDateFormat("dd-MM-yyyy");
        strDate = f.format(new Date());
        page.dateStart.sendKeys(strDate);


        extentTest.info("DateEnd kismina dd-MM-yyyy formatinda date gonderdi");
        page.dateEnd.clear();
        page.dateEnd.sendKeys(strDate);

        verify();

        extentTest.info("DateStart kismina dd/MM/yyyy hh/mm formatinda date gonderdi");
        actions.moveToElement(page.dateStart).perform();
        ReusableMethods.waitFor(2);
        page.dateStart.clear();

        f = new SimpleDateFormat("dd/MM/yyyy hh/mm");
        strDate = f.format(new Date());
        page.dateStart.sendKeys(strDate);

        extentTest.info("DateEnd kismina dd/MM/yyyy hh/mm formatinda date gonderdi");
        page.dateEnd.clear();
        page.dateEnd.sendKeys(strDate);

        verify();

        softAssert.assertAll();
        extentTest.pass("PASS");
    }

    private void verify() {
        extentTest.info("Save butonunu tiklandi");
        page.saveButton.click();

        extentTest.info("Kullanici  'DateStart' error mesajinin gorundugunu dogrular");
        softAssert.assertEquals(page.errorTexts.get(0).getText(),"DateStart");

        extentTest.info("Kullanici  'DateEnd' error mesajinin gorundugunu dogrular");
        softAssert.assertEquals(page.errorTexts.get(1).getText(),"DateEnd");

        String color = "rgba(243, 86, 93, 1)";
        for (int i=0 ; i<page.errorTexts.size();i++ ) {
            softAssert.assertEquals(page.errorTexts.get(i).getCssValue("color"), color);
        }
    }

}
