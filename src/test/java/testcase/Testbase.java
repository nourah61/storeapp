package testcase;

import capbilities.cap;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Testbase  extends cap {
    AndroidDriver driver;
    @BeforeTest
    public void setappdriver() throws IOException {
        driver = baseCapabilities();

    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
