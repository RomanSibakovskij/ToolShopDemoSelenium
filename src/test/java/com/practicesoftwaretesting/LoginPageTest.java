package com.practicesoftwaretesting;

import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //Test 003 -> valid user login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_Account_Login_Test")
    void validUserAccountLoginTest(){
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

    //negative login tests

    //Test 003a -> invalid user login test (no login email)
    @Test
    @DisplayName("Invalid User Login Test - No Login Email")
    @Tag("Invalid_Account_Login_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountLoginNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //test title (for logging)
        System.out.println("Invalid User Login Test - No Login Email" + "\n");
        //invalid user login test (no login email)
        invalidUserSignInNoEmailTest(signUpPage);
    }

    //Test 003b -> invalid user login test (no login password)
    @Test
    @DisplayName("Invalid User Login Test - No Login Password")
    @Tag("Invalid_Account_Login_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountLoginNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //test title (for logging)
        System.out.println("Invalid User Login Test - No Login Password" + "\n");
        //invalid user login test (no login password)
        invalidUserSignInNoPasswordTest(signUpPage);
    }

    //Test 003c -> invalid user login test (invalid login email)
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email")
    @Tag("Invalid_Account_Login_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountLoginInvalidEmailTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //test title (for logging)
        System.out.println("Invalid User Login Test - Invalid Login Email" + "\n");
        //invalid user login test (invalid login email)
        invalidUserSignInInvalidEmailTest(signUpPage);
    }

    //Test 003d -> invalid user login test (invalid login email format)
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email Format")
    @Tag("Invalid_Account_Login_Test")
    @Tag("Invalid_Singular_Input")
    @Tag("Invalid_Singular_Input_Format")
    void invalidUserAccountLoginInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //test title (for logging)
        System.out.println("Invalid User Login Test - Invalid Login Email Format" + "\n");
        //invalid user login test (invalid login email format)
        invalidUserSignInInvalidEmailFormatTest(signUpPage);
    }

    //Test 003e -> invalid user login test (invalid login password)
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Password")
    @Tag("Invalid_Account_Login_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountLoginInvalidPasswordTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //test title (for logging)
        System.out.println("Invalid User Login Test - Invalid Login Password" + "\n");
        //invalid user login test (invalid login password)
        invalidUserSignInInvalidPasswordTest(signUpPage);
    }

    //user logout test

    //Test 004 -> valid user logout test
    @Test
    @DisplayName("Valid User Logout Test")
    @Tag("Valid_Account_Logout_Test")
    void validUserAccountLogoutTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
        //valid user login test
        validUserSignInTest(signUpPage);
        //test title (for logging)
        System.out.println("User Logout Test" + "\n");
        //user logout test
        userSignOutTest(myAccountPage);
    }
}
