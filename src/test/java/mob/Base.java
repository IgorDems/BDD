package mob;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
        public static void main(String[] args) throws MalformedURLException {
            AndroidDriver<AndroidElement> driver;

            // TODO Auto-generated method stub
            File appDir = new File("C:\\Users\\igoru\\IdeaProjects\\BDD\\src\\test\\resources");
            File app = new File(appDir, "ApiDemos-debug.apk");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
            cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//            driver.get("google.com");
    }

//    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException, MalformedURLException {
//
//
//        AndroidDriver<AndroidElement> driver;
//
//        // TODO Auto-generated method stub
//        File appDir = new File("C:\\Users\\igoru\\IdeaProjects\\BDD\\src\\test\\resources");
//        File app = new File(appDir, "ApiDemos-debug.apk");
//        DesiredCapabilities cap = new DesiredCapabilities();
//
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RF8M73L7E5W");
//        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
//        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//
//        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//
//        return driver;
//    }


}
