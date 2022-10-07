package capbilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class cap {



    public static AndroidDriver<AndroidElement> baseCapabilities() throws IOException {
        File appDir = new File("src");
        File app = new File(appDir, "calculator.apk");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "test");

        desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

//		desiredCapabilities.setCapability("noReset", true);
//		desiredCapabilities.setCapability("fullReset", false);

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),
                desiredCapabilities);

//		driver.resetApp();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

}
