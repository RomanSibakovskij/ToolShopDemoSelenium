package com.practicesoftwaretesting;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MyAccountPage extends BasePage{

    //my account page web elements
    @FindBy(xpath = "//h1")
    private WebElement myAccountPageTitle;
    @FindBy(xpath = "//p")
    private WebElement myAccountPageDescription;
    //profile dropdown menu
    @FindBy(xpath = "//a[@id='menu']")
    private WebElement profileDropdownMenu;
    //'Sign-out' option
    @FindBy(xpath = "//ul[@class='dropdown-menu show']/li[7]")
    private WebElement signOutOption;
    //my account page table element
    private List<WebElement> myAccountTableLinkElements = driver.findElements(By.xpath("//div[@class='btn-group-vertical']/a"));

    public MyAccountPage(WebDriver driver) {super(driver);}

    //my account page title getter
    public String getMyAccountPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1850));
        wait.until(ExpectedConditions.visibilityOf(myAccountPageDescription));
        return myAccountPageTitle.getText();
    }
    //my account page description getter
    public String getMyAccountPageDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1850));
        wait.until(ExpectedConditions.visibilityOf(myAccountPageDescription));
        return myAccountPageDescription.getText();}

    //click profile dropdown menu method
    public void clickProfileDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1850));
        wait.until(ExpectedConditions.elementToBeClickable(profileDropdownMenu));
        profileDropdownMenu.click();
    }

    //click 'Sign-out' button method
    public void clickSignOutOption() {signOutOption.click();}

    //my account page web element assert methods
    public boolean isMyAccountPageTitleDisplayed(){return myAccountPageTitle.isDisplayed();}
    public boolean isMyAccountPageDescriptionDisplayed(){return myAccountPageDescription.isDisplayed();}
    public boolean isProfileDropdownMenuDisplayed(){return profileDropdownMenu.isDisplayed();}

    public boolean isMyAccountTableLinkDisplayed() {
        for (WebElement element : myAccountTableLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
