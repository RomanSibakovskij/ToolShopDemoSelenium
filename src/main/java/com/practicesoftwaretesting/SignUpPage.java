package com.practicesoftwaretesting;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

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
    //United States option
    @FindBy(xpath = "//option[@value='US']")
    private WebElement usCountryOption;
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

    //no singular input
    private String noFirstName;
    private String noLastName;
    private String noBirthdate;
    private String noAddress;
    private String noPostCode;
    private String noCity;
    private String noState;

    public SignUpPage(WebDriver driver) {super(driver);}

    //valid input data getter
    public void validInputUserDataGetter(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid data generated for user account creation: " + "\n");
        logger.info("Valid user first name: " + firstName);
        logger.info("Valid user last name: " + lastName);
        logger.info("Valid user address: " + address);
        logger.info("Valid user post code: " + postCode);
        logger.info("Valid user city: " + city);
        logger.info("Valid user state: " + state);
        logger.info("Valid user phone number: " + phone);
        logger.info("Valid user email: " + email);
        logger.info("Valid user password: " + password);
        System.out.println("\n");
    }

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

    //country dropdown menu click method
    public void clickCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(650));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }

    //click 'Register' button method
    public void clickRegisterButton(){registerButton.click();}

    //select 'United States' option method
    public void selectUnitedStatesOption(){usCountryOption.click();}

    //invalid test data getters and input methods

    //invalid input data getter (no first name)
    public void invalidInputUserDataGetterNoFirstName(){
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid data generated for user account creation (no first name): " + "\n");
        logger.info("No first name (no first name): " + noFirstName);
        logger.info("Valid user last name (no first name): " + lastName);
        logger.info("Valid user address (no first name): " + address);
        logger.info("Valid user post code (no first name): " + postCode);
        logger.info("Valid user city (no first name): " + city);
        logger.info("Valid user state (no first name): " + state);
        logger.info("Valid user phone number (no first name): " + phone);
        logger.info("Valid user email (no first name): " + email);
        logger.info("Valid user password (no first name): " + password);
        System.out.println("\n");
    }

    //invalid user data input method -> no first name
    public void inputNoFirstNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noFirstName);
    }

    //invalid input data getter (no last name)
    public void invalidInputUserDataGetterNoLastName(){
        firstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid data generated for user account creation (no last name): " + "\n");
        logger.info("Valid user first name (no first name): " + firstName);
        logger.info("No last name (no last name): " + noLastName);
        logger.info("Valid user address (no last name): " + address);
        logger.info("Valid user post code (no last name): " + postCode);
        logger.info("Valid user city (no last name): " + city);
        logger.info("Valid user state (no last name): " + state);
        logger.info("Valid user phone number (no last name): " + phone);
        logger.info("Valid user email (no last name): " + email);
        logger.info("Valid user password (no last name): " + password);
        System.out.println("\n");
    }
    public void inputNoLastNameIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noLastName);
    }

    //invalid input data getter (no birthdate)
    public void invalidInputUserDataGetterNoBirthdate(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noBirthdate = "";
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid data generated for user account creation (no birthdate): " + "\n");
        logger.info("Valid user first name (no birthdate): " + firstName);
        logger.info("Valid user last name (no birthdate): " + lastName);
        logger.info("Valid user address (no birthdate): " + address);
        logger.info("Valid user post code (no birthdate): " + postCode);
        logger.info("Valid user city (no birthdate): " + city);
        logger.info("Valid user state (no birthdate): " + state);
        logger.info("Valid user phone number (no birthdate): " + phone);
        logger.info("Valid user email (no birthdate): " + email);
        logger.info("Valid user password (no birthdate): " + password);
        System.out.println("\n");
    }
    public void inputNoBirthdateIntoInputField(){
        WebElement birthdateInputField = driver.findElement(By.id("dob"));
        birthdateInputField.sendKeys(noBirthdate);
    }

    //invalid input data getter (no user address)
    public void invalidInputUserDataGetterNoAddress(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        noAddress = "";
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid data generated for user account creation (no user address): " + "\n");
        logger.info("Valid user first name (no user address): " + firstName);
        logger.info("Valid user last name (no user address): " + lastName);
        logger.info("No user address (no user address): " + noAddress);
        logger.info("Valid user post code (no user address): " + postCode);
        logger.info("Valid user city (no user address): " + city);
        logger.info("Valid user state (no user address): " + state);
        logger.info("Valid user phone number (no user address): " + phone);
        logger.info("Valid user email (no user address): " + email);
        logger.info("Valid user password (no user address): " + password);
        System.out.println("\n");
    }
    public void inputNoAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys(noAddress);
    }

    //invalid input data getter (no user post code)
    public void invalidInputUserDataGetterNoPostCode(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        noPostCode = "";
        city = TestDataGenerator.getRandomCity();
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid data generated for user account creation (no user postcode): " + "\n");
        logger.info("Valid user first name (no user postcode): " + firstName);
        logger.info("Valid user last name (no user postcode): " + lastName);
        logger.info("Valid user address (no user postcode): " + address);
        logger.info("No user post code (no user postcode): " + noPostCode);
        logger.info("Valid user city (no user postcode): " + city);
        logger.info("Valid user state (no user postcode): " + state);
        logger.info("Valid user phone number (no user postcode): " + phone);
        logger.info("Valid user email (no user postcode): " + email);
        logger.info("Valid user password (no user postcode): " + password);
        System.out.println("\n");
    }
    public void inputNoPostCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(postCodeInputField));
        postCodeInputField.sendKeys(noPostCode);
    }

    //invalid input data getter (no user city)
    public void invalidInputUserDataGetterNoCity(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        noCity = "";
        state = "Illinois";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid data generated for user account creation (no user city): " + "\n");
        logger.info("Valid user first name (no user city): " + firstName);
        logger.info("Valid user last name (no user city): " + lastName);
        logger.info("Valid user address (no user city): " + address);
        logger.info("Valid user post code (no user city): " + postCode);
        logger.info("No user city (no user city): " + noCity);
        logger.info("Valid user state (no user city): " + state);
        logger.info("Valid user phone number (no user city): " + phone);
        logger.info("Valid user email (no user city): " + email);
        logger.info("Valid user password (no user city): " + password);
        System.out.println("\n");
    }
    public void inputNoCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(noCity);
    }

    //invalid input data getter (no user state)
    public void invalidInputUserDataGetterNoState(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        birthdate = TestDataGenerator.generateBirthdate();
        address = TestDataGenerator.generateRandomAddress(7);
        postCode = TestDataGenerator.getRandomPostalCode();
        city = TestDataGenerator.getRandomCity();
        noState = "";
        phone = TestDataGenerator.generatePhoneNumber(5);
        email = TestDataGenerator.generateRandomEmailAddress(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid data generated for user account creation (no user state): " + "\n");
        logger.info("Valid user first name (no user state): " + firstName);
        logger.info("Valid user last name (no user state): " + lastName);
        logger.info("Valid user address (no user state): " + address);
        logger.info("Valid user post code (no user state): " + postCode);
        logger.info("Valid user city (no user state): " + city);
        logger.info("No user state (no user state): " + noState);
        logger.info("Valid user phone number (no user state): " + phone);
        logger.info("Valid user email (no user state): " + email);
        logger.info("Valid user password (no user state): " + password);
        System.out.println("\n");
    }
    public void inputNoStateIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(575));
        wait.until(ExpectedConditions.visibilityOf(stateInputField));
        stateInputField.sendKeys(noState);
    }

    //sign-up page title getter
    public String getSignUpPageTitle(){return signUpPageTitle.getText();}
    //sign-up password hint getter
    public String getPasswordHint(){return passwordInputHint.getText();}
    //sign-up password strength bar getter
    public String getPasswordStrengthBarText(){return passwordStrengthBar.getText();}

    //invalid input error message getters
    public String getInvalidUserInputErrorMessage(){return invalidUserInputError.getText();}
    public String getInvalidInputErrorMessage(){return invalidInputError.getText();}

    //email address getter(for login)
    public String getEmailAddress(){return email;}
    //password getter(for login)
    public String getPassword(){return password;}

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
