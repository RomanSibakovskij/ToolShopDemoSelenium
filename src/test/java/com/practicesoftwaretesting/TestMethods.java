package com.practicesoftwaretesting;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

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
}
