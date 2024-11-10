package screens.android;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumUtils;


public class MainScreenDisplay {


    //public class DisplaySettingsScreen {

        public AndroidDriver driver;

        public MainScreenDisplay(AndroidDriver driver) {
            this.driver = driver;
        }

        public void openBrightnessSetting() {
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(0)")).click();
        }
        public void openLocationSettings(){
            AppiumUtils.scrollAndClickElementWithText(driver, "Location");
        }
//        public void openSearching(){
//            driver.findElement(AppiumBy.accessibilityId("Search settings")).click();
//        }
//        public void searchInput(){
//            driver.findElement(AppiumBy.androidUIAutomator(""))
//
//        }

//    public void openSearching() {
//        driver.findElement(AppiumBy.accessibilityId("Search settings")).click();
//    }
//
//    public void fillSearchInput() {
//        driver.findElement(AppiumBy
//                .androidUIAutomator(
//                        "new UiSelector().resourceId(\"android:id/search_src_text\")"
//                )
//        ).sendKeys("Location");
//    }

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


//
//    public AndroidDriver driver;
//
//    public MainScreenDisplay(AndroidDriver driver){
//
//        this.driver = driver;
//    }
//
//    public void openBrightnessSetting() {
//        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(0)")).click();
//    }
//
//    public void openDisplaySettings() {
//        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(12)")).click();
//    }
//}


