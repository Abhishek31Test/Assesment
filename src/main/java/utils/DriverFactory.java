package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static AppiumDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName",System.getProperty("deviceName"));
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", System.getProperty("OsVersion"));
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("appPackage", "com.coindcx");
        capabilities.setCapability("appActivity", "com.coindcx.security.ScreenLock");
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        //capabilities.setCapability("autoGrantPermission", "true");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
        driver =  new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    public AppiumDriver getAppiumDriver()
    {
        if(driver==null)
            throw new RuntimeException("Driver has not been instantiated");

        return driver;
    }

   @AfterClass
    public void quit( ) {
        driver.quit();
    }
}
