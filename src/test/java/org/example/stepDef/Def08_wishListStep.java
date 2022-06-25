package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.example.pages.Page08_wishList;
import org.openqa.selenium.support.Color;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class Def08_wishListStep {
    int productsNumInt;

    Page08_wishList wishList = new Page08_wishList();

    @When("user clicks on add to wishlist icon below product")
    public void click_on_wishList() throws InterruptedException {
        wishList.wishListIcon().get(2).click();
        Thread.sleep(3000);
    }

    @Then("successful message appears")
    public void successfulMsg()
    {
        Assert.assertTrue(wishList.notificationDisplay().isDisplayed());

        String backgroundColor = wishList.notificationDisplay().getCssValue("background-color");
        System.out.println(backgroundColor);
        String hex= Color.fromString(backgroundColor).asHex();
        System.out.println(hex);


        Assert.assertTrue(hex.contains("#4bb07a"));
    }

    @And ("user waits until menu bar be visible")
    public void appearingMenBar()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, ofSeconds(20));

        WebElement notificationBox = wishList.notificationDisplay();
        wait.until(invisibilityOf(notificationBox));

    }

    @And ("user gets the number of items on the wishlist")
    public void items_on_wishlistIcon()
    {
      String productsNumString = wishList.wishListItems().getText();
        System.out.println(productsNumString);

        productsNumString= productsNumString.replaceAll("[^0-9]", "");
        productsNumInt = Integer.parseInt(productsNumString);

    }

    @Then("verify that items increase on the wishlist icon on the home page")
    public void verifyItemNum()
    {
        Assert.assertTrue(productsNumInt>0);

    }


    @And ("user clicks on wishlist tab to go to wishlist page")

    public void wishListPage() throws InterruptedException {
        wishList.wishListWindow().click();

        Thread.sleep(4000);


    }

    @Then("verify that items increase on the wishlist page")
    public void qtyValue_on_wishPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, ofSeconds(20));

        String getQytValue = wait.until(visibilityOf(wishList.valueLocator())).getAttribute("value");

        System.out.println(getQytValue);

        getQytValue= getQytValue.replaceAll("[^0-9]", "");
        int qytNumInt = Integer.parseInt(getQytValue);

        Assert.assertTrue(qytNumInt>0);



    }


}
