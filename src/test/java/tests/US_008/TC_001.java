package tests.US_008;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US08_page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_001 extends TestBaseReport {
    US08_page page = new US08_page();;
    SoftAssert softAssert = new SoftAssert();
    TC_002 hotelManagement = new TC_002();
    @Test
    public void titleBarTest() {
        extentTest = extentReports.createTest("Room Reservation Testing", "TitleBar Testing");
        extentTest.info("Kullanici Room Reservation sayfasinda");
        hotelManagement.setUp();

        extentTest.info("Create Hotel Room Reservation yazisinin gorunur oldugu dogruladi");
        softAssert.assertTrue(page.hotelRoomReservationTitle.isDisplayed(),"Page title gorunur degil");

        extentTest.info("Create Hotel Room Reservation yazisinin dogru yazildigi dogrulandi");
        String actualPageTitle= page.hotelRoomReservationTitle.getText();
        String expectedPageTitle="Create Hotel Room Reservation";
        softAssert.assertEquals(actualPageTitle,expectedPageTitle,"Page title istenildigi gibi degil");

        extentTest.info("Collapse/Expand iconuna tiklandi");
        page.collapseIcon.click();

        extentTest.info("IDUser text areanin gorunur olamdigi dogrulandi");
        ReusableMethods.waitFor(2);
        softAssert.assertFalse(page.selectUser.isDisplayed(),"Select User gorunuyor");

        extentTest.info(" Collapse /Expand iconuna tekrar tiklandi");
        page.expandIcon.click();

        extentTest.info("IDUser text areanin gorunur oldugu dogrulandi");
        ReusableMethods.waitFor(2);
        softAssert.assertTrue(page.selectUser.isDisplayed(),"Select User gorunmuyor");

        extentTest.info("Seting iconuna tiklandi");
        page.settingsIcon.click();

        extentTest.info("Save change buttonuna tiklandi");
        ReusableMethods.waitFor(2);
        page.saveChanges.click();

        extentTest.info("Close buttonuna tiklandi");
        page.closeButton.click();

        extentTest.info("Id User select areadan 1. opsiyonu secti");
        Select select = new Select(page.selectUser);

        select.selectByIndex(1);
        extentTest.info("Reload iconunu tiklandi");
        page.reloadIcon.click();

        extentTest.info("Id User select areanin unselected oldugu dogrulandi");
        ReusableMethods.waitFor(2);
        String  actualSelectText= select.getFirstSelectedOption().getText();
        String expectedSelectText = "Select User";
        softAssert.assertEquals(actualSelectText,expectedSelectText,"Reload istenildigi gibi calismamakta");

        extentTest.info("Remove iconuna tiklandi");
        int num1 = page.totalElements.size();
        page.removeIcon.click();

        extentTest.info("Create Hotel Room Reservation yazisinin gorunur olmadigi dogrulandi");
        ReusableMethods.waitFor(2);
        int num2 = page.totalElements.size();
        softAssert.assertFalse(num1==num2,"Remove istenilen gibi calismiyor");

        extentTest.info("Sayfa refresh edildi");
        Driver.getDriver().navigate().refresh();

        extentTest.info("Create Hotel Room Reservation yazisinin gorunur oldugu dogrulandi");
        softAssert.assertTrue(page.hotelRoomReservationTitle.isDisplayed(),"Refresh istenilen gibi calismamakta");

        softAssert.assertAll();
        extentTest.pass("PASS");
    }

}
