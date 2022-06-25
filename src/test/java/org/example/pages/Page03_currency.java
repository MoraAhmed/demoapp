package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page03_currency {
    static WebDriver driver = Hooks.driver;

    public WebElement dropDownClick()
    {

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }



    public List<WebElement> productSymbol()
    {
      return  Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }

}

