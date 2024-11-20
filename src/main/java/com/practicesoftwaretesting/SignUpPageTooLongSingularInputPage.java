package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SignUpPageTooLongSingularInputPage extends BasePage{

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
    @FindBy(xpath = "//div[@class='alert alert-danger mt-3']")
    private WebElement emailInputError;
    //invalid input error message element
    @FindBy(xpath = "//div[@data-test='register-error']")
    private WebElement tooLongSingularInputError;

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

    //invalid singular input data(too long)
    private String tooLongFirstName;
    private String tooLongLastName;
    private String tooLongAddress;
    private String tooLongPostCode;
    private String tooLongCity;
    private String tooLongState;
    private String tooLongPhone;
    private String tooLongEmail;
    private String tooLongPassword;

    public SignUpPageTooLongSingularInputPage(WebDriver driver) {super(driver);}

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

    //too long singular input
    //invalid input data getter (too long first name (41 chars))
    public void invalidInputUserDataGetterTooLongFirstName(){
        tooLongFirstName = "ASsfdfgrererwewJhdsWsdsadsadsfdsfgfghfgfg";
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long first name): " + "\n");
        logger.info("Too long first name: " + tooLongFirstName);
        logger.info("Valid user last name (too long first name): " + lastName);
        logger.info("Valid user address (too long first name): " + address);
        logger.info("Valid user post code (too long first name): " + postCode);
        logger.info("Valid user city (too long first name): " + city);
        logger.info("Valid user state (too long first name): " + state);
        logger.info("Valid user phone number (too long first name): " + phone);
        logger.info("Valid user email (too long first name): " + email);
        logger.info("Valid user password (too long first name): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long first name
    public void inputTooLongFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooLongFirstName);
    }
    //invalid input data getter (too long last name (21 chars))
    public void invalidInputUserDataGetterTooLongLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "ASsfdfgrererwewJhdsWs";
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long last name): " + "\n");
        logger.info("Valid user first name (too long last name): " + firstName);
        logger.info("Too long last name: " + tooLongLastName);
        logger.info("Valid user address (too long last name): " + address);
        logger.info("Valid user post code (too long last name): " + postCode);
        logger.info("Valid user city (too long last name): " + city);
        logger.info("Valid user state (too long last name): " + state);
        logger.info("Valid user phone number (too long last name): " + phone);
        logger.info("Valid user email (too long last name): " + email);
        logger.info("Valid user password (too long last name): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long first name
    public void inputTooLongLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooLongLastName);
    }
    //invalid input data getter (too long address (71 chars))
    public void invalidInputUserDataGetterTooLongAddress(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        tooLongAddress = TestDataGenerator.generateRandomAddress(63);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long address): " + "\n");
        logger.info("Valid user first name (too long address): " + firstName);
        logger.info("Valid user last name (too long address): " + lastName);
        logger.info("Too long user address : " + tooLongAddress);
        logger.info("Valid user post code (too long address): " + postCode);
        logger.info("Valid user city (too long address): " + city);
        logger.info("Valid user state (too long address): " + state);
        logger.info("Valid user phone number (too long address): " + phone);
        logger.info("Valid user email (too long address): " + email);
        logger.info("Valid user password (too long address): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long address
    public void inputTooLongAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys(tooLongAddress);
    }
    //invalid input data getter (too long post code (11 chars))
    public void invalidInputUserDataGetterTooLongPostCode(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(6);
        tooLongPostCode = "91432317687";
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long post code): " + "\n");
        logger.info("Valid user first name (too long post code): " + firstName);
        logger.info("Valid user last name (too long post code): " + lastName);
        logger.info("Valid user address (too long post code): " + address);
        logger.info("Too long user post code: " + tooLongPostCode);
        logger.info("Valid user city (too long post code): " + city);
        logger.info("Valid user state (too long post code): " + state);
        logger.info("Valid user phone number (too long post code): " + phone);
        logger.info("Valid user email (too long post code): " + email);
        logger.info("Valid user password (too long post code): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long user post code
    public void inputTooLongPostCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(postCodeInputField));
        postCodeInputField.sendKeys(tooLongPostCode);
    }
    //invalid input data getter (too long user city (41 chars))
    public void invalidInputUserDataGetterTooLongCity(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(6);
        postCode = TestDataGenerator.getRandomPostalCode();
        tooLongCity = "rRYVTDsuqXdpBVIQWfMbeSZcuwlujHasdasdsaqeq";
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long user city): " + "\n");
        logger.info("Valid user first name (too long user city): " + firstName);
        logger.info("Valid user last name (too long user city): " + lastName);
        logger.info("Valid user address (too long user city): " + address);
        logger.info("Valid user post code (too long user city): " + postCode);
        logger.info("Too long user city: " + tooLongCity);
        logger.info("Valid user state (too long user city): " + state);
        logger.info("Valid user phone number (too long user city): " + phone);
        logger.info("Valid user email (too long user city): " + email);
        logger.info("Valid user password (too long user city): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long user city
    public void inputTooLongCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooLongCity);
    }
    //invalid input data getter (too long user state (41 chars))
    public void invalidInputUserDataGetterTooLongState(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(6);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        tooLongState = "rRYVTDsuqXdpBVIQWfMbeSZcuwlujHasdasdsaqeq";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long user state): " + "\n");
        logger.info("Valid user first name (too long user state): " + firstName);
        logger.info("Valid user last name (too long user state): " + lastName);
        logger.info("Valid user address (too long user state): " + address);
        logger.info("Valid user post code (too long user state): " + postCode);
        logger.info("Valid user city (too long user state): " + city);
        logger.info("Too long user state: " + tooLongState);
        logger.info("Valid user phone number (too long user state): " + phone);
        logger.info("Valid user email (too long user state): " + email);
        logger.info("Valid user password (too long user state): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long user state
    public void inputTooLongStateIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(stateInputField));
        stateInputField.sendKeys(tooLongState);
    }
    //invalid input data getter (too long user phone (25 chars))
    public void invalidInputUserDataGetterTooLongPhone(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(6);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        tooLongPhone = TestDataGenerator.generatePhoneNumber(25);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long user phone): " + "\n");
        logger.info("Valid user first name (too long user phone): " + firstName);
        logger.info("Valid user last name (too long user phone): " + lastName);
        logger.info("Valid user address (too long user phone): " + address);
        logger.info("Valid user post code (too long user phone): " + postCode);
        logger.info("Valid user city (too long user phone): " + city);
        logger.info("Valid user state (too long user phone): " + state);
        logger.info("Too long user phone number : " + tooLongPhone);
        logger.info("Valid user email (too long user phone): " + email);
        logger.info("Valid user password (too long user phone): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long user phone
    public void inputTooLongPhoneIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(phoneInputField));
        phoneInputField.sendKeys(tooLongPhone);
    }
    //invalid input data getter (too long user email)
    public void invalidInputUserDataGetterTooLongEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(6);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        tooLongEmail = TestDataGenerator.generateRandomEmailAddress(65);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too long user email): " + "\n");
        logger.info("Valid user first name (too long user email): " + firstName);
        logger.info("Valid user last name (too long user email): " + lastName);
        logger.info("Valid user address (too long user email): " + address);
        logger.info("Valid user post code (too long user email): " + postCode);
        logger.info("Valid user city (too long user email): " + city);
        logger.info("Valid user state (too long user email): " + state);
        logger.info("Valid user phone number (too long user email): " + phone);
        logger.info("Too long user email: " + tooLongEmail);
        logger.info("Valid user password (too long user email): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too long user email
    public void inputTooLongEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(tooLongEmail);
    }

    //password getter methods
    public String getPasswordInput(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", passwordInputField); //to make the error message visible
        return passwordInputField.getAttribute("value");
    }
    public String getPassword(){return password;}
    // email error message getter
    public String getEmailErrorMessage(){return emailInputError.getText();}
    //pre-existing email error message getter
    public String getTooLongSingularInputErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1900));
        wait.until(ExpectedConditions.visibilityOf(tooLongSingularInputError));
        return tooLongSingularInputError.getText();
    }
}
