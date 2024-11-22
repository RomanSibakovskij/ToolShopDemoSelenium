package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class ShoppingCartPage extends BasePage{

    //shopping cart page web elements
    @FindBy(xpath = "//ul[@class='steps-4 steps-indicator']")
    private WebElement stepsIndicator;
    //product table list element
    @FindBy(xpath = "//span[@class='product-title']")
    private List <WebElement> productNameElements;
    @FindBy(xpath = "//input[@class='form-control quantity']")
    private List <WebElement> productQuantityInputFieldElements;
    @FindBy(xpath = "//span[@data-test='product-price']")
    private List <WebElement> productUnitPriceElements;
    @FindBy(xpath = "//span[@data-test='line-price']")
    private List <WebElement> productTotalPriceElements;
    private List <WebElement> productRemoveButtonElements = driver.findElements(By.xpath("//a[@class='btn btn-danger']"));
    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement proceedToCheckoutButton;

    public ShoppingCartPage(WebDriver driver) {super(driver);}

    //shopping cart product data getters
    public List<String> getProductName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductQuantity() {
        List<String> productQuantity = new ArrayList<>();
        for (WebElement element : productQuantityInputFieldElements) {
            productQuantity.add(element.getAttribute("value"));
        }
        return productQuantity;
    }
    public List<String> getProductUnitPrice() {
        List<String> productUnitPrice = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            productUnitPrice.add(element.getText());
        }
        return productUnitPrice;
    }
    public List<String> getProductTotalPrice() {
        List<String> productTotalPrice = new ArrayList<>();
        for (WebElement element : productTotalPriceElements) {
            productTotalPrice.add(element.getText());
        }
        return productTotalPrice;
    }

    //shopping cart page web element assert methods
    public boolean isStepsIndicatorDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stepsIndicator));
        return stepsIndicator.isDisplayed();
    }
    public boolean isProceedToCheckoutButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(proceedToCheckoutButton));
        return proceedToCheckoutButton.isDisplayed();
    }

    public boolean isAddedToCartProductNameDisplayed() {
        for (WebElement element : productNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAddedToCartProductQuantityInputFieldDisplayed() {
        for (WebElement element : productQuantityInputFieldElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAddedToCartProductUnitPriceDisplayed() {
        for (WebElement element : productUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAddedToCartProductTotalPriceDisplayed() {
        for (WebElement element : productTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAddedToCartProductRemoveButtonDisplayed() {
        for (WebElement element : productRemoveButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
