package tests.E2E;

import org.testng.annotations.Test;
import tests.US_008.TC_002;
import tests.smokeTest.s3TC_001;
import utilities.Driver;
import utilities.TestBaseReport;

public class E2E01_Yonetici extends TestBaseReport {

    TC_002 login = new TC_002();
    s3TC_001 hotelRoom = new s3TC_001();
    @Test
    public void e2e(){
        login.positiveTest();
        Driver.closeDriver();
    }

    @Test
    public void e2e02() throws InterruptedException {
        hotelRoom.test();
        Driver.getDriver();
    }

}
