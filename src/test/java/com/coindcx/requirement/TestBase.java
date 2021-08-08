package com.coindcx.requirement;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static AppiumDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup() throws MalformedURLException {
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setup();
        driver = driverFactory.getAppiumDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }


  @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
