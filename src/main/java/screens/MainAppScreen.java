package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by olena.kolesnyk on 19/02/2018.
 */
public class MainAppScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.example.olenakolesnyk.wifinetworkapp:id/action_add_wifi")
    private AndroidElement addConnectionBtn;

    public MainAppScreen(AppiumDriver driver) {
        super(driver);
    }

    public void clickAddConnectionBtn() {
        addConnectionBtn.click();
    }

}
