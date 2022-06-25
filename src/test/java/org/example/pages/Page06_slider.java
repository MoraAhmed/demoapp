package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page06_slider {
    static WebDriver driver = Hooks.driver ;

    public WebElement sliderAppears()
    {

        return (Hooks.driver.findElement(By.id("nivo-slider")));
    }

    public WebElement clickable_slider(String numberOfSlide)
    {
        WebElement element = (Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child(" + numberOfSlide + ")")));

        return element;
    }


}
