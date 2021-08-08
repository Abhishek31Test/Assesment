package com.coindcx.requirement.marketScreen;

import com.coindcx.requirement.TestBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.homeScreen.HomeScreen;
import pageObject.marketScreen.MarketScreen;
import pageObject.navigationMenu.Menu;

public class Market extends TestBase {

    @Test(description ="Fetching the details of each market and verifying that details are not null")
    @Parameters("coin")
    public void verifyingMarketDetails(String name){
        MarketScreen marketScreen = new MarketScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        Menu menu = new Menu(driver);
        homeScreen.isHomePageDisplayed();
        menu.clickMarketTab();
        marketScreen.isMarketScreenDisplayed();
        marketScreen.seachMarket(name);
        marketScreen.getSearchResult();
        marketScreen.verifyMarketDetails(name);
    }
}
