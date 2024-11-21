package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SingleProductPage extends BasePage{

    //single product page web elements
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


}
