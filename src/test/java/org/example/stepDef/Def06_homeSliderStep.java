package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import org.example.pages.Page06_slider;
import java.time.Duration;

public class Def06_homeSliderStep {

    Page06_slider homeSlider = new Page06_slider();
    SoftAssert soft = new SoftAssert();

    @Given("the slider on the main page is displayed")

    public void slider_is_displayed() throws InterruptedException {
        Thread.sleep(3000);
        soft.assertTrue(homeSlider.sliderAppears().isDisplayed());
        System.out.println("the slider is displayed");
    }


    /*first Scenario >>>

    @When("user clicks on the first slider")

    public void click_on_1st_slider() {
        //Hooks.driver.findElement(By.cssSelector("div > div.slider-wrapper.theme-custom > div.nivo-controlNav > a:nth-child(1)"));
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        homeSlider.clickable_slider("1").click();

    }

    @Then("user navigate to the first product page")

    public void product01_page() throws InterruptedException {

        Thread.sleep(3000);
        String expectedSliderPageURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualSliderPageURL = Hooks.driver.getCurrentUrl();

        soft.assertNotEquals(actualSliderPageURL, expectedSliderPageURL, "This is a bug on the website");

    }

     */


    //second scenario
    @When("user clicks on the second slider")

    public void click_on_2nd_slider()
    {


        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Hooks.driver.findElement(By.cssSelector("div > div.slider-wrapper.theme-custom > div.nivo-controlNav > a:nth-child(2)"));

        homeSlider.clickable_slider("2").click();



    }

    @Then("user navigate to the second product page")

    public void product02_page(){

        String expectedSlider02URL = "https//demo.nopcommerce.com/iphone-6";
        String actualSlider02URL = Hooks.driver.getCurrentUrl();

        soft.assertNotEquals(actualSlider02URL, expectedSlider02URL, "This is a bug on the website");

    }




}





