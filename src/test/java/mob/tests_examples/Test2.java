package mob.tests_examples;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Test2 {

    @Test
    public void test() throws MalformedURLException {
        File appDir = new File("src");

        File app = new File(appDir, "ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

//        driver.scrollTo("Preference").click();
//        List<WebElement> b = driver.findElements(By.id("android:id/text1"));
//        System.out.println(b.get(8).getText());


    }
}