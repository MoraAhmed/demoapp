package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Page02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class Def02_loginStep {


    Page02_login login = new Page02_login();

    @Given("user navigate to login page")
    public void register_step_def() throws InterruptedException {
        login.logLink().click();

        Thread.sleep(1000);
    }

    @When("^user enter valid email \"(.*)\"$")
    public void valid_email(String email) throws InterruptedException {
        login.validEmail().sendKeys(email);
        Thread.sleep(1000);
    }

    @And("^user enter valid password \"(.*)\"$")

    public void valid_password(String password) throws InterruptedException {
        login.validPass().sendKeys(password);

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Thread.sleep(1000);

    }

    @And("user to click enter to log in to the account")

    public void click_enter()  {
        login.validPass().submit();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Then("user go to the home page")

    public void success_log()
    {

        String expectedCurrentURL = "https://demo.nopcommerce.com/";
        String actualCurrentURL= Hooks.driver.getCurrentUrl();

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualCurrentURL, expectedCurrentURL);

        System.out.println("expectedCurrentURL: " +expectedCurrentURL);
        System.out.println("actualCurrentURL: " +actualCurrentURL);

        soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());


        soft.assertAll();


    }



}


