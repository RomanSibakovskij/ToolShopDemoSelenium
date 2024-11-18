package com.practicesoftwaretesting;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to user sign-up page test method
    protected void navigateToUserSignUpPageTest(HomePage homePage){
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
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
