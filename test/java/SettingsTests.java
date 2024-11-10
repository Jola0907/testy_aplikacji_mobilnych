//import io.appium.java_client.AppiumBy;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import screens.android.MainScreen;
//import screens.android.MainScreenDisplay;
//import screens.android.MainScreenSettings;
//
//import java.net.MalformedURLException;
//
//public class SettingsTest extends BaseTest {
//
//    public MainScreen mainScteen = new MainScreen(driver);
//    public MainScreenSettings mainScreenSettings= new MainScreenSettings(driver);
//    public MainScreenDisplay mainScreenDisplay= new MainScreenDisplay(driver);
//
//    @BeforeEach
//    public void setUpSettings(){}
//    }
//
//    @Test
//    public void openSettingsTest(){
//        mainScteen.openSettingsWindow();
//        mainScreenSettings.openBrightSetting();
//        mainScreenDisplay.openBrightnessSetting();
//
//
//        //chcey kliknac na settings
//        //androidDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout")).click();
//
//    }
////    private void openBrightSetting(){
////        driver.findElement(AppiumBy.androidUIAutomator(" ")).click();
////    }
////
////    public void openDisplayeSettings(){
////        driver.findElement(AppiumBy.androidUIAutomator(" ")).click();
////
////    }
//
////    private void openSettingsWindow(){
////       driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout")).click();
////    }
//
//}

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import screens.android.DisplaySettingsScreen;
import screens.android.MainScreen;
import screens.android.MainScreenDisplay;
import screens.android.MainSettingsScreen;

import java.net.MalformedURLException;

public class SettingsTests extends BaseTest{

    public MainScreen mainScreen;
    public MainSettingsScreen mainSettingsScreen ;
    public MainScreenDisplay displaySettingsScreen ;

    @BeforeEach
    public void setUpSettingsScreen() throws MalformedURLException {
        super.setUp();

        mainScreen = new MainScreen(driver);

        //public MainScreen mainScreen = new MainScreen(driver);
        mainSettingsScreen = new MainSettingsScreen(driver);
        //public MainSettingsScreen mainSettingsScreen = new MainSettingsScreen(driver);
        displaySettingsScreen = new MainScreenDisplay(driver);
        //public MainScreenDisplay displaySettingsScreen = new MainScreenDisplay(driver);
    }

    @Test
    public void openSettingsTest() {
        //mainScreen.checkIfSettings();
        mainScreen.openSettingsWindow();
        mainSettingsScreen.openLocationSetting();
        mainSettingsScreen.openDisplaySettings();
        displaySettingsScreen.openBrightnessSetting();
    }

    @Test
    public void searchForElement() {
        mainScreen.openSettingsWindow();
        mainSettingsScreen.openSearching();
        mainSettingsScreen.fillSearchInput("Location");
    }



}

