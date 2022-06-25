package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDef.Hooks;

public class Page01_register {
    static WebDriver driver = Hooks.driver ;
    public WebElement regLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }

    public WebElement genderOptions(String kind)
    {
        WebElement element = null;

        if (kind.contains("female")) {
            element = Hooks.driver.findElement(By.cssSelector("input[value=\"F\"]"));
        }
        else if(kind.contains("male")) {
            element = Hooks.driver.findElement(By.cssSelector("input[value=\"M\"]"));

        }
        return element;

    }

    public WebElement firstName()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement birthDateDay()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birthDateMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthDateYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }


    public WebElement emailString()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }


    public WebElement passString()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmationPass()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }


    public WebElement regButton()
    {
        return  Hooks.driver.findElement(By.id("register-button"));
    }


    public WebElement regResult()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}
