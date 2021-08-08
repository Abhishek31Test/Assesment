package pageObject.marketScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebElement;
import utils.BaseScreen;

import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;

public class MarketScreenObject extends BaseScreen {

    public MarketScreenObject(AppiumDriver driver) {
        super(driver);
    }

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"TRADE\"]")
    public WebElement tradeTab;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.view.View/android.widget.EditText\n")
    public WebElement searchBox;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Vol:')]")
    public List<WebElement> searchResult;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'VOLUME:')]")
    public WebElement volume;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'%')]")
    public WebElement percentage;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'₹')]")
    public WebElement price;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath = "//android.widget.Image[contains(@text,'Down arrow')]")
    public WebElement close;
}