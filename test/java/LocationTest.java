import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import screens.android.MainScreen;
import screens.android.MainScreenDisplay;
import screens.android.MainSettingsScreen;

import java.net.MalformedURLException;



    public class LocationTest extends BaseTest{

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
        public void changeLocationSettings() {

            mainScreen.openSettingsWindow();
            mainSettingsScreen.openLocationSetting();
            mainSettingsScreen.openDisplaySettings();
            displaySettingsScreen.openBrightnessSetting();
        }

    }
