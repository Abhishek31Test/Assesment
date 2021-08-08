package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import java.time.Duration;


public class BaseScreen {
    public static long wait = 10;

    public BaseScreen(AppiumDriver driver){
        FieldDecorator fieldDecorator= new AppiumFieldDecorator(driver, Duration.ofSeconds(wait));
        PageFactory.initElements(fieldDecorator, this);

    }
}
