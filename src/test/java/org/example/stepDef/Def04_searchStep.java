package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.example.pages.Page04_search;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class Def04_searchStep {

    Page04_search search = new Page04_search();
    SoftAssert soft = new SoftAssert();


    @Given("search bar is displayed")
    public void searchDisplay() {
        Assert.assertTrue(search.searchBar().isDisplayed());
    }

    @When("user clicks on  search bar")
    public void searchClick() {
        search.searchBar().click();

    }


    @And("^user enters the product name as\"(.*)\"$")
    public void searchProduct(String brand) throws InterruptedException {

        search.searchBar().sendKeys(brand);
        Thread.sleep(3000);

    }

    @And("^user enters the product SKU as\"(.*)\"$")
    public void searchProductSku(String sku)
    {
        search.searchBar().sendKeys(sku);
    }


    @And("user clicks on search button")
    public void searchBtnClick() {
        search.searchButton().click();
    }


    @And("user confirm that he goes to the search page")
    public void searchPage() throws InterruptedException {

        String expectedPage = "https://demo.nopcommerce.com/search?q=";
        String actualPage = Hooks.driver.getCurrentUrl();

        soft.assertTrue(actualPage.contains(expectedPage));
        System.out.println("expectedPage is: " + expectedPage);
        System.out.println("actualPage is" + actualPage);
        Thread.sleep(2000);
    }


    @Then("^verify the result is relevant to search word as \"(.*)\"$")
    public void confirmResult(String name)  {
        List<WebElement> elements = search.result();
        int productsNum = elements.size();
        System.out.println(productsNum);
        System.out.println(name);

        for (int i = 0; i < productsNum; i++) {
            String title = elements.get(i).getText().toLowerCase();
            System.out.println(title);

            WebDriverWait wait = new WebDriverWait(Hooks.driver, ofSeconds(25));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class=\"product-title\"]")));

            String [] exProducts = new String[0];
            if(name.contains("_"))
            {
                exProducts = name.toLowerCase().split("_");
                for (String x : exProducts)

                    soft.assertTrue(title.contains(x));
            }
            else{
                String exName = name.toLowerCase();
                System.out.println(exName);

                System.out.println(exName);
                soft.assertTrue(title.contains(exName));

            }


            soft.assertAll();




        }


    }
}