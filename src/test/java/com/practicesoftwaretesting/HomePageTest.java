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
}
