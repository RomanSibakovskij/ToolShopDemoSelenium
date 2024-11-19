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

    //Test 002e -> invalid user account creation test (no user post code) (the account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Post Code")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoPostCodeCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No User Post Code" + "\n");
        //invalid user account creation test (no user post code)
        invalidUserAccountNoPostCodeCreationTest(signUpPage);
    }

    //Test 002f -> invalid user account creation test (no user city)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User City")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoCityCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No User City" + "\n");
        //invalid user account creation test (no user city)
        invalidUserAccountNoCityCreationTest(signUpPage);
    }

    //Test 002g -> invalid user account creation test (no user state)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User State")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoStateCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No User State" + "\n");
        //invalid user account creation test (no user state)
        invalidUserAccountNoStateCreationTest(signUpPage);
    }

    //Test 002h -> invalid user account creation test (no user country)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Country")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoCountryCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No User Country" + "\n");
        //invalid user account creation test (no user country)
        invalidUserAccountNoCountryCreationTest(signUpPage);
    }

    //Test 002i -> invalid user account creation test (no user phone number)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Phone Number")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoPhoneCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No User Phone Number" + "\n");
        //invalid user account creation test (no user phone number)
        invalidUserAccountNoPhoneCreationTest(signUpPage);
    }

    //Test 002j -> invalid user account creation test (no user email address)
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Email Address")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoEmailCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No User Email Address" + "\n");
        //invalid user account creation test (no user email address)
        invalidUserAccountNoEmailCreationTest(signUpPage);
    }

    //Test 002k -> invalid user account creation test (no password)
    @Test
    @DisplayName("Invalid User Account Creation Test - No Password")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("No_Singular_Input")
    void invalidUserAccountNoPasswordCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - No Password" + "\n");
        //invalid user account creation test (no user password)
        invalidUserAccountNoPasswordCreationTest(signUpPage);
    }

}
