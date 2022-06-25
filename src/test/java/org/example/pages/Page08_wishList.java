package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDef.Hooks;

import java.util.List;

public class Page08_wishList {

    static WebDriver driver = Hooks.driver;

    public List<WebElement> wishListIcon() {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

    }

    public WebElement notificationDisplay() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
    }

    public WebElement wishListItems() {
        return Hooks.driver.findElement(By.xpath("//span[@class=\"wishlist-qty\"]"));

    }

    public WebElement wishListWindow()
    {
       return Hooks.driver.findElement(By.xpath("//a[@href=\"/wishlist\"]"));
    }

    public WebElement valueLocator()
    {
        return Hooks.driver.findElement(By.className("qty-input"));
    }
}


