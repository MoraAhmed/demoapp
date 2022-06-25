package org.example.stepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Page05_hover;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class Def05_hoverStep {

    Page05_hover hover= new Page05_hover();

    SoftAssert soft = new SoftAssert();

    @Given("verify that the categories tabs are displayed")
    public void CategoriesDisplay()
    {
        soft.assertTrue(hover.verifyCategoriesMenu().isDisplayed());
    }

    @When("user hovers on category and select subCategory")
    public void HoverCategory() throws InterruptedException
    {
        Actions action = new Actions(Hooks.driver);
        WebElement Computers = hover.hoverOnCategory();
        action.moveToElement(Computers);

        WebElement Desktops = hover.hoverSubCategory();
        action.moveToElement(Desktops);
        System.out.println(Desktops);
        action.click().build().perform();

        Thread.sleep(3000);

    }

    @Then("verify the page title is the same of the sub-category title")
    public void select_sub_category()
    {
        String expectedTitle = hover.pageTitle().getText().toLowerCase().trim();
        System.out.println(expectedTitle);
        String actualTitle = Hooks.driver.getCurrentUrl();
        System.out.println(actualTitle);

        soft.assertTrue(actualTitle.contains(expectedTitle));
        soft.assertAll();

      }


}