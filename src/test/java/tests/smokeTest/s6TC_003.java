package tests.smokeTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US08_page;
import tests.US_008.TC_002;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class s6TC_003 extends TestBaseReport {
    US08_page page = new US08_page();
    TC_002 hotelManagement = new TC_002();
    Faker faker = new Faker();
    SoftAssert softAssert=new SoftAssert();
    @Test(groups = "smoke")
    public void negativeTest(){
        extentTest=extentReports.createTest("Room Reservation Testing","Negative  Test");
        extentTest.info("Kullanici Room Reservation sayfasinda");
        hotelManagement.setUp();

        extentTest.info("SelectHotelRoom DropDown menusunden secim yapti");
        Select select = new Select(page.selectHotelRoom);
        select.selectByIndex(2);

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
        page.childrenAmount.sendKeys("3");

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

        extentTest.info("Save butonunu tiklandi");
        page.saveButton.click();

        extentTest.info("Kullanici  'Select User' error mesajinin gorundugunu dogrular");
        softAssert.assertEquals(page.errorTexts.get(0).getText(),"Select User");

        extentTest.info("Kullanici  'Price' error mesajinin gorundugunu dogrular");
        softAssert.assertEquals(page.errorTexts.get(1).getText(),"Price");

        extentTest.info("Kullanici  'Contact Full Name' error mesajinin gorundugunu dogrular");
        softAssert.assertEquals(page.errorTexts.get(2).getText(),"Contact Full Name");

        String color = "rgba(243, 86, 93, 1)";
        for (int i=0 ; i<page.errorTexts.size();i++ ){
            softAssert.assertEquals(page.errorTexts.get(i).getCssValue("color"),color);
        }
        softAssert.assertAll();
        extentTest.pass("PASS");

    }
}
