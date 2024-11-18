package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    //sign-in page web elements
    @FindBy(xpath = "//h3")
    private WebElement signInPageTitle;
    @FindBy(xpath = "//button[@aria-label='Sign in with Google']")
    private WebElement signInWithGoogleButton;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
    private WebElement viewPasswordButton;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@aria-label='Register your account']")
    private WebElement signUpLink;
    @FindBy(xpath = "//a[@aria-label='Forgot your Password?']")
    private WebElement forgotPasswordLink;

    public SignInPage(WebDriver driver) {super(driver);}

    //click 'Sign-up' link method
    public void clickSignUpLink(){signUpLink.click();}

    //sign-in page title getter
    public String getSignInPageTitle() {return signInPageTitle.getText();}

    //sign-in page web element assert methods
    public boolean isSignInPageTitleDisplayed() {return signInPageTitle.isDisplayed();}
    public boolean isSignInWithGoogleButtonDisplayed() {return signInWithGoogleButton.isDisplayed();}
    public boolean isEmailAddressInputDisplayed() {return emailAddressInputField.isDisplayed();}
    public boolean isPasswordInputDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isViewPasswordButtonDisplayed() {return viewPasswordButton.isDisplayed();}
    public boolean isSignInButtonDisplayed() {return signInButton.isDisplayed();}
    public boolean isSignUpLinkDisplayed() {return signUpLink.isDisplayed();}
    public boolean isForgotPasswordLinkDisplayed() {return forgotPasswordLink.isDisplayed();}
}
