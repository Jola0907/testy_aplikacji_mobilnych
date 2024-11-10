package screens.android;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumUtils;


public class MainSettingsScreen {

        public AndroidDriver driver;

        public MainSettingsScreen(AndroidDriver driver) {
            this.driver = driver;
        }

        public void openDisplaySettings() {
            driver.findElement(AppiumBy.androidUIAutomator("//android.widget.Button[@resource-id=\"com.android.vending:id/0_resource_name_obfuscated\"]")).click();
        }

//        public void openLocalSettings(){
//            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
//                    ".scrollIntoView(new UiSelector.text(\"Location\"))")).click();
//
//        }

    public void openLocationSetting() {
//        driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".scrollIntoView(new UiSelector().text(\"Location\"));"
//        )).click();
        AppiumUtils.scrollAndClickElementWithText(driver, "Location");
    }

    public void openSearching() {
        driver.findElement(AppiumBy.accessibilityId("Search settings")).click();
    }

    public void fillSearchInput(String charSequence) {
        driver.findElement(AppiumBy
                .androidUIAutomator(
                        "new UiSelector().resourceId(\"android:id/search_src_text\")"
                )
        ).sendKeys(charSequence);
    }



}


//    public AndroidDriver driver;
//
//    public MainScreenSettings(AndroidDriver driver){
//
//        this.driver = driver;
//    }
//    public void openBrightSetting(){
//        driver.findElement(AppiumBy.androidUIAutomator(" ")).click();
//    }
//
//    public void openDisplayeSettings(){
//        driver.findElement(AppiumBy.androidUIAutomator(" ")).click();
//
//    }


//    public void openSettingsWindow(){
//        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout")).click();
//        driver.findElement(AppiumBy.accessibilityId("Settings")).click();
//    }

