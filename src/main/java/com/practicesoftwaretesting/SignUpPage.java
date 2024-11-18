package com.practicesoftwaretesting;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    //sign-up page web elements
    @FindBy(xpath = "//h3")
    private WebElement signUpPageTitle;
    //input form elements
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='dob']")
    private WebElement birthdateInputField;
    @FindBy(xpath = "//input[@id='address']")
    private WebElement addressInputField;
    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement postCodeInputField;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityInputField;
    @FindBy(xpath = "//input[@id='state']")
    private WebElement stateInputField;
    @FindBy(xpath = "//select[@id='country']")
    private WebElement countryDropdownMenu;
    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneInputField;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
    private WebElement passwordViewButton;
    @FindBy(xpath = "//div[@id='passwordHelp']")
    private WebElement passwordInputHint;
    @FindBy(xpath = "//div[@class='strength-labels']")
    private WebElement passwordStrengthBar;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement registerButton;

    public SignUpPage(WebDriver driver) {super(driver);}

    //sign-up page title getter
    public String getSignUpPageTitle(){return signUpPageTitle.getText();}
    //sign-up password hint getter
    public String getPasswordHint(){return passwordInputHint.getText();}
    //sign-up password strength bar getter
    public String getPasswordStrengthBarText(){return passwordStrengthBar.getText();}

    //sign-up page web element assert methods
    public boolean isSignUpPageTitleDisplayed(){return signUpPageTitle.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isBirthdateInputFieldDisplayed(){return birthdateInputField.isDisplayed();}
    public boolean isAddressInputFieldDisplayed(){return addressInputField.isDisplayed();}
    public boolean isPostCodeInputFieldDisplayed(){return postCodeInputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed(){return cityInputField.isDisplayed();}
    public boolean isStateInputFieldDisplayed(){return stateInputField.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed(){return countryDropdownMenu.isDisplayed();}
    public boolean isPhoneInputFieldDisplayed(){return phoneInputField.isDisplayed();}
    public boolean isEmailAddressInputFieldDisplayed(){return emailAddressInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isPasswordViewButtonDisplayed(){return passwordViewButton.isDisplayed();}
    public boolean isPasswordInputHintDisplayed(){return passwordInputHint.isDisplayed();}
    public boolean isPasswordStrengthBarDisplayed(){return passwordStrengthBar.isDisplayed();}
    public boolean isRegisterButtonDisplayed(){return registerButton.isDisplayed();}
}
