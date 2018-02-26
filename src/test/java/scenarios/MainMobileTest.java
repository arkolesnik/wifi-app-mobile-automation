package scenarios;

import org.testng.Assert;
import org.testng.annotations.*;
import screens.*;

/**
 * Created by olena.kolesnyk on 19/02/2018.
 */
public class MainMobileTest extends AndroidFixture {

    private MainAppScreen mainAppScreen;
    private AddWifiScreen addWifiScreen;

    @BeforeClass
    public void initializePages() {
        mainAppScreen = new MainAppScreen(driver);
        addWifiScreen = new AddWifiScreen(driver);
    }

    @Test
    @Parameters("network")
    public void addWiFi(String network) {
        mainAppScreen.clickAddConnectionBtn();
        addWifiScreen.addWifiConnection(network);
        Assert.assertTrue(addWifiScreen.isConnectButtonEnabled(), "WiFi connection was not properly added; ");
    }

/*    @AfterMethod
    @Parameters("appPassword")
    public void deleteWifi(ITestResult result, String appPassword) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            profileScreen.deleteAccountSuccess(appPassword);
        }
    }*/
}
