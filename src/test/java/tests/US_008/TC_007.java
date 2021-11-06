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

public class TC_007 extends TestBaseReport {
    US08_page page = new US08_page();
    Actions actions= new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    Faker faker = new Faker();
    TC_002 hotelManagement = new TC_002();
    @Test
    public void mobileNumberTest() {
        extentTest = extentReports.createTest("Room Reservation Testing", "Mobile Number Testing");
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

        extentTest.info("DateStart kismindan secim yapti");

        page.listOfDateButtons.get(1).click();
        ReusableMethods.waitFor(2);
        if (page.listOfDays.size()==0){
            page.next.click();
        }
        page.listOfDays.get(0).click();

        extentTest.info("DateEnd kismindan secim yapti");
        page.listOfDateButtons.get(2).click();
        ReusableMethods.waitFor(2);
        if (page.listOfDays.size()<=1){
            page.next.click();
        }
        page.listOfDays.get(2).click();

        extentTest.info("AdultAmount kismina number girdi");
        page.adultAmount.sendKeys("2");

        extentTest.info("ChildrenAmount kismina number girdi");
        page.childrenAmount.sendKeys("1");

        extentTest.info("ContactNameSurname kismina bilgi girdi");
        page.contactNameSurname.sendKeys(faker.name().fullName());

        extentTest.info("ContactPhone kismina invalid bir telno girdi");
        page.contactPhone.sendKeys(ConfigReader.getProperty("invalidPhoneNum1"));

        extentTest.info("ContactEmail kismina emaild girdi");
        page.contactEmail.sendKeys(faker.internet().emailAddress());

        extentTest.info("Notes kismina bilgi girdi");
        page.notes.sendKeys(faker.lorem().paragraph());

        extentTest.info("Approved kutucugunu tiklandi");
        page.approved.click();

        extentTest.info("IsPaid kutucugunu tiklandi");
        page.isPaid.click();

        verify();

        extentTest.info("ContactPhone kismina invalid bir telno girdi");
        actions.moveToElement(page.contactPhone).perform();
        page.contactPhone.clear();
        page.contactPhone.sendKeys(ConfigReader.getProperty("invalidPhoneNum2"));

        verify();

        softAssert.assertAll();
        extentTest.pass("PASS");

    }

    private void verify() {
        extentTest.info("Save butonunu tiklandi");
        actions.moveToElement(page.saveButton).perform();
        page.saveButton.click();

        extentTest.info("Contact Phone error mesajinin gorundugunu dogrular");
        String expectedtext="Contact Phone";
        String actualtext=page.errorTexts.get(0).getText();
        softAssert.assertEquals(actualtext,expectedtext,"Contact Phone error message is not displayed");

        extentTest.info("Kullanici eror mesaji renginin kirmizi oldugunu dogruladi");
        String color = "rgba(243, 86, 93, 1)";
        for (int i=0 ; i<page.errorTexts.size();i++ ) {
            softAssert.assertEquals(page.errorTexts.get(i).getCssValue("color"), color);
        }
    }

}
