package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page05_hover {

    static WebDriver driver = Hooks.driver;

    public WebElement verifyCategoriesMenu() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
    }


    public WebElement hoverOnCategory() {
        return Hooks.driver.findElement(By.xpath("//*[text()= 'Computers ']"));
    }

    public WebElement hoverSubCategory() {
        return Hooks.driver.findElement(By.xpath("//*[text()= 'Desktops ']"));
    }

    public WebElement pageTitle() {
       return Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"] //*[text()= 'Desktops']"));
    }

}