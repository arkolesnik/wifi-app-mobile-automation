package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidFixture {

    private static final String APK_PATH = "D:\\WORK\\Projects\\wifi-app-mobile-automation";
    private static final String APK = "app-debug.apk";
    private static final String DEVICE = "Android Device";
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    AndroidDriver driver;

    @BeforeSuite(alwaysRun = true)
    protected void setUp() throws MalformedURLException {
        File appDir = new File(APK_PATH);
        File app = new File(appDir, APK);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver(new URL(APPIUM_URL), capabilities);
    }

}
