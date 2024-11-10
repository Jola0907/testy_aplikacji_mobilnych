//package utils;
//
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//
//public class AppiumUtils {
//
//    public static void scrollAndClickElementWithText(AndroidDriver driver, String expectedText){
//
//
////            driver.findElement(AppiumBy.androidUIAutomator(
////                    "new UiScrollable(new UiSelector().scrollable(true))" +
////                            ".scrollIntoView(new UiSelector().text("\ + expectedText + \"));"
////            )).click();
////        }
//
//
//    }

package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class
AppiumUtils {

    public static void scrollAndClickElementWithText(AndroidDriver driver, String expectedText) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + expectedText + "\"));"
        )).click();
    }

}


