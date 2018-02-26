package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BasicUtils;

import java.util.List;

import static utils.BasicUtils.ActionType.SCROLL;
import static utils.BasicUtils.ActionType.SWIPE;

/**
 * Created by olena.kolesnyk on 19/02/2018.
 */
public class AddWifiScreen extends AbstractScreen {

    @AndroidFindBy(xpath = ".//android.widget.FrameLayout[" +
            "@resource-id='com.example.olenakolesnyk.wifinetworkapp:id/custom']//android.widget.EditText")
    private AndroidElement addWifiInput;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement createWifiNetworkBtn;

/*    @AndroidFindBy(xpath = ".//android.widget.ListView[" +
            "@resource-id='com.example.olenakolesnyk.wifinetworkapp:id/wifi_list']/android.widget.RelativeLayout")
    private List<AndroidElement> connectionRow;*/

    @AndroidFindBy(xpath = ".//android.widget.ListView[" +
            "@resource-id='com.example.olenakolesnyk.wifinetworkapp:id/wifi_list']//android.widget.Button")
    private List<AndroidElement> connectBtn;

    public AddWifiScreen(AppiumDriver driver) {
        super(driver);
    }

/*    public boolean isWifiConnectionExist() {
        return !connectionRow.isEmpty();
    }*/

    public void addWifiConnection(String name) {
        addWifiInput.setValue(name);
        createWifiNetworkBtn.click();
    }

    public boolean isConnectButtonEnabled() {
        return connectBtn.get(connectBtn.size() - 1).isEnabled();
    }

}
