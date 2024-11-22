package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SingleProductPage extends BasePage{

    //single product page web elements
    @FindBy(xpath = "//a[@aria-label='cart']")
    private WebElement shoppingCartIconButton;
    @FindBy(xpath = "//img[@class='figure-img img-fluid']")
    private WebElement productImage;
    @FindBy(xpath = "//h1[@data-test='product-name']")
    private WebElement productName;
    @FindBy(xpath = "//span[@aria-label='category']")
    private WebElement productCategory;
    @FindBy(xpath = "//span[@aria-label='brand']")
    private WebElement productBrandName;
    @FindBy(xpath = "//span[@aria-label='unit-price']")
    private WebElement productUnitPrice;
    @FindBy(xpath = "//p[@id='description']")
    private WebElement productDescription;
    @FindBy(xpath = "//input[@id='quantity-input']")
    private WebElement productQuantityInputField;
    @FindBy(xpath = "//button[@id='btn-increase-quantity']")
    private WebElement productAddQuantityButton;
    @FindBy(xpath = "//button[@id='btn-decrease-quantity']")
    private WebElement productRemoveQuantityButton;
    @FindBy(xpath = "//button[@id='btn-add-to-cart']")
    private WebElement productAddToCartButton;
    @FindBy(xpath = "//button[@id='btn-add-to-favorites']")
    private WebElement productAddToFavoritesButton;
    //related products list elements
    private List<WebElement> relatedProductsCardElements = driver.findElements(By.xpath("//a[@class='card']"));
    @FindBy(xpath = "//img[@class='card-img-top']")
    private List<WebElement> relatedProductsCardImageElements;
    @FindBy(xpath = "//h5[@class='card-title']")
    private List<WebElement> relatedProductsNameElements;
    @FindBy(xpath = "//a[.='More information']")
    private List<WebElement> relatedProductsMoreInfoLinkElements;

    public SingleProductPage(WebDriver driver) {super(driver);}

    //click 'Add quantity' button method
    public void clickAddQuantityButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(productAddQuantityButton));
        productAddQuantityButton.click();
    }
    //click 'Remove quantity' button method
    public void clickRemoveQuantityButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(productRemoveQuantityButton));
        productRemoveQuantityButton.click();
    }

    //click 'Add to cart' button method
    public void clickAddToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(productAddToCartButton));
        productAddToCartButton.click();
    }

    //click shopping cart icon button method
    public void clickShoppingCartIconButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartIconButton));
        shoppingCartIconButton.click();
    }

    //single product name getter
    public String getProductName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productName));
        return productName.getText();
    }
    //single product category getter
    public String getProductCategory() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productCategory));
        return productCategory.getText();
    }
    //single product brand name getter
    public String getProductBrandName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productBrandName));
        return productBrandName.getText();
    }

    //single product page web element assert methods
    public boolean isProductImageDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productImage));
        return productImage.isDisplayed();}
    public boolean isProductNameDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productName));
        return productName.isDisplayed();
    }
    public boolean isProductCategoryDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productCategory));
        return productCategory.isDisplayed();
    }
    public boolean isProductBrandNameDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productBrandName));
        return productBrandName.isDisplayed();
    }
    public boolean isProductUnitPriceDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productUnitPrice));
        return productUnitPrice.isDisplayed();
    }
    public boolean isProductDescriptionDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productDescription));
        return productDescription.isDisplayed();
    }
    public boolean isProductQuantityInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productQuantityInputField));
        return productQuantityInputField.isDisplayed();
    }
    public boolean isProductAddQuantityButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productAddQuantityButton));
        return productAddQuantityButton.isDisplayed();
    }
    public boolean isProductRemoveQuantityButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productRemoveQuantityButton));
        return productRemoveQuantityButton.isDisplayed();
    }
    public boolean isProductAddToCartButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productAddToCartButton));
        return productAddToCartButton.isDisplayed();
    }
    public boolean isProductAddToFavoritesButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productAddToFavoritesButton));
        return productAddToFavoritesButton.isDisplayed();
    }

    public boolean isRelatedProductCardDisplayed() {
        for (WebElement element : relatedProductsCardElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isRelatedProductCardImageDisplayed() {
        for (WebElement element : relatedProductsCardImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isRelatedProductCardNameDisplayed() {
        for (WebElement element : relatedProductsNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isRelatedProductCardMoreInfoLinkDisplayed() {
        for (WebElement element : relatedProductsMoreInfoLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

}
