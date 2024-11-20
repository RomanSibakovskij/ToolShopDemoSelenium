package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    @FindBy(xpath = "//input[@data-test='login-submit']")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@aria-label='Register your account']")
    private WebElement signUpLink;
    @FindBy(xpath = "//a[@aria-label='Forgot your Password?']")
    private WebElement forgotPasswordLink;

    //valid login input data
    private String loginEmail;
    private String loginPassword;

    public SignInPage(WebDriver driver) {super(driver);}

    //valid user login input data getter
    public void validInputUserLoginDataGetter(SignUpPage signUpPage){
        loginEmail = signUpPage.getEmailAddress();
        loginPassword = signUpPage.getPassword();

        System.out.println("Valid data generated for invalid user account creation (too short first name): " + "\n");
        logger.info("Valid user email (too short last name): " + loginEmail);
        logger.info("Valid user password (too short last name): " + loginPassword);
        System.out.println("\n");
    }
    //valid user data input method -> valid user login email
    public void inputValidLoginEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.click();
        emailAddressInputField.sendKeys(loginEmail);
    }
    //valid user data input method -> valid user login password
    public void inputValidLoginPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(loginPassword);
    }

    //click 'Sign-In' button method
    public void clickSignInButton(){signInButton.click();}


    //click 'Sign-up' link method
    public void clickSignUpLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1800));
        wait.until(ExpectedConditions.elementToBeClickable(signUpLink));
        signUpLink.click();
    }

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
