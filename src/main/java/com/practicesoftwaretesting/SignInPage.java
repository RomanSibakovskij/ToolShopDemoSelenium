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
    @FindBy(xpath = "//a[@data-test='register-link']")
    private WebElement signUpLinkShoppingCartForm;
    @FindBy(xpath = "//a[@aria-label='Forgot your Password?']")
    private WebElement forgotPasswordLink;
    //missing input error message
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement missingInputErrorBox;

    //valid login input data
    private String loginEmail;
    private String loginPassword;

    //no singular input
    private String noLoginEmail;
    private String noLoginPassword;

    //invalid singular input
    private String invalidLoginEmail;
    private String invalidLoginEmailFormat;
    private String invalidLoginPassword;

    public SignInPage(WebDriver driver) {super(driver);}

    //valid user login input data getter
    public void validInputUserLoginDataGetter(SignUpPage signUpPage){
        loginEmail = signUpPage.getEmailAddress();
        loginPassword = signUpPage.getPassword();

        System.out.println("Valid data generated for valid user login: " + "\n");
        logger.info("Valid login email: " + loginEmail);
        logger.info("Valid login password: " + loginPassword);
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

    //no singular input
    //invalid user login input data getter (no email)
    public void invalidInputUserLoginDataGetterNoEmail(SignUpPage signUpPage){
        noLoginEmail = "";
        loginPassword = signUpPage.getPassword();

        System.out.println("Valid data generated for invalid user login (no login email): " + "\n");
        logger.info("No login email: " + noLoginEmail);
        logger.info("Valid login password (no login email): " + loginPassword);
        System.out.println("\n");
    }
    //invalid user data input method -> no user login email
    public void inputNoLoginEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.click();
        emailAddressInputField.sendKeys(noLoginEmail);
    }
    //invalid user login input data getter (no password)
    public void invalidInputUserLoginDataGetterNoPassword(SignUpPage signUpPage){
        loginEmail = signUpPage.getEmailAddress();
        noLoginPassword = "";

        System.out.println("Valid data generated for invalid user login (no login password): " + "\n");
        logger.info("Valid login email (no login password): " + loginEmail);
        logger.info("No login password: " + noLoginPassword);
        System.out.println("\n");
    }
    //invalid user data input method -> no user login password
    public void inputNoLoginPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(noLoginPassword);
    }

    //invalid user login input data getter (invalid login email)
    public void invalidInputUserLoginDataGetterInvalidEmail(SignUpPage signUpPage){
        invalidLoginEmail = "b5@fakemail.com";
        loginPassword = signUpPage.getPassword();

        System.out.println("Valid data generated for invalid user login (invalid login email): " + "\n");
        logger.info("Invalid login email: " + invalidLoginEmail);
        logger.info("Valid login password (invalid login email): " + loginPassword);
        System.out.println("\n");
    }
    //invalid user data input method -> invalid user login email
    public void inputInvalidLoginEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.click();
        emailAddressInputField.sendKeys(invalidLoginEmail);
    }
    //invalid user login input data getter (invalid login email format)
    public void invalidInputUserLoginDataGetterInvalidEmailFormat(SignUpPage signUpPage){
        invalidLoginEmailFormat = "234553mail.com";
        loginPassword = signUpPage.getPassword();

        System.out.println("Valid data generated for invalid user login (invalid login email format): " + "\n");
        logger.info("Invalid login email format: " + invalidLoginEmailFormat);
        logger.info("Valid login password (invalid login email format): " + loginPassword);
        System.out.println("\n");
    }
    //invalid user data input method -> invalid user login email
    public void inputInvalidFormatLoginEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.click();
        emailAddressInputField.sendKeys(invalidLoginEmailFormat);
    }

    //invalid user login input data getter (invalid password)
    public void invalidInputUserLoginDataGetterInvalidPassword(SignUpPage signUpPage){
        loginEmail = signUpPage.getEmailAddress();
        invalidLoginPassword = "Scvfdfdf$$3443@";

        System.out.println("Valid data generated for invalid user login (invalid login password): " + "\n");
        logger.info("Valid login email (invalid login password): " + loginEmail);
        logger.info("Invalid login password: " + invalidLoginPassword);
        System.out.println("\n");
    }
    //invalid user data input method -> invalid user login password
    public void inputInvalidLoginPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(invalidLoginPassword);
    }


    //click 'Sign-In' button method
    public void clickSignInButton(){signInButton.click();}

    //click 'Password view' button method
    public void clickPasswordViewButton() {viewPasswordButton.click();}

    //click 'Sign-up' link method
    public void clickSignUpLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1800));
        wait.until(ExpectedConditions.elementToBeClickable(signUpLink));
        signUpLink.click();
    }
    //click 'Sign-up' link method(shopping cart form)
    public void clickSignUpShoppingCartLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1800));
        wait.until(ExpectedConditions.elementToBeClickable(signUpLinkShoppingCartForm));
        signUpLinkShoppingCartForm.click();
    }

    //sign-in page title getter
    public String getSignInPageTitle() {return signInPageTitle.getText();}

    //missing input error message getter
    public String getMissingInputError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1900));
        wait.until(ExpectedConditions.visibilityOf(missingInputErrorBox));
        return missingInputErrorBox.getText();
    }
    //password getter methods
    public String getPasswordInput(){return passwordInputField.getAttribute("value");}
    public String getPassword(){return loginPassword;}

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
