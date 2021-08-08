package pageObject.navigationMenu;

import io.appium.java_client.AppiumDriver;
import utils.Base;

public class Menu extends Base {
    public static MenuObject menuObject;

    public Menu(AppiumDriver driver) {
        menuObject = new MenuObject(driver);
    }

        public void clickHomeTab(){
            menuObject.home.click();
        }

    public void clickMarketTab(){
        menuObject.marketsTab.click();
    }

    public void clickFundsTab(){
        menuObject.funds.click();
    }

    public void clickProfileTab(){
        menuObject.profile.click();
    }


}
