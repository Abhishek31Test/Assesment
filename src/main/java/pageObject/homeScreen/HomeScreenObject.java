package pageObject.homeScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebElement;
import utils.BaseScreen;

import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;

public class HomeScreenObject extends BaseScreen {

    public HomeScreenObject(AppiumDriver driver) {
        super(driver);
    }

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(accessibility = "HOME")
    public WebElement home;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(accessibility = "LOGIN")
    public WebElement login;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(className = "android.widget.ImageView")
    public List<WebElement> ad;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"REGISTER\"]")
    public WebElement register;


}
