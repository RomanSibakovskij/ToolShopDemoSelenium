package com.practicesoftwaretesting;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //Test 001 -> user navigation to sign-up page test
    @Test
    @DisplayName("Navigate To User Sign-up Page Test (as a guest)")
    @Tag("Navigate_To_Sign_Up_Page")
    void navigateToSignInPageTest(){
        HomePage homePage = new HomePage(driver);
        navigateToUserSignUpPageTest(homePage);
    }

    //Test 005 -> add bolt cutters product to cart test (as a registered user)
    @Test
    @DisplayName("Add Bolt Cutters To Cart Test (as a registered user)")
    @Tag("Add_Singular_Product_To_Cart_Test")
    void validUserAccountCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //valid user login test
        validUserSignInTest(signUpPage);
        //return to homepage test
        returnToHomePageTestMethod(homePage);
        //test title (for logging)
        System.out.println("Add Bolt Cutters To Cart Test (as a registered user)" + "\n");
        //add 'Bolt cutters' to cart test
        addBoltCuttersToCartTest();
    }
}
