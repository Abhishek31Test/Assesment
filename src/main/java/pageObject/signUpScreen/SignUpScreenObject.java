package pageObject.signUpScreen;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebElement;
import utils.BaseScreen;

import static java.time.temporal.ChronoUnit.SECONDS;

public class SignUpScreenObject extends BaseScreen {

    public SignUpScreenObject(AppiumDriver driver) {
        super(driver);
    }

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id = "main_signin_txt")
    public WebElement signUpPage;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "first_name_input")
    public WebElement firstName;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvFirstNameError")
    public WebElement firstNameError;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "last_name_input")
    public WebElement lastName;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvLastNameError")
    public WebElement lastNameError;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "email_input")
    public WebElement email;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvEmailError")
    public WebElement emailError;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "password_input")
    public WebElement password;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvPasswordError")
    public WebElement passwordError;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "next_btn")
    public WebElement nextBtn;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "country_input")
    public WebElement country;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvCountryNameError")
    public WebElement countryError;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "phone_no_prefix")
    public WebElement countryCode;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "phone_no_input")
    public WebElement phoneNumber;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvPhoneNumberError")
    public WebElement phoneNumberError;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "referral_code_input")
    public WebElement referral;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "register")
    public WebElement signUpBtn;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "back_btn")
    public WebElement backBtn;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "no_network_logo_iv")
    public WebElement logo;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "Logo of CoinDcx")
    public WebElement coinDcxLogo;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "main_signin_txt")
    public WebElement signupText;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "edtEmailOtp")
    public WebElement emailOTP;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "edtPhoneOtp")
    public WebElement phoneOTP;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "btnSubmit")
    public WebElement submitBtn;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Phone Number']")
    public WebElement countrySelect;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "snackbar_text")
    public WebElement invalidOtpError;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvEmailResendOtp")
    public WebElement resendEmailOtp;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvResendPhoneOtp")
    public WebElement resendSmsOtp;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "main_signin_txt")
    public WebElement otpScreen;

    @WithTimeout(time = 10, chronoUnit = SECONDS)
    @AndroidFindBy(id= "tvAlertMessage")
    public WebElement otpAlertMessage;

}
