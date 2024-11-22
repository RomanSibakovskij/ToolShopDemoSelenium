package com.practicesoftwaretesting;

import org.junit.jupiter.api.*;

public class CheckoutProductPageTest extends TestMethods{

    //Test 005 -> add bolt cutters product to cart test (as a registered user) // (due to fatal bug (user logout after 20-30 seconds with inability to log back in with valid credentials), further testng is aborted here until the webpage is fixed)
    @Test
    @DisplayName("Add Bolt Cutters To Cart Test")
    @Tag("Add_Singular_Product_To_Cart_Test")
    void addBoltCuttersToShoppingCartTest(){
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
        System.out.println("Add Bolt Cutters To Cart Test" + "\n");
        //add 'Bolt cutters' to cart test
        addBoltCuttersToCartTest();
    }
}
