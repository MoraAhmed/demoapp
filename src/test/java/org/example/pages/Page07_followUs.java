package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDef.Hooks;

public class Page07_followUs {
    static WebDriver driver = Hooks.driver;

    public WebElement confirmDisplaying() {
        return Hooks.driver.findElement(By.className("networks"));
    }

    public WebElement fbPageClick() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitterPageClick() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));

    }

    public WebElement rssPageClick()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement youtubePageClick()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));

    }



}
