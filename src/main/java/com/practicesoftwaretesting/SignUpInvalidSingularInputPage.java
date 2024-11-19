package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpInvalidSingularInputPage extends BasePage{

    //input form elements
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//input[@id='address']")
    private WebElement addressInputField;
    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement postCodeInputField;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityInputField;
    @FindBy(xpath = "//input[@id='state']")
    private WebElement stateInputField;
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
    //invalid input error message elements
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement invalidUserInputError;
    @FindBy(xpath = "//div[@class='alert alert-danger mt-3']")
    private WebElement invalidInputError;

    //valid input data
    private String firstName;
    private String lastName;
    private String birthdate;
    private String address;
    private int postCode;
    private String city;
    private String state;
    private String phone;
    private String email;
    private String password;

    //invalid singular input (by format)
    private String invalidPhoneFormat;
    private String invalidEmailFormat;
    private String existingEmail;
    private String invalidPasswordFormat;

    public SignUpInvalidSingularInputPage(WebDriver driver) {super(driver);}

    //click 'Password view' button method
    public void clickPasswordViewButton() {passwordViewButton.click();}

    //user data input methods
    public void inputFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(firstName);
    }
    public void inputLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(lastName);
    }
    //since the input field is in 'shadow-root' generated by browser(user-agent) the method is different from common input field methods
    public void inputBirthdateIntoInputField(){
        WebElement birthdateInputField = driver.findElement(By.id("dob"));
        birthdateInputField.sendKeys(birthdate);
    }
    public void inputAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys(address);
    }
    public void inputPostCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(postCodeInputField));
        postCodeInputField.sendKeys(String.valueOf(postCode));
    }
    public void inputCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
    }
    public void inputStateIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(stateInputField));
        stateInputField.sendKeys(state);
    }
    public void inputPhoneNumberIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(phoneInputField));
        phoneInputField.sendKeys(phone);
    }
    public void inputEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(email);
    }
    public void inputPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    //invalid input data getter (too short user phone number)
    public void invalidInputUserDataGetterInvalidPhoneFormat(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        invalidPhoneFormat = "dffsdfsdf";
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (invalid phone number format): " + "\n");
        logger.info("Valid user first name (invalid phone number format): " + firstName);
        logger.info("Valid user last name (invalid phone number format): " + lastName);
        logger.info("Valid user address (invalid phone number format): " + address);
        logger.info("Valid user post code (invalid phone number format): " + postCode);
        logger.info("Valid user city (invalid phone number format): " + city);
        logger.info("Valid user state (invalid phone number format): " + state);
        logger.info("Invalid phone number: " + invalidPhoneFormat);
        logger.info("Valid user email (invalid phone number format): " + email);
        logger.info("Valid user password (invalid phone number format): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user phone number
    public void inputInvalidPhoneFormatIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(phoneInputField));
        phoneInputField.sendKeys(invalidPhoneFormat);
    }

    //email getter(for existing email scenario)
    public String getEmail(){return email;}
    //password getter methods
    public String getPasswordInput(){return passwordInputField.getAttribute("value");}
    public String getPassword(){return password;}

}
