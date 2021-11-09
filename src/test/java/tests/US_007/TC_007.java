package tests.US_007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US07_page;
import utilities.ReusableMethods;
import utilities.TestBaseReport;


public class TC_007 extends TestBaseReport {
    //1)Delete butonunun gorunebildigini dogrula
    //2)Delete butonuna tikla
    //3) "Would you like to continue?" html alert geldigini dogrula
    //4)"Cancel" tiklanirsa html alert kayboldugunu dogrula
    //5)Delete butonuna tikla
    //6)"Ok" a tikla
    //7) "Error: Couldn't delete room : please delete reservations for this room first" html alert geldigini dogrula
    US07_page page=new US07_page();
    TC_003 setup=new TC_003();

    @Test
    public void deleteTest(){
        extentTest=extentReports.createTest("Delete testi","Delete tusu erisilebilirlik testi");

        setup.setUp();

        ReusableMethods.waitFor(3);
        ReusableMethods.hover(page.deleteButonu);
        extentTest.info("delete butonu gorunwbilir");
        ReusableMethods.waitFor(2);
        page.deleteButonu.click();
        extentTest.info("delete butonu clickable");
        page.deleteOkHtml.click();
        Assert.assertTrue(page.deleteError.isEnabled());
        extentTest.fail("Delete butonu aktif degil");







    }










}
