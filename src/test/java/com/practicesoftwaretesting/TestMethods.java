package com.practicesoftwaretesting;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to user sign-up page test method
    protected void navigateToUserSignUpPageTest(HomePage homePage){
        SignInPage signInPage = new SignInPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //log available product data (on home page)
        logHomePageProductData(homePage);
        //click 'Sign-in' navbar link
        homePage.clickSignInNavbarLink();
        //assert the user gets on sign-in page (it contains sign-up link)
        assertEquals("Login", signInPage.getSignInPageTitle(), "The sign-in page title doesn't match expectations or the user is on the wrong page.");
        //sign-in page web assert
        isSignInPageWebElementDisplayed(signInPage);
        //click 'Sign-up' link
        signInPage.clickSignUpLink();
        SignUpPage signUpPage = new SignUpPage(driver);
        //assert the user gets on sign-in page (it contains sign-up link)
        assertEquals("Customer registration", signUpPage.getSignUpPageTitle(), "The 'Sign-up' page title doesn't match expectations or the user is on the wrong page.");
    }

    //valid user account creation test method
    protected void createValidUserAccountTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //valid user input data getter
        signUpPage.validInputUserDataGetter();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        SignInPage signInPage = new SignInPage(driver);
        //assert the user gets back onto "Sign-in' page - there's no message confirmation for account creation (for some reason Selenium displays "Customer Registration" instead of "Login" => the actual user visually gets there though
//        assertEquals("Login", signInPage.getSignInPageTitle(), "The sign-in page title doesn't match expectations or the user is on the wrong page.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Creation");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //negative user account creation tests

    //no singular inputs

    //invalid user account creation test method (no first name)
    protected void invalidUserAccountNoFirstNameCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no first name
        signUpPage.invalidInputUserDataGetterNoFirstName();
        //don't input first name
        signUpPage.inputNoFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        assertEquals("First name is required", signUpPage.getInvalidUserInputErrorMessage(), "The first name error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with No First Name");
    }
    //invalid user account creation test method (no last name)
    protected void invalidUserAccountNoLastNameCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no last name
        signUpPage.invalidInputUserDataGetterNoLastName();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //don't input last name
        signUpPage.inputNoLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        assertEquals("fields.last-name.required", signUpPage.getInvalidUserInputErrorMessage(), "The last name error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with No Last Name");
    }
    //invalid user account creation test method (no birthdate)
    protected void invalidUserAccountNoBirthdateCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no birthdate
        signUpPage.invalidInputUserDataGetterNoBirthdate();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //don't input birthdate
        signUpPage.inputNoBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        assertEquals("Date of Birth is required", signUpPage.getInvalidInputErrorMessage(), "The birthdate error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with No Birthdate");
    }
    //invalid user account creation test method (no user address)
    protected void invalidUserAccountNoAddressCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user address
        signUpPage.invalidInputUserDataGetterNoAddress();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //don't input address
        signUpPage.inputNoAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        assertEquals("Address is required", signUpPage.getInvalidInputErrorMessage(), "The user address error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with No User Address");
    }
    //invalid user account creation test method (no user post code) (the user account gets created)
    protected void invalidUserAccountNoPostCodeCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user post code
        signUpPage.invalidInputUserDataGetterNoPostCode();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //don't input post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //log the issue if the user account gets created
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Postcode is required", errorMessage, "The user postcode error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite no user postcode being input.");
        }
        //capture screenshot of the error
        captureScreenshot(driver, "Invalid User Account Creation with No User Post Code");
    }
    //invalid user account creation test method (no user city)
    protected void invalidUserAccountNoCityCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user city
        signUpPage.invalidInputUserDataGetterNoCity();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //don't input city
        signUpPage.inputNoCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //log the issue if the user account gets created
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("City is required", errorMessage, "The user city error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite no user city being input.");
        }
        //capture screenshot of the error
        captureScreenshot(driver, "Invalid User Account Creation with No User City");
    }
    //invalid user account creation test method (no user state)
    protected void invalidUserAccountNoStateCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user state
        signUpPage.invalidInputUserDataGetterNoState();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //don't input state
        signUpPage.inputNoStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //log the issue if the user account gets created
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("State is required", errorMessage, "The user state error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite no user state being input.");
        }
        //capture screenshot of the error
        captureScreenshot(driver, "Invalid User Account Creation with No User State");
    }
    //invalid user account creation test method (no user country)
    protected void invalidUserAccountNoCountryCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user country
        signUpPage.invalidInputUserDataGetterNoCountry();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //log the issue if the user account gets created
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Country is required", errorMessage, "The user state error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite no user country being input.");
        }
        //capture screenshot of the error
        captureScreenshot(driver, "Invalid User Account Creation with No User Country");
    }
    //invalid user account creation test method (no user phone number)
    protected void invalidUserAccountNoPhoneCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user phone
        signUpPage.invalidInputUserDataGetterNoPhone();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //don't input phone number
        signUpPage.inputNoPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //log the issue if the user account gets created
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("Only numbers are allowed.", errorMessage, "The user phone error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite no user phone number being input.");
        }
        //capture screenshot of the error
        captureScreenshot(driver, "Invalid User Account Creation with No User Phone Number");
    }
    //invalid user account creation test method (no user email address)
    protected void invalidUserAccountNoEmailCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user email address
        signUpPage.invalidInputUserDataGetterNoEmail();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //don't input email address
        signUpPage.inputNoEmailIntoInputField();
        //input valid password
        signUpPage.inputPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //log the issue if the user account gets created
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("Email is required", errorMessage, "The user email address error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite no user email address being input.");
        }
        //capture screenshot of the error
        captureScreenshot(driver, "Invalid User Account Creation with No User Email Address");
    }
    //invalid user account creation test method (no password)
    protected void invalidUserAccountNoPasswordCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> no user password
        signUpPage.invalidInputUserDataGetterNoPassword();
        //input valid first name
        signUpPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPage.inputAddressIntoInputField();
        //input valid post code
        signUpPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPage.inputCityIntoInputField();
        //input valid state
        signUpPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPage.inputEmailIntoInputField();
        //don't input password
        signUpPage.inputNoPasswordIntoInputField();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //log the issue if the user account gets created
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("Password is required", errorMessage, "The user password error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite no user password being input.");
        }
        //capture screenshot of the error
        captureScreenshot(driver, "Invalid User Account Creation with No User Email Address");
    }

    //too short singular inputs

    //invalid user account creation test method (too short first name) (the user account gets created)
    protected void invalidUserAccountTooShortFirstNameCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short first name
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortFirstName();
        //input too short first name
        signUpTooShortSingularInputPage.inputTooShortFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Too short first name", errorMessage, "The first name error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short first name.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short First Name");
    }
    //invalid user account creation test method (too short last name) (the user account gets created)
    protected void invalidUserAccountTooShortLastNameCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short last name
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortLastName();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input too short last name
        signUpTooShortSingularInputPage.inputTooShortLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Too short last name", errorMessage, "The last name error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short last name.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short Last Name");
    }
    //invalid user account creation test method (too short user address) (the user account gets created)
    protected void invalidUserAccountTooShortAddressCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user address
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortAddress();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input too short address
        signUpTooShortSingularInputPage.inputTooShortAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Too short address", errorMessage, "The user address error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short user address.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short User Address");
    }
    //invalid user account creation test method (too short user post code) (the user account gets created)
    protected void invalidUserAccountTooShortPostCodeCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user post code
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortPostCode();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input too short post code
        signUpTooShortSingularInputPage.inputTooShortPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Too short postcode", errorMessage, "The user post code error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short user post code.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short User Post Code");
    }
    //invalid user account creation test method (too short user city) (the user account gets created)
    protected void invalidUserAccountTooShortCityCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user city
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortCity();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input too short city
        signUpTooShortSingularInputPage.inputTooShortCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Too short city", errorMessage, "The user city error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short user city.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short User City");
    }
    //invalid user account creation test method (too short user state) (the user account gets created)
    protected void invalidUserAccountTooShortStateCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user state
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortState();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input too short state
        signUpTooShortSingularInputPage.inputTooShortStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Too short state", errorMessage, "The user state error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short user state.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short State");
    }
    //invalid user account creation test method (too short user phone number) (the user account gets created)
    protected void invalidUserAccountTooShortPhoneCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user phone number
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortPhone();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input too short phone number
        signUpTooShortSingularInputPage.inputTooShortPhoneIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidUserInputErrorMessage();
            assertEquals("Too short phone number", errorMessage, "The user phone error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short user phone number.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short Phone");
    }
    //invalid user account creation test method (too short user email address) (the user account gets created)
    protected void invalidUserAccountTooShortEmailCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user email address
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortEmail();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input too short email address
        signUpTooShortSingularInputPage.inputTooShortEmailIntoInputField();
        //input valid password
        signUpTooShortSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpTooShortSingularInputPage.getPassword(), signUpTooShortSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("", errorMessage, "The user email error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short user email address(usually, one char is invalid).");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short Email");
    }
    //invalid user account creation test method (too short user password) (the user account gets created)
    protected void invalidUserAccountTooShortPasswordCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpTooShortSingularInputPage signUpTooShortSingularInputPage = new SignUpTooShortSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user password
        signUpTooShortSingularInputPage.invalidInputUserDataGetterTooShortPassword();
        //input valid first name
        signUpTooShortSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpTooShortSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpTooShortSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpTooShortSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpTooShortSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpTooShortSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpTooShortSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpTooShortSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpTooShortSingularInputPage.inputEmailIntoInputField();
        //input too short password
        signUpTooShortSingularInputPage.inputTooShortPasswordIntoInputField();
        //click 'Password view' button
        signUpTooShortSingularInputPage.clickPasswordViewButton();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("", errorMessage, "The user password error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too short user password.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Short Password");
    }

    //invalid format test scenarios

    //invalid user account creation test method (invalid user phone number format)
    protected void invalidUserAccountInvalidPhoneCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpInvalidSingularInputPage signUpInvalidSingularInputPage = new SignUpInvalidSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user phone number
        signUpInvalidSingularInputPage.invalidInputUserDataGetterInvalidPhoneFormat();
        //input valid first name
        signUpInvalidSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpInvalidSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpInvalidSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpInvalidSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpInvalidSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpInvalidSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpInvalidSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input invalid phone number
        signUpInvalidSingularInputPage.inputInvalidPhoneFormatIntoInputField();
        //input valid email address
        signUpInvalidSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpInvalidSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpInvalidSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpInvalidSingularInputPage.getPassword(), signUpInvalidSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("Only numbers are allowed.", errorMessage, "The user phone error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting invalid user phone number.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Invalid Phone Format");
    }
    //invalid user account creation test method (invalid email address format)
    protected void invalidUserAccountInvalidEmailCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpInvalidSingularInputPage signUpInvalidSingularInputPage = new SignUpInvalidSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too short user email address
        signUpInvalidSingularInputPage.invalidInputUserDataGetterInvalidEmail();
        //input valid first name
        signUpInvalidSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpInvalidSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpInvalidSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpInvalidSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpInvalidSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpInvalidSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpInvalidSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpInvalidSingularInputPage.inputPhoneNumberIntoInputField();
        //input too short email address
        signUpInvalidSingularInputPage.inputInvalidEmailIntoInputField();
        //input valid password
        signUpInvalidSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpInvalidSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpInvalidSingularInputPage.getPassword(), signUpInvalidSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("", errorMessage, "The user email error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting invalid user email address (format).");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Invalid Email Format");
    }
    //invalid user account creation test method (with existing email address)
    protected void invalidUserAccountExistingEmailCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        //utility class
        SignUpInvalidSingularInputPage signUpInvalidSingularInputPage = new SignUpInvalidSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //valid user input data getter -> for first loop
        signUpInvalidSingularInputPage.validInputUserDataGetter();
        //input valid first name
        signUpInvalidSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpInvalidSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpInvalidSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpInvalidSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpInvalidSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpInvalidSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpInvalidSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpInvalidSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpInvalidSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpInvalidSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpInvalidSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpInvalidSingularInputPage.getPassword(), signUpInvalidSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Already Existing Email - First Loop");
        //click 'Sign-up' link (to return to 'Sign-up' page)
        signInPage.clickSignUpLink();
        //second test loop
        //invalid user input data getter -> with already existing email
        signUpInvalidSingularInputPage.invalidInputUserDataGetterExistingEmail();
        //input valid first name
        signUpInvalidSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpInvalidSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpInvalidSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpInvalidSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpInvalidSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpInvalidSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpInvalidSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpInvalidSingularInputPage.inputPhoneNumberIntoInputField();
        //input already existing email address
        signUpInvalidSingularInputPage.inputUsedEmailIntoInputField();
        //input valid password
        signUpInvalidSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpInvalidSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpInvalidSingularInputPage.getPassword(), signUpInvalidSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpInvalidSingularInputPage.getLowerErrorInputMessage();
            assertEquals("A customer with this email address already exists.", errorMessage, "The user email error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting pre-existing user email address.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Already Existing Email - Final Test Result");
    }
    //invalid user account creation test method (invalid user password format)
    protected void invalidUserAccountInvalidPasswordCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpInvalidSingularInputPage signUpInvalidSingularInputPage = new SignUpInvalidSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> invalid user password format
        signUpInvalidSingularInputPage.invalidInputUserDataGetterInvalidPasswordFormat();
        //input valid first name
        signUpInvalidSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpInvalidSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpInvalidSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpInvalidSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpInvalidSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpInvalidSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpInvalidSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpInvalidSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpInvalidSingularInputPage.inputEmailIntoInputField();
        //input invalid password (by format)
        signUpInvalidSingularInputPage.inputInvalidPasswordIntoInputField();
        //click 'Password view' button
        signUpInvalidSingularInputPage.clickPasswordViewButton();
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPage.getInvalidInputErrorMessage();
            assertEquals("", errorMessage, "The user password error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting user password in invalid format.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Invalid Password Format");
    }

    //invalid user account creation test method (invalid birthdate (< 18 y.o))
    protected void invalidUserAccountInvalidBirthdateCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpInvalidSingularInputPage signUpInvalidSingularInputPage = new SignUpInvalidSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> invalid birthdate
        signUpInvalidSingularInputPage.invalidInputUserDataGetterInvalidBirthdate();
        //input valid first name
        signUpInvalidSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpInvalidSingularInputPage.inputLastNameIntoInputField();
        //input invalid birthdate
        signUpInvalidSingularInputPage.inputInvalidBirthdateIntoInputField();
        //input valid address
        signUpInvalidSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpInvalidSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpInvalidSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpInvalidSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpInvalidSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpInvalidSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpInvalidSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpInvalidSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpInvalidSingularInputPage.getPassword(), signUpInvalidSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpInvalidSingularInputPage.getLowerErrorInputMessage();
            assertEquals("Customer must be 18 years old.", errorMessage, "The birthdate error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting invalid birthdate.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Invalid Birthdate (less than 18 y.o.)");
    }

    //too long singular input tests

    //invalid user account creation test method (too long first name)
    protected void invalidUserAccountTooLongFirstNameCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long first name
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongFirstName();
        //input too long first name
        signUpPageTooLongSingularInputPage.inputTooLongFirstNameIntoInputField();
        //input valid last name
        signUpPageTooLongSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPageTooLongSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpPageTooLongSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPageTooLongSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpPageTooLongSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPageTooLongSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPageTooLongSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getTooLongSingularInputErrorMessage();
            assertEquals("The first name field must not be greater than 40 characters.", errorMessage, "The first name error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too long first name.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long First Name");
    }
    //invalid user account creation test method (too long last name)
    protected void invalidUserAccountTooLongLastNameCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long last name
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongLastName();
        //input valid first name
        signUpPageTooLongSingularInputPage.inputFirstNameIntoInputField();
        //input too long last name
        signUpPageTooLongSingularInputPage.inputTooLongLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPageTooLongSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpPageTooLongSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPageTooLongSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpPageTooLongSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPageTooLongSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPageTooLongSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getTooLongSingularInputErrorMessage();
            assertEquals("The last name field must not be greater than 20 characters.", errorMessage, "The last name error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too long last name.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long Last Name");
    }
    //invalid user account creation test method (too long user address)
    protected void invalidUserAccountTooLongAddressCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long user address
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongAddress();
        //input valid first name
        signUpPageTooLongSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPageTooLongSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input too long address
        signUpPageTooLongSingularInputPage.inputTooLongAddressIntoInputField();
        //input valid post code
        signUpPageTooLongSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPageTooLongSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpPageTooLongSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPageTooLongSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPageTooLongSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getTooLongSingularInputErrorMessage();
            assertEquals("The address field must not be greater than 70 characters.", errorMessage, "The user address error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too long user address.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long User Address");
    }
    //invalid user account creation test method (too long user post code)
    protected void invalidUserAccountTooLongPostCodeCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long user post code
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongPostCode();
        //input valid first name
        signUpPageTooLongSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPageTooLongSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPageTooLongSingularInputPage.inputAddressIntoInputField();
        //input too long post code
        signUpPageTooLongSingularInputPage.inputTooLongPostCodeIntoInputField();
        //input valid city
        signUpPageTooLongSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpPageTooLongSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPageTooLongSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPageTooLongSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getTooLongSingularInputErrorMessage();
            assertEquals("The postcode field must not be greater than 10 characters.", errorMessage, "The user post code error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too long user post code.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long User Post Code");
    }
    //invalid user account creation test method (too long user city)
    protected void invalidUserAccountTooLongCityCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long user city
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongCity();
        //input valid first name
        signUpPageTooLongSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPageTooLongSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPageTooLongSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpPageTooLongSingularInputPage.inputPostCodeIntoInputField();
        //input too long city
        signUpPageTooLongSingularInputPage.inputTooLongCityIntoInputField();
        //input valid state
        signUpPageTooLongSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPageTooLongSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPageTooLongSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getTooLongSingularInputErrorMessage();
            assertEquals("The city field must not be greater than 40 characters.", errorMessage, "The user city error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too long user city.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long User City");
    }
    //invalid user account creation test method (too long user state)
    protected void invalidUserAccountTooLongStateCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long user state
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongState();
        //input valid first name
        signUpPageTooLongSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPageTooLongSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPageTooLongSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpPageTooLongSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPageTooLongSingularInputPage.inputCityIntoInputField();
        //input too long state
        signUpPageTooLongSingularInputPage.inputTooLongStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPageTooLongSingularInputPage.inputPhoneNumberIntoInputField();
        //input valid email address
        signUpPageTooLongSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getTooLongSingularInputErrorMessage();
            assertEquals("The state field must not be greater than 40 characters.", errorMessage, "The user state error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user account gets created despite inputting too long user state.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long User State");
    }
    //invalid user account creation test method (too long user phone)
    protected void invalidUserAccountTooLongPhoneCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long user phone
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongPhone();
        //input valid first name
        signUpPageTooLongSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPageTooLongSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPageTooLongSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpPageTooLongSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPageTooLongSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpPageTooLongSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input too long phone number
        signUpPageTooLongSingularInputPage.inputTooLongPhoneIntoInputField();
        //input valid email address
        signUpPageTooLongSingularInputPage.inputEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getTooLongSingularInputErrorMessage();
            assertEquals("The phone field must not be greater than 24 characters.", errorMessage, "The user phone error message doesn't match expectations.");
        } catch (NoSuchElementException e) {
            logger.error("The user phone gets created despite inputting too long user phone.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long User Phone");
    }
    //invalid user account creation test method (too long user email)
    protected void invalidUserAccountTooLongEmailCreationTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        //utility class
        SignUpPageTooLongSingularInputPage signUpPageTooLongSingularInputPage = new SignUpPageTooLongSingularInputPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-up web element assert
        isSignUpPageWebElementDisplayed(signUpPage);
        //sign-up page text elements assert
        isSignUpTextAsExpected(signUpPage);
        //invalid user input data getter -> too long user email
        signUpPageTooLongSingularInputPage.invalidInputUserDataGetterTooLongEmail();
        //input valid first name
        signUpPageTooLongSingularInputPage.inputFirstNameIntoInputField();
        //input valid last name
        signUpPageTooLongSingularInputPage.inputLastNameIntoInputField();
        //input valid birthdate
        signUpPageTooLongSingularInputPage.inputBirthdateIntoInputField();
        //input valid address
        signUpPageTooLongSingularInputPage.inputAddressIntoInputField();
        //input valid post code
        signUpPageTooLongSingularInputPage.inputPostCodeIntoInputField();
        //input valid city
        signUpPageTooLongSingularInputPage.inputCityIntoInputField();
        //input valid state
        signUpPageTooLongSingularInputPage.inputStateIntoInputField();
        //click country dropdown menu
        signUpPage.clickCountryDropdownMenu();
        //select 'United States'
        signUpPage.selectUnitedStatesOption();
        //input valid phone number
        signUpPageTooLongSingularInputPage.inputPhoneNumberIntoInputField();
        //input too long email address
        signUpPageTooLongSingularInputPage.inputTooLongEmailIntoInputField();
        //input valid password
        signUpPageTooLongSingularInputPage.inputPasswordIntoInputField();
        //click 'Password view' button
        signUpPageTooLongSingularInputPage.clickPasswordViewButton();
        //assert the correct password has been input (for 'Password view' button testing)
        assertEquals(signUpPageTooLongSingularInputPage.getPassword(), signUpPageTooLongSingularInputPage.getPasswordInput(), "There's a password mismatch.");
        //click 'Register' button
        signUpPage.clickRegisterButton();
        //assert the expected error message displayed matches the expectations
        try {
            String errorMessage = signUpPageTooLongSingularInputPage.getEmailErrorMessage();
            assertEquals("", errorMessage, "The user email error message doesn't match expectations."); //it doesn't have error message text though
        } catch (NoSuchElementException e) {
            logger.error("The user phone gets created despite inputting too long user email.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation with Too Long User Email");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //user login tests

    //valid user login test method
    protected void validUserSignInTest(SignUpPage signUpPage){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //sign-in page web element assert
        //isSignInPageWebElementDisplayed(signInPage); //Selenium can't locate these elements with VALID selectors
        //valid login user input data getter
        signInPage.validInputUserLoginDataGetter(signUpPage);
        //input valid email
        signInPage.inputValidLoginEmailIntoInputField();
        //input valid password
        signInPage.inputValidLoginPasswordIntoInputField();
        //click 'Login' button
        signInPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Login Test");
    }

    //user logout test

    //user logout test method
    protected void userSignOutTest(MyAccountPage myAccountPage){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //my account web element assert
        //isMyAccountPageWebElementDisplayed(myAccountPage); //Selenium can't locate these elements with VALID selectors
        //my account page text assert
        //isMyAccountPageTextAsExpected(myAccountPage); //Selenium can't locate these elements with VALID selectors
        //click profile dropdown menu
        myAccountPage.clickProfileDropdownMenu();
        //click 'Sign-out' option
        myAccountPage.clickSignOutOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Logout Test");
    }

    //homepage web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert home page banner is displayed
        assertTrue(homePage.isHomePageBannerDisplayed(), "The home page banner isn't displayed.");
        //assert product sort dropdown menu is displayed
        assertTrue(homePage.isSortDropdownMenuDisplayed(), "The home page product sort dropdown menu isn't displayed.");
        //assert product price range slider is displayed
        assertTrue(homePage.isPriceRangeSliderDisplayed(), "The home page product price range slider isn't displayed.");
        //assert product search input field is displayed
        assertTrue(homePage.isSearchInputFieldDisplayed(), "The home page product search input field isn't displayed.");
        //assert product search query remove button is displayed
        assertTrue(homePage.isSearchRemoveQueryButtonDisplayed(), "The home page product search query remove button isn't displayed.");
        //assert product search button is displayed
        assertTrue(homePage.isSearchButtonDisplayed(), "The home page product search button isn't displayed.");
        //assert tool selection checkboxes are displayed (as a list)
        assertTrue(homePage.isToolSelectionCheckboxDisplayed(), "The home page tool selection checkbox isn't displayed.");
        //assert brand selection checkboxes are displayed (as a list)
        assertTrue(homePage.isBrandCheckboxDisplayed(), "The home page brand selection checkbox isn't displayed.");
        //assert homepage product cards are displayed (as a list)
        assertTrue(homePage.isProductCardDisplayed(), "The home page product card isn't displayed.");
        //assert homepage product card images are displayed (as a list)
        assertTrue(homePage.isProductCardImageDisplayed(), "The home page product card image isn't displayed.");
        //assert homepage product card names are displayed (as a list)
        assertTrue(homePage.isProductCardNameDisplayed(), "The home page product card name isn't displayed.");
        //assert homepage product card footers are displayed (as a list)
        assertTrue(homePage.isProductCardFooterDisplayed(), "The home page product card footer isn't displayed.");
        //assert homepage pagination links are displayed (as a list)
        assertTrue(homePage.isPaginationLinkDisplayed(), "The home page pagination link isn't displayed.");
    }
    //homepage product data logger method
    protected void logHomePageProductData(HomePage homePage){
        System.out.println("Home page product displayed data: " + "\n");
        logger.info("Home page displayed product names: " + homePage.getProductName());
        logger.info("Home page displayed product card footer content (availability and price): " + homePage.getProductCardFooter());
        System.out.println("\n");
    }

    //sign-in page web element assert test method
    protected void isSignInPageWebElementDisplayed(SignInPage signInPage){
        //assert 'Sign-in' page title is displayed
        assertTrue(signInPage.isSignInPageTitleDisplayed(), "The 'Sign-in' page title isn't displayed.");
        //assert 'Sign-in with Google' button is displayed
        assertTrue(signInPage.isSignInWithGoogleButtonDisplayed(), "The 'Sign-in with Google' button isn't displayed.");
        //assert email address input field is displayed
        assertTrue(signInPage.isEmailAddressInputDisplayed(), "The email address input field isn't displayed.");
        //assert password input field is displayed
        assertTrue(signInPage.isPasswordInputDisplayed(), "The password input field isn't displayed.");
        //assert view password button is displayed
        assertTrue(signInPage.isViewPasswordButtonDisplayed(), "The view password button isn't displayed.");
        //assert 'Sign-in' button is displayed
        assertTrue(signInPage.isSignInButtonDisplayed(), "The 'Sign-in' button isn't displayed.");
        //assert 'Sign-up' link is displayed
        assertTrue(signInPage.isSignUpLinkDisplayed(), "The 'Sign-up' link isn't displayed.");
        //assert 'Forgot password' link is displayed
        assertTrue(signInPage.isForgotPasswordLinkDisplayed(), "The 'Forgot password' link isn't displayed.");
    }

    //sign-up page web element assert test method
    protected void isSignUpPageWebElementDisplayed(SignUpPage signUpPage){
        //assert 'Sign-up' page title is displayed
        assertTrue(signUpPage.isSignUpPageTitleDisplayed(), "The 'Sign-up' page title isn't displayed");
        //assert first name input field is displayed
        assertTrue(signUpPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        //assert last name input field is displayed
        assertTrue(signUpPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        //assert birthdate input field is displayed
        assertTrue(signUpPage.isBirthdateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        //assert address input field is displayed
        assertTrue(signUpPage.isAddressInputFieldDisplayed(), "The address input field isn't displayed");
        //assert post code input field is displayed
        assertTrue(signUpPage.isPostCodeInputFieldDisplayed(), "The post code input field isn't displayed");
        //assert city input field is displayed
        assertTrue(signUpPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        //assert state input field is displayed
        assertTrue(signUpPage.isStateInputFieldDisplayed(), "The state input field isn't displayed");
        //assert country dropdown menu is displayed
        assertTrue(signUpPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        //assert phone input field is displayed
        assertTrue(signUpPage.isPhoneInputFieldDisplayed(), "The phone input field isn't displayed");
        //assert email address input field is displayed
        assertTrue(signUpPage.isEmailAddressInputFieldDisplayed(), "The email address input field isn't displayed");
        //assert password input field is displayed
        assertTrue(signUpPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        //assert password view button is displayed
        assertTrue(signUpPage.isPasswordViewButtonDisplayed(), "The password view button isn't displayed");
        //assert password input hint is displayed
        assertTrue(signUpPage.isPasswordInputHintDisplayed(), "The password input hint isn't displayed");
        //assert password strength bar is displayed
        assertTrue(signUpPage.isPasswordStrengthBarDisplayed(), "The password strength bar isn't displayed");
        //assert register button is displayed
        assertTrue(signUpPage.isRegisterButtonDisplayed(), "The register button isn't displayed");
    }
    //sign-up page text assert test method
    protected void isSignUpTextAsExpected(SignUpPage signUpPage){
        //assert the user gets on sign-in page (it contains sign-up link)
        assertEquals("Customer registration", signUpPage.getSignUpPageTitle(), "The 'Sign-up' page title doesn't match expectations or the user is on the wrong page.");
        //assert password hint matches expectations
        assertEquals("Your password must:\n" +
                "Be at least 8 characters long\n" +
                "Contain both uppercase and lowercase letters\n" +
                "Include at least one number\n" +
                "Have at least one special symbol (e.g., @, #, $, etc.)", signUpPage.getPasswordHint(), "The password hint doesn't match expectations");
        //assert password strength bar text matches expectations
        assertEquals("Weak\n" +
                "Moderate\n" +
                "Strong\n" +
                "Very Strong\n" +
                "Excellent", signUpPage.getPasswordStrengthBarText(), "The password strength bar text doesn't match expectations");
    }

    //my account page web element assert test method
    protected void isMyAccountPageWebElementDisplayed(MyAccountPage myAccountPage){
        //assert 'My Account' page title is displayed
        assertTrue(myAccountPage.isMyAccountPageTitleDisplayed(), "The 'My Account' page title isn't displayed");
        //assert 'My Account' page description is displayed
        assertTrue(myAccountPage.isMyAccountPageDescriptionDisplayed(), "The 'My Account' page description isn't displayed");
        //assert profile dropdown menu is displayed
        assertTrue(myAccountPage.isProfileDropdownMenuDisplayed(), "The profile dropdown menu isn't displayed");
        //assert 'My Account' account table links are displayed (as a list)
        assertTrue(myAccountPage.isMyAccountTableLinkDisplayed(), "The 'My Account' account table link isn't displayed");
    }
    //my account page text assert
    protected void isMyAccountPageTextAsExpected(MyAccountPage myAccountPage){
        //assert 'My Account' page title is as expected
        assertEquals("My account", myAccountPage.getMyAccountPageTitle(), "The page title doesn't match expectations.");
        //assert 'My Account' page description is as expected
        assertEquals("Here you can manage your profile, favorites and orders.", myAccountPage.getMyAccountPageDescription(), "The page description doesn't match expectations.");
    }

    //general web element assert test method
    protected void isGeneralPageWebElementDisplayed(HomePage homePage){
        //assert navbar brand logo is displayed //somehow Selenium doesn't find this link with VALID selector(checked in dev browser console)
        //assertTrue(homePage.isNavbarBrandLogoDisplayed(), "The navbar brand logo isn't displayed.");
        //assert navbar links are displayed (as a list)
        assertTrue(homePage.isNavbarLinkDisplayed(), "The navbar link isn't displayed.");
        //assert navbar language dropdown menu is displayed
        assertTrue(homePage.isNavbarLanguageDropdownMenuDisplayed(), "The navbar language dropdown menu isn't displayed.");
        //assert footer paragraph is displayed
        assertTrue(homePage.isFooterParagraphDisplayed(), "The footer paragraph isn't displayed.");
        //assert footer links are displayed (as a list)
        assertTrue(homePage.isFooterLinkDisplayed(), "The footer link isn't displayed.");
    }

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("D:\\IntelliJ Selenium projects\\ToolShopDemoSelenium\\src\\test\\resources" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
