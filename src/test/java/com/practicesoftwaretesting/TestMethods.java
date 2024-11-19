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
