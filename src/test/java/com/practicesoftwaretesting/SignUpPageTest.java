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
        //test title (for logging)
        System.out.println("Valid User Account Creation Test" + "\n");
        //valid user account creation test
        createValidUserAccountTest(signUpPage);
    }

    //negative user account creation tests

    //Test 002a -> invalid user account creation test (no first name)
    @Test
    @DisplayName("Invalid User Account Creation Test - No First Name")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoFirstNameCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No First Name" + "\n");
        //invalid user account creation test (no first name)
        invalidUserAccountNoFirstNameCreationTest(signUpPage);
    }

    //Test 002b -> invalid user account creation test (no last name)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Last Name")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoLastNameCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No Last Name" + "\n");
        //invalid user account creation test (no last name)
        invalidUserAccountNoLastNameCreationTest(signUpPage);
    }

    //Test 002c -> invalid user account creation test (no birthdate)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Birthdate")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoBirthdateCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No Birthdate" + "\n");
        //invalid user account creation test (no birthdate)
        invalidUserAccountNoBirthdateCreationTest(signUpPage);
    }

    //Test 002d -> invalid user account creation test (no user address)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Address")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoAddressCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No User Address" + "\n");
        //invalid user account creation test (no user address)
        invalidUserAccountNoAddressCreationTest(signUpPage);
    }
}
