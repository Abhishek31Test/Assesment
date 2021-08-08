package utils;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {
    public static long wait=80;
    public static AppiumDriver driver;
    public Logger log = Logger.getLogger(this.getClass().getName());

    public static void waitUntilElementIsVisible(WebElement element){
        try{
            WebDriverWait wwait = new WebDriverWait(driver, wait);
            wwait.until(ExpectedConditions.visibilityOf(element));
        }
        catch (Exception e)
        {
        }
    }

    public static void waitFor(long timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
