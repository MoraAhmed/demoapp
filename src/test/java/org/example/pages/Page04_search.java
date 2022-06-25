package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page04_search {
    static WebDriver driver= Hooks.driver;

    public WebElement searchBar()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));

    }

    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List<WebElement> result()
    {
        return Hooks.driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));

    }


}
