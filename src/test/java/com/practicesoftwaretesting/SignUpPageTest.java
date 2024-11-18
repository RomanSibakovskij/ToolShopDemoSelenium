package com.practicesoftwaretesting;

import org.junit.jupiter.api.*;

public class SignUpPageTest extends TestMethods{

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_Account_Creation_Test")
    void validUserAccountCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
    }
}
