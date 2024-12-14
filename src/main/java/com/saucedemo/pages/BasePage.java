package com.saucedemo.pages;

// it has only one role to be parent of all page objects
// this can be made abstract as well to avoid instances of this class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    // below static WebDriver will load along with class
    //Declaring the WebDriver as static means it belongs to the class rather than an instance of the class.
    public static WebDriver driver;

    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void set(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator){
        find(locator).click();
    }
}
