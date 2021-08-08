package pageObject.homeScreen;

import io.appium.java_client.AppiumDriver;
import utils.Base;

import static org.testng.AssertJUnit.assertTrue;

public class HomeScreen extends Base {
    public static HomeScreenObject homeScreenObject;
    public HomeScreen(AppiumDriver driver) {
        homeScreenObject = new HomeScreenObject(driver);
    }

    public void closeAd() {
        waitFor(3000);
        if(homeScreenObject.ad.get(0).isDisplayed()){
            homeScreenObject.ad.get(1).click();
        }
    }

    public void isHomePageDisplayed(){
        closeAd();
        assertTrue("Home screen did not appear", homeScreenObject.home.isDisplayed());
        assertTrue("Register button did not appear", homeScreenObject.register.isDisplayed());
        assertTrue("login button did not appear", homeScreenObject.login.isDisplayed());
    }

    public void clickOnRegister(){
        waitUntilElementIsVisible(homeScreenObject.register);
        homeScreenObject.register.click();
    }
}
