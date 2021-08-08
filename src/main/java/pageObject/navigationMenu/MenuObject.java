package pageObject.navigationMenu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebElement;
import utils.BaseScreen;

import static java.time.temporal.ChronoUnit.SECONDS;

public class MenuObject extends BaseScreen {
    public MenuObject(AppiumDriver driver) {
        super(driver);
    }

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(accessibility = "HOME")
    public WebElement home;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(accessibility = "MARKETS")
    public WebElement marketsTab;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(accessibility = "FUNDS")
    public WebElement funds;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(accessibility = "PROFILE")
    public WebElement profile;


}
