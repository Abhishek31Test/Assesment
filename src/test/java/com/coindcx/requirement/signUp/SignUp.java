package com.coindcx.requirement.signUp;

import com.coindcx.requirement.TestBase;
import org.testng.annotations.Test;
import pageObject.homeScreen.HomeScreen;
import pageObject.signUpScreen.SignUpScreen;

import static data.Data.*;

public class SignUp extends TestBase {


    @Test(description = "Verify appropriate error message is displayed below all the text box on clicking next button with all fields empty")
    public void verifyErrorMsgDisplayedBelowTextBox(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.clickNextButton();
        signUpScreen.allEmptyFieldErrors();
    }

    @Test(description = "Verify invalid email error is displayed if the entered email is of invalid format")
    public void verifyInvalidEmailError(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.verifyInvalidEmailError();
    }

    @Test(description = "Verify password validation error is displayed if entered password doesn't meet the password criteria")
    public void verifyPasswordValidationError(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.passwordValidationError();
    }

    @Test(description = "Verify appropriate error message is displayed when county and phone number field is empty")
    public void verifyEmptyErrorMsgOnContryAndPhoneNumberField(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.enterAllFields(firstName, lastName, validEmail, validPassword);
        signUpScreen.nextSignUpScreenIsDisplayed();
        signUpScreen.verifyCountryAndPhoneNumberError();
    }

    @Test(description = "Verify country code is pre-populated in phone number field when country is selected")
    public void verifyCountryCodeIsDisplayed(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.enterAllFields(firstName, lastName, validEmail, validPassword);
        signUpScreen.nextSignUpScreenIsDisplayed();
        signUpScreen.verifyCountyCodeIsDisplayed(country);
    }

    @Test(description = "Verify OTP screen is displayed on signing up")
    public void verifyOtpScreenIsDisplayed(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.enterAllFields(firstName, lastName, validEmail, validPassword);
        signUpScreen.nextSignUpScreenIsDisplayed();
        signUpScreen.enterCountryAndPhoneNumber(country, phoneNumber);
        signUpScreen.clickSignUpBtn();
        signUpScreen.otpScreenIsDisplayed();
    }

    @Test(description = "Verify invalid phone number error is displayed if the entered phone number is invalid")
    public void verifyInvalidPhoneNumberErrorIsDisplayed(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.enterAllFields(firstName, lastName, validEmail, validPassword);
        signUpScreen.nextSignUpScreenIsDisplayed();
        signUpScreen.enterCountryAndPhoneNumber(country, invalidPhoneNumber);
        signUpScreen.verifyInvalidPhoneNumberError();
    }

    @Test(description = "Verify invalid OTP error is displayed if the entered otp is invalid")
    public void verifyInvalidOtpError(){
        SignUpScreen signUpScreen = new SignUpScreen(driver);
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.isHomePageDisplayed();
        homeScreen.clickOnRegister();
        signUpScreen.isSignUpScreenDisplayed();
        signUpScreen.verifyInputFieldsAreDisplayed();
        signUpScreen.enterAllFields(firstName, lastName, validEmail, validPassword);
        signUpScreen.nextSignUpScreenIsDisplayed();
        signUpScreen.enterCountryAndPhoneNumber(country, phoneNumber);
        signUpScreen.clickSignUpBtn();
        signUpScreen.otpScreenIsDisplayed();
        signUpScreen.enterEmailAndSmsOtp(invalidOTP);
        signUpScreen.verifyInvalidOtpError();
    }
}
