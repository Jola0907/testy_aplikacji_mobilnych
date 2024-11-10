//package screens.android;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//
//
//
//public class MainScreen {
//
//    public AndroidDriver driver;
//
//    public MainScreen(AndroidDriver driver){
//
//        this.driver = driver;
//    }
//
//
//    public void openSettingsWindow(){
//        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout")).click();
//        driver.findElement(AppiumBy.accessibilityId("Settings")).click();
//    }
//
//    public void openPhoneWindow(){
//        driver.findElement(AppiumBy.accessibilityId("Phone")).click();
//        driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.google.android.dialer:id/search_fragment_container\"]")).click();
//
//    }
//}

package screens.android;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;

public class MainScreen {

    public AndroidDriver driver;

    public MainScreen(AndroidDriver driver) {
        this.driver = driver;
    }
    public void checkIfSettings(){
        //WebElement settingsButton = driver.findElement(AppiumBy.accessibilityId("Settings"));
        //assert settingsButton.isDisplayed(); tak nie robimy bo logowanie tej asercji nie jest poprawne
        //używamy bibliotek AssertJ-core i tak robimy:
        //Assertions.assertThat(driver.findElement(AppiumBy.accessibilityId("Settings")).getText()).as(" lala").isEqualTo("Settings");
       // SoftAssertions.assertSoftly(driver.findElement(AppiumBy.accessibilityId("Settings")).getText()).as(" lala").isEqualTo("Settings");
        SoftAssertions.assertSoftly(softly -> {
            String actualText = driver.findElement(AppiumBy.accessibilityId("Settings")).getText();
            softly.assertThat(actualText)
                    //.as("Verifity Settings ")
                    .isEqualTo("Settings");
        });

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

    public void openSettingsWindow() {
        driver.findElement(AppiumBy.accessibilityId("Predicted app: Play Store")).click();
    }
    public void openPhoneWindow(){
        driver.findElement(AppiumBy.accessibilityId("Phone")).click();
       driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.google.android.dialer:id/search_fragment_container\"]")).click();

}}

