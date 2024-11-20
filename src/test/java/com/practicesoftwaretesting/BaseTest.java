package com.practicesoftwaretesting;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

import java.util.*;


public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setUp(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-search-engine-choice-screen"); // For browser run
        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080"); // Necessary for CI run, uncomment when needed
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize(); // Enable this for browser run
        driver.get("https://practicesoftwaretesting.com/");
    }

    @AfterEach
    public void close() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
