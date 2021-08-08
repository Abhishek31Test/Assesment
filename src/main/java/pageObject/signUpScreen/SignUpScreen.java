package pageObject.signUpScreen;


import io.appium.java_client.AppiumDriver;
import utils.Base;

import static data.Data.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static utils.Constants.*;


public class SignUpScreen extends Base {
    private static SignUpScreenObject signUpScreenObject;

    public SignUpScreen(AppiumDriver driver) {
        signUpScreenObject = new SignUpScreenObject(driver);
    }


    public void isSignUpScreenDisplayed() {
        assertTrue("sign up screen did not appear", signUpScreenObject.signUpPage.isDisplayed());
        assertTrue("Signup text did not display", signUpScreenObject.signupText.isDisplayed());
        assertTrue("Next button did not display", signUpScreenObject.nextBtn.isDisplayed());
    }

    public void enterFirstName(String firstName) {
        signUpScreenObject.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        signUpScreenObject.lastName.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        signUpScreenObject.email.sendKeys(email);
    }

    public void enterPassword(String password) {
        signUpScreenObject.password.sendKeys(password);
    }

    public void enterAllFields(String firstName,String lastName, String email,String password) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterPassword(password);
    }

    public void verifyInputFieldsAreDisplayed() {
        assertTrue("First name field is not displayed", signUpScreenObject.firstName.isDisplayed());
        assertTrue("Last name field is not displayed", signUpScreenObject.lastName.isDisplayed());
        assertTrue("Email name field is not displayed", signUpScreenObject.email.isDisplayed());
        assertTrue("Password name field is not displayed", signUpScreenObject.password.isDisplayed());
    }

    public void clickNextButton() {
        signUpScreenObject.nextBtn.click();
    }

    public void allEmptyFieldErrors() {
        assertEquals("FirstName error message did not display", signUpScreenObject.firstNameError.getText(), firstNameError);
        assertEquals("LastName error message did not display", signUpScreenObject.lastNameError.getText(), lastNameError);
        assertEquals("Email error message did not display", signUpScreenObject.emailError.getText(), enterEmailError);
        assertEquals("Password error message did not display", signUpScreenObject.passwordError.getText(), enterPasswordError);

    }

    public void verifyInvalidEmailError() {
        signUpScreenObject.email.sendKeys(invalidEmail);
        assertEquals("Invalid Email error message did not display", signUpScreenObject.emailError.getText(), inValidEmailError);
    }

    public void passwordValidationError() {
        signUpScreenObject.password.sendKeys(invalidPassword);
        assertEquals("Password validation error message did not display", signUpScreenObject.passwordError.getText(), passwordValidationError);
    }

    public void nextSignUpScreenIsDisplayed() {
        clickNextButton();
        assertTrue("Country field is not displayed", signUpScreenObject.country.isDisplayed());
        assertTrue("Phone number field is not displayed", signUpScreenObject.phoneNumber.isDisplayed());
        assertTrue("Referral field is not displayed", signUpScreenObject.referral.isDisplayed());
        assertTrue("Sign up button is not displayed", signUpScreenObject.signUpBtn.isDisplayed());
        assertTrue("Go back button is not displayed", signUpScreenObject.backBtn.isDisplayed());
    }

    public void enterCountry(String country) {
        signUpScreenObject.country.sendKeys(country);
    }

    public void enterPhoneNumber(String number) {
        signUpScreenObject.phoneNumber.sendKeys(number);
    }

    public void verifyCountryAndPhoneNumberError() {
        clickSignUpBtn();
        assertEquals("Country error message did not display", signUpScreenObject.countryError.getText(), countryNameError);
        assertEquals("Phone number error message did not display", signUpScreenObject.phoneNumberError.getText(), phoneNumberError);
    }

    public void verifyInvalidPhoneNumberError(){
        clickSignUpBtn();
        assertEquals("Phone number error message did not display", signUpScreenObject.phoneNumberError.getText(), inValidPhoneNumberError);

    }

    public void clickSignUpBtn() {
        signUpScreenObject.signUpBtn.click();
    }

    public void enterCountryAndPhoneNumber(String country, String number) {
        enterCountry(country);
        signUpScreenObject.countrySelect.click();
        enterPhoneNumber(number);
    }

    public void verifyCountyCodeIsDisplayed(String country) {
        enterCountry(country);
        signUpScreenObject.countrySelect.click();
        assertTrue("Country code is not displayed", signUpScreenObject.countryCode.isDisplayed());
    }

    public void otpScreenIsDisplayed() {
        assertTrue("OTP screen is not displayed", signUpScreenObject.otpScreen.isDisplayed());
        assertTrue("Email OTP field is not displayed", signUpScreenObject.emailOTP.isDisplayed());
        assertTrue("SMS OTP field is not displayed", signUpScreenObject.phoneOTP.isDisplayed());
        assertTrue("OTP alert message is not displayed", signUpScreenObject.otpAlertMessage.isDisplayed());
    }

    public void enterEmailOtp(String OTP){
        signUpScreenObject.emailOTP.sendKeys(OTP);
    }

    public void enterSMSOtp(String OTP){
        signUpScreenObject.phoneOTP.sendKeys(OTP);
    }

    public void enterEmailAndSmsOtp(String otp){
        enterEmailOtp(otp);
        enterSMSOtp(otp);
    }

    public void clickOnSubmitBtn(){
        signUpScreenObject.submitBtn.click();
    }

    public void verifyInvalidOtpError(){
        clickOnSubmitBtn();
        waitUntilElementIsVisible(signUpScreenObject.invalidOtpError);
        assertEquals("invalid OTP error message did not display", signUpScreenObject.invalidOtpError.getText(), invalidOtpError);
    }
}
