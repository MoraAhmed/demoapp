package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Page01_register;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class Def01_registerStep {

    Page01_register register = new Page01_register();

    @Given("user navigate to register page")
    public void register_step_def() throws InterruptedException {
        register.regLink().click();

        Thread.sleep(1000);

    }

    @When("user choose the gender")
    public void gender_type() throws InterruptedException {
        register.genderOptions("female").click();

        Thread.sleep(1000);

    }




    @And("^user insert the first name \"(.*)\" and the last name \"(.*)\"$")
    public void valid_names(String firstname, String lastname) throws InterruptedException {
        register.firstName().sendKeys(firstname);
        register.lastName().sendKeys(lastname);

        Thread.sleep(1000);

    }


    @And("user select the date of birth")
    public void birth_of_date() throws InterruptedException {
        WebElement dayOfBd = register.birthDateDay();
        Select select = new Select(dayOfBd);
        select.selectByVisibleText("15");

        Thread.sleep(1000);


        WebElement monthOfBd = register.birthDateMonth();
        select = new Select(monthOfBd);
        select.selectByValue("9");

        Thread.sleep(1000);



        WebElement yearOfBd = register.birthDateYear();
        select = new Select(yearOfBd);
        select.selectByValue("1995");
    }


    @And("^user enter email \"(.*)\" for registration field$")
    public void valid_email(String email) throws InterruptedException {
        register.emailString().sendKeys(email);

        Thread.sleep(1000);

    }


    @And("^user enter Password and Confirm password fields \"(.*)\" and \"(.*)\"$")
    public void password_passConfirmation(String password, String confirmPassword) throws InterruptedException {
        register.passString().sendKeys(password);
        register.confirmationPass().sendKeys(confirmPassword);

        Thread.sleep(1000);

    }

    @And("user is able to on the register button")
    public void click_reg() throws InterruptedException {
        register.regButton().click();

        Thread.sleep(1000);

    }

    @Then("success message appears")
    public void success_reg(){

        String expectedResult = "Your registration completed";
        String actualResult =  register.regResult().getText();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualResult.contains(expectedResult), true );

        System.out.println("expectedResult: " + expectedResult);
        System.out.println("actualResult: " + actualResult);



        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor = register.regResult().getCssValue("color");

        soft.assertEquals(expectedColor, actualColor);

        System.out.println("expectedColor: " + expectedColor);
        System.out.println("actualColor: " + actualColor);







    }

}
