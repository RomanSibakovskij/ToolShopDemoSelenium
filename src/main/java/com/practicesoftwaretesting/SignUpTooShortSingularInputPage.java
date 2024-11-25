package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SignUpTooShortSingularInputPage extends BasePage{


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

    //invalid singular input (too short)
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortAddress;
    private String tooShortPostCode;
    private String tooShortCity;
    private String tooShortState;
    private String tooShortPhone;
    private String tooShortEmail;
    private String tooShortPassword;

    public SignUpTooShortSingularInputPage(WebDriver driver) {super(driver);}

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

    //no singular input
    //invalid input data getter (no first name)
    public void invalidInputUserDataGetterTooShortFirstName(){
        tooShortFirstName = "A";
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short first name): " + "\n");
        logger.info("Too short first name: " + tooShortFirstName);
        logger.info("Valid user last name (too short first name): " + lastName);
        logger.info("Valid user address (too short first name): " + address);
        logger.info("Valid user post code (too short first name): " + postCode);
        logger.info("Valid user city (too short first name): " + city);
        logger.info("Valid user state (too short first name): " + state);
        logger.info("Valid user phone number (too short first name): " + phone);
        logger.info("Valid user email (too short first name): " + email);
        logger.info("Valid user password (too short first name): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short first name
    public void inputTooShortFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooShortFirstName);
    }

    //invalid input data getter (no last name)
    public void invalidInputUserDataGetterTooShortLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "L";
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short first name): " + "\n");
        logger.info("Valid user first name (too short last name): " + firstName);
        logger.info("Too short last name: " + tooShortLastName);
        logger.info("Valid user address (too short last name): " + address);
        logger.info("Valid user post code (too short last name): " + postCode);
        logger.info("Valid user city (too short last name): " + city);
        logger.info("Valid user state (too short last name): " + state);
        logger.info("Valid user phone number (too short last name): " + phone);
        logger.info("Valid user email (too short last name): " + email);
        logger.info("Valid user password (too short last name): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short last name
    public void inputTooShortLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooShortLastName);
    }

    //invalid input data getter (too short address)
    public void invalidInputUserDataGetterTooShortAddress(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        tooShortAddress = "K";
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short user address): " + "\n");
        logger.info("Valid user first name (too short user address): " + firstName);
        logger.info("Valid user last name (too short user address): " + lastName);
        logger.info("Too short user address: " + tooShortAddress);
        logger.info("Valid user post code (too short user address): " + postCode);
        logger.info("Valid user city (too short user address): " + city);
        logger.info("Valid user state (too short user address): " + state);
        logger.info("Valid user phone number (too short user address): " + phone);
        logger.info("Valid user email (too short user address): " + email);
        logger.info("Valid user password (too short user address): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user address
    public void inputTooShortAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys(tooShortAddress);
    }

    //invalid input data getter (too short post code)
    public void invalidInputUserDataGetterTooShortPostCode(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        tooShortPostCode = "1";
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short user post code): " + "\n");
        logger.info("Valid user first name (too short user post code): " + firstName);
        logger.info("Valid user last name (too short user post code): " + lastName);
        logger.info("Valid user address (too short user post code): " + address);
        logger.info("Too short post code: " + tooShortPostCode);
        logger.info("Valid user city (too short user post code): " + city);
        logger.info("Valid user state (too short user post code): " + state);
        logger.info("Valid user phone number (too short user post code): " + phone);
        logger.info("Valid user email (too short user post code): " + email);
        logger.info("Valid user password (too short user post code): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user post code
    public void inputTooShortPostCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(postCodeInputField));
        postCodeInputField.sendKeys(tooShortPostCode);
    }

    //invalid input data getter (too short city)
    public void invalidInputUserDataGetterTooShortCity(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        tooShortCity = "Y";
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short city): " + "\n");
        logger.info("Valid user first name (too short city): " + firstName);
        logger.info("Valid user last name (too short city): " + lastName);
        logger.info("Valid user address (too short city): " + address);
        logger.info("Valid user post code: " + postCode);
        logger.info("Too short user city: " + tooShortCity);
        logger.info("Valid user state (too short city): " + state);
        logger.info("Valid user phone number (too short city): " + phone);
        logger.info("Valid user email (too short city): " + email);
        logger.info("Valid user password (too short city): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user city
    public void inputTooShortCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooShortCity);
    }

    //invalid input data getter (too short user state)
    public void invalidInputUserDataGetterTooShortState(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        tooShortState = "X";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short state): " + "\n");
        logger.info("Valid user first name (too short state): " + firstName);
        logger.info("Valid user last name (too short state): " + lastName);
        logger.info("Valid user address (too short state): " + address);
        logger.info("Valid user post code (too short state): " + postCode);
        logger.info("Valid user city (too short state): " + city);
        logger.info("Too short user state: " + tooShortState);
        logger.info("Valid user phone number (too short state): " + phone);
        logger.info("Valid user email (too short state): " + email);
        logger.info("Valid user password (too short state): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user state
    public void inputTooShortStateIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(stateInputField));
        stateInputField.sendKeys(tooShortState);
    }

    //invalid input data getter (too short user phone number)
    public void invalidInputUserDataGetterTooShortPhone(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        tooShortPhone = "8";
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short phone): " + "\n");
        logger.info("Valid user first name (too short phone): " + firstName);
        logger.info("Valid user last name (too short phone): " + lastName);
        logger.info("Valid user address (too short phone): " + address);
        logger.info("Valid user post code (too short phone): " + postCode);
        logger.info("Valid user city (too short phone): " + city);
        logger.info("Valid user state (too short phone): " + state);
        logger.info("Too short phone number: " + tooShortPhone);
        logger.info("Valid user email (too short phone): " + email);
        logger.info("Valid user password (too short phone): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user phone number
    public void inputTooShortPhoneIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(phoneInputField));
        phoneInputField.sendKeys(tooShortPhone);
    }

    //invalid input data getter (too short user email)
    public void invalidInputUserDataGetterTooShortEmail(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        tooShortEmail = TestDataGenerator.generateRandomEmailAddress(1);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for invalid user account creation (too short email): " + "\n");
        logger.info("Valid user first name (too short email): " + firstName);
        logger.info("Valid user last name (too short email): " + lastName);
        logger.info("Valid user address (too short email): " + address);
        logger.info("Valid user post code (too short email): " + postCode);
        logger.info("Valid user city (too short email): " + city);
        logger.info("Valid user state (too short email): " + state);
        logger.info("Valid phone number (too short email): " + phone);
        logger.info("Too short email: " + tooShortEmail);
        logger.info("Valid user password (too short email): " + password);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user email
    public void inputTooShortEmailIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(tooShortEmail);
    }
    //invalid input data getter (too short password)
    public void invalidInputUserDataGetterTooShortPassword(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(7);
        tooShortPassword = "S";

        System.out.println("Valid data generated for invalid user account creation (too short password): " + "\n");
        logger.info("Valid user first name (too short password): " + firstName);
        logger.info("Valid user last name (too short password): " + lastName);
        logger.info("Valid user address (too short password): " + address);
        logger.info("Valid user post code (too short password): " + postCode);
        logger.info("Valid user city (too short password): " + city);
        logger.info("Valid user state (too short password): " + state);
        logger.info("Valid phone number (too short password): " + phone);
        logger.info("Valid user email (too short password): " + email);
        logger.info("Too short user password: " + tooShortPassword);
        System.out.println("\n");
    }
    //invalid user data input method -> too short user password
    public void inputTooShortPasswordIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(tooShortPassword);
    }

    //password getter methods
    public String getPasswordInput(){return passwordInputField.getAttribute("value");}
    public String getPassword(){return password;}

}
