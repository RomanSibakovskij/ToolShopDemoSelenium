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

    //too short singular input tests

    //Test 002l -> invalid user account creation test (too short first name) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short First Name")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortFirstNameCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short First Name" + "\n");
        //invalid user account creation test (too short first name)
        invalidUserAccountTooShortFirstNameCreationTest(signUpPage);
    }

    //Test 002m -> invalid user account creation test (too short last name) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Last Name")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortLastNameCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short Last Name" + "\n");
        //invalid user account creation test (too short last name)
        invalidUserAccountTooShortLastNameCreationTest(signUpPage);
    }

    //Test 002n -> invalid user account creation test (too short user address) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Address")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortAddressCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short Address" + "\n");
        //invalid user account creation test (too short address)
        invalidUserAccountTooShortAddressCreationTest(signUpPage);
    }

    //Test 002o -> invalid user account creation test (too short user post code) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Post Code")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortPostCodeCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short Post Code" + "\n");
        //invalid user account creation test (too short post code)
        invalidUserAccountTooShortPostCodeCreationTest(signUpPage);
    }

    //Test 002p -> invalid user account creation test (too short user city) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short City")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortCityCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short City" + "\n");
        //invalid user account creation test (too short city)
        invalidUserAccountTooShortCityCreationTest(signUpPage);
    }

    //Test 002q -> invalid user account creation test (too short user state) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short State")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortStateCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short State" + "\n");
        //invalid user account creation test (too short state)
        invalidUserAccountTooShortStateCreationTest(signUpPage);
    }

    //Test 002r -> invalid user account creation test (too short user phone) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Phone")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortPhoneCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short Phone" + "\n");
        //invalid user account creation test (too short phone)
        invalidUserAccountTooShortPhoneCreationTest(signUpPage);
    }

    //Test 002s -> invalid user account creation test (too short user email) (the user account gets created)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Email")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortEmailCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short Email" + "\n");
        //invalid user account creation test (too short email)
        invalidUserAccountTooShortEmailCreationTest(signUpPage);
    }

    //Test 002t -> invalid user account creation test (too short password)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Password")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountTooShortPasswordCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Short Password" + "\n");
        //invalid user account creation test (too short password)
        invalidUserAccountTooShortPasswordCreationTest(signUpPage);
    }

    //invalid singular input format tests

    //Test 002u -> invalid user account creation test (invalid user phone format)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Phone Format")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Invalid_Singular_Input_Format")
    void invalidUserAccountInvalidPhoneCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Invalid Phone Format" + "\n");
        //invalid user account creation test (invalid phone format)
        invalidUserAccountInvalidPhoneCreationTest(signUpPage);
    }

    //Test 002v -> invalid user account creation test (invalid user email format)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Email Format")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Invalid_Singular_Input_Format")
    void invalidUserAccountInvalidEmailCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Invalid Email Format" + "\n");
        //invalid user account creation test (invalid email format)
        invalidUserAccountInvalidEmailCreationTest(signUpPage);
    }

    //Test 002w -> invalid user account creation test (already used user email)
    @Test
    @DisplayName("Invalid User Account Creation Test - Existing Email ")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Pre_Existing_Singular_Input")
    void invalidUserAccountExistingEmailCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Existing Email" + "\n");
        //invalid user account creation test (existing email)
        invalidUserAccountExistingEmailCreationTest(signUpPage);
    }

    //Test 002x -> invalid user account creation test (invalid password format)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Password Format")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Invalid_Singular_Input_Format")
    void invalidUserAccountInvalidPasswordCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Invalid Password Format" + "\n");
        //invalid user account creation test (invalid password format)
        invalidUserAccountInvalidPasswordCreationTest(signUpPage);
    }

    //Test 002y -> invalid user account creation test (invalid birthdate format)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid Birthdate (less than 18 y.o.)")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountInvalidBirthdateCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Invalid Birthdate(less than 18 y.o.)" + "\n");
        //invalid user account creation test (invalid birthdate)
        invalidUserAccountInvalidBirthdateCreationTest(signUpPage);
    }

    //too long singular input tests

    //Test 002z -> invalid user account creation test (too long first name)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long First Name")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountTooLongFirstNameCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Long First Name" + "\n");
        //invalid user account creation test (too long first name)
        invalidUserAccountTooLongFirstNameCreationTest(signUpPage);
    }

    //Test 002aa -> invalid user account creation test (too long last name)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long Last Name")
    @Tag("Invalid_Account_Creation_Test")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountTooLongLastNameCreationTest(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        //navigation to user sign-up page
        navigateToUserSignUpPageTest(homePage);
        //test title (for logging)
        System.out.println("Invalid User Account Creation Test - Too Long Last Name" + "\n");
        //invalid user account creation test (too long last name)
        invalidUserAccountTooLongLastNameCreationTest(signUpPage);
    }
}
