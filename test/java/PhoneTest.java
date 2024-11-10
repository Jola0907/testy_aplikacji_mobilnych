import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import screens.android.MainScreen;
import screens.android.MainScreenDisplay;
import screens.android.MainSettingsScreen;

import java.net.MalformedURLException;

public class PhoneTest extends BaseTest{

    public MainScreen mainScteen;
    public MainSettingsScreen mainSettingsScreen;
    public MainScreenDisplay displaySettingsScreen;

    @BeforeEach
    public void setUpSettingsScreen() throws MalformedURLException {
        super.setUp();

        mainScteen = new MainScreen(driver);
        //public MainScreen mainScreen = new MainScreen(driver);
        mainSettingsScreen = new MainSettingsScreen(driver);
        //public MainSettingsScreen mainSettingsScreen = new MainSettingsScreen(driver);
        displaySettingsScreen = new MainScreenDisplay(driver);
        //public MainScreenDisplay displaySettingsScreen = new MainScreenDisplay(driver);

    }
    @Test
    public void openPhone(){
        mainScteen.openPhoneWindow();
    }

//    private void openPhoneWindow(){
//        driver.findElement(AppiumBy.accessibilityId("Phone")).click();
//        driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.google.android.dialer:id/search_fragment_container\"]")).click();
//
//    }
}
