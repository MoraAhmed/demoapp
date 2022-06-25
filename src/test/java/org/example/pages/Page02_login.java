package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDef.Hooks;

public class Page02_login {

 static WebDriver driver = Hooks.driver ;

    public WebElement logLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }


    public WebElement validEmail()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement validPass()
    {
        return Hooks.driver.findElement(By.className("password"));
    }


    /*public WebElement accountIcon()
    {
       return Hooks.driver.findElement(By.className("ico-account"));
    }

     */
}
