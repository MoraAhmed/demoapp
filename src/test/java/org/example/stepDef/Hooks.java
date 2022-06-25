package org.example.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    @Before
    public void  OpenBrowser (){

        //Make a bridge between test scripts and browsers:
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);

        //new object of web driver:
        driver = new ChromeDriver();

        //Navigate to the required website:
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));


    }


    @After
    public void  ExitDriver (){
        //Use quit for close all tab:
        driver.quit();


    }



}
