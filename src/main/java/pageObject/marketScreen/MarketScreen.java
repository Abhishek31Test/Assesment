package pageObject.marketScreen;

import io.appium.java_client.AppiumDriver;
import pageObject.navigationMenu.MenuObject;
import utils.Base;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

public class MarketScreen extends Base {
    public static int size;
    private static MarketScreenObject marketScreenObject;
    private static MenuObject menuObject;

    public MarketScreen(AppiumDriver driver) {
        marketScreenObject = new MarketScreenObject(driver);
        menuObject = new MenuObject(driver);
    }

    public void isMarketScreenDisplayed() {
        assertTrue("Market screen did not appear", marketScreenObject.tradeTab.isDisplayed());
    }

    public void seachMarket(String Name){
        waitFor(3000);
        marketScreenObject.searchBox.sendKeys(Name);
    }

    public void getSearchResult(){
        waitFor(3000);
        size = marketScreenObject.searchResult.size();
        log.info("Search result count is: " + size);
    }

    public void verifyMarketDetails(String Name){
        waitUntilElementIsVisible(marketScreenObject.searchResult.get(0));
        size = marketScreenObject.searchResult.size();
        String volume;
        String Price;
        String percentage;
        String[] s1;
        for(int i=0; i<size;i++){
            marketScreenObject.searchResult.get(i).click();
            waitUntilElementIsVisible(marketScreenObject.volume);
            volume = marketScreenObject.volume.getText();
            assertNotNull(volume);
            Price = marketScreenObject.price.getText();
            assertNotNull(Price);
            s1 = Price.split(" ");
            percentage = marketScreenObject.percentage.getText();
            assertNotNull(percentage);
            log.info("Details of coin in position........"+ i);
            log.info(volume);
            log.info("USD :"+ s1[0]);
            log.info("INR :"+ s1[3]);
            log.info("percentage is " + percentage);
            marketScreenObject.close.click();
            seachMarket(Name);
        }
    }


}
