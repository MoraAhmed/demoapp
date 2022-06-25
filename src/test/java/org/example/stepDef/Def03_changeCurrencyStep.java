package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.example.pages.Page03_currency;

import java.util.List;


public class Def03_changeCurrencyStep {

    Page03_currency currency = new Page03_currency();

    @When("user click on  the dropdown list")
    public void click_on_dropdown() {
        currency.dropDownClick().click();

    }

    @And("click on an another currency")
    public void change_currency() {
        WebElement selectMenu = currency.dropDownClick();
        Select currencyOption = new Select(selectMenu);
        currencyOption.selectByVisibleText("Euro");

    }

    @Then("verify that all products price currency are changed")
    public void verify_change() throws InterruptedException {
        List<WebElement> elements = currency.productSymbol();

        int productsCount = elements.size();
        System.out.println(productsCount);


        for (int i = 0; i < productsCount; i++)
        {
            String price = elements.get(i).getText();
            System.out.println(price);


            Assert.assertTrue(price.contains("€"));



            Thread.sleep(3000);

        }
    }
}



