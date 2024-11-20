package com.practicesoftwaretesting;

import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //Test 003 -> valid user login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_Account_Login_Test")
    void validUserAccountCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //test title (for logging)
        System.out.println("Valid User Login Test" + "\n");
        //valid user login test
        validUserSignInTest(signUpPage);
    }
}