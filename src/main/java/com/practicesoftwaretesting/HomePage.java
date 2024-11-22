package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class HomePage extends BasePage{

    //homepage web elements
    //navbar elements
    @FindBy(xpath = "//nav//a[@title='Practice Software Testing - Toolshop']")
    private WebElement brandLogo;
    private List<WebElement> navbarLinkElements = driver.findElements(By.xpath("//div[@id='navbarSupportedContent']/ul[@role='menubar']/li/a"));
    //home nav link element
    @FindBy(xpath = "//button[@id='language']")
    private WebElement navbarLanguageDropdownMenu;
    //banner element
    @FindBy(xpath = "//img[@alt='Banner']")
    private WebElement homePageBanner;
    //aside menu web elements
    //sort
    @FindBy(xpath = "//select[@aria-label='sort']")
    private WebElement sortDropdownMenu;
    @FindBy(xpath = "//ngx-slider[@aria-label='ngx-slider']")
    private WebElement priceRangeSlider;
    //search
    @FindBy(xpath = "//input[@id='search-query']")
    private WebElement searchBarInputField;
    @FindBy(xpath = "//button[@type='reset']")
    private WebElement searchBarRemoveQueryButton;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBarButton;
    //filter (by category and type checkboxes)
    private List<WebElement> toolSelectionCheckboxElements = driver.findElements(By.xpath("//div[@class='row']//div[@class='checkbox']//input[@name='category_id']"));
    //brand (checkboxes)
    private List<WebElement> brandCheckboxElements = driver.findElements(By.xpath("//div[@class='row']//div[@class='checkbox']//input[@name='brand_id']"));
    //main container web elements
    //product cards
    @FindBy(xpath = "//div[@class='col-md-9']//a[@class='card']")
    private List<WebElement> productCardElements;
    @FindBy(xpath = "//div[@class='col-md-9']//a[@class='card'][3]")
    private WebElement boltCutterCard;
    //product card singular elements
    @FindBy(xpath = "//div[@class='col-md-9']//img")
    private List<WebElement> productCardImageElements;
    @FindBy(xpath = "//div[@class='col-md-9']//h5")
    private List<WebElement> productCardNameElements;
    @FindBy(xpath = "//div[@class='col-md-9']//span[@class='float-end text-muted']")
    private List<WebElement> productCardFooterElements;
    //pagination elements
    private List<WebElement> paginationLinkElements = driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));
    //footer web elements
    @FindBy(xpath = "//div[@class='container-fluid text-center bg-light p-5 mt-4']/p")
    private WebElement footerParagraph;
    private List<WebElement> footerLinkElements = driver.findElements(By.xpath("//div[@class='container-fluid text-center bg-light p-5 mt-4']//a"));

    public HomePage(WebDriver driver) {super(driver);}

    //homepage navbar link click index getter
    public void clickNavbarLink(int navLinkIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(720));
        wait.until(ExpectedConditions.elementToBeClickable(navbarLinkElements.get(navLinkIndex)));
        navbarLinkElements.get(navLinkIndex).click();
    }
    //click 'Sign-in' navbar link method
    public void clickSignInNavbarLink(){clickNavbarLink(3);}

    //click 'Bolt cutters' card method //due to the instability of Selenium test runs, single element is used, not the one from the list
    public void clickBrandLogoLink() {
        brandLogo.click();
    }

    //click 'Bolt cutters' card method //due to the instability of Selenium test runs, single element is used, not the one from the list
    public void clickBoltCuttersCard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(boltCutterCard));
        boltCutterCard.click();
    }

    //product card data getters
    public List<String> getProductName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productCardNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductCardFooter() {
        List<String> productCardFooter = new ArrayList<>();
        for (WebElement element : productCardFooterElements) {
            productCardFooter.add(element.getText());
        }
        return productCardFooter;
    }

    //homepage web element assert methods
    public boolean isNavbarBrandLogoDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(brandLogo));
        return brandLogo.isDisplayed();
    }
    public boolean isNavbarLanguageDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(navbarLanguageDropdownMenu));
        return navbarLanguageDropdownMenu.isDisplayed();
    }
    public boolean isHomePageBannerDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(homePageBanner));
        return homePageBanner.isDisplayed();
    }
    public boolean isSortDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(sortDropdownMenu));
        return sortDropdownMenu.isDisplayed();
    }
    public boolean isPriceRangeSliderDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(priceRangeSlider));
        return priceRangeSlider.isDisplayed();
    }
    public boolean isSearchInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(searchBarInputField));
        return searchBarInputField.isDisplayed();
    }
    public boolean isSearchRemoveQueryButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(searchBarRemoveQueryButton));
        return searchBarRemoveQueryButton.isDisplayed();
    }
    public boolean isSearchButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(searchBarButton));
        return searchBarButton.isDisplayed();
    }
    public boolean isFooterParagraphDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(footerParagraph));
        return footerParagraph.isDisplayed();
    }

    public boolean isNavbarLinkDisplayed() {
        for (WebElement element : navbarLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isToolSelectionCheckboxDisplayed() {
        for (WebElement element : toolSelectionCheckboxElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBrandCheckboxDisplayed() {
        for (WebElement element : brandCheckboxElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardDisplayed() {
        for (WebElement element : productCardElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardImageDisplayed() {
        for (WebElement element : productCardImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardNameDisplayed() {
        for (WebElement element : productCardNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardFooterDisplayed() {
        for (WebElement element : productCardFooterElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isPaginationLinkDisplayed() {
        for (WebElement element : paginationLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isFooterLinkDisplayed() {
        for (WebElement element : footerLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }


}
