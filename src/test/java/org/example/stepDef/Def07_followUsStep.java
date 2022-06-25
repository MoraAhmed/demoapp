package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.example.pages.Page07_followUs;

import java.util.ArrayList;

public class Def07_followUsStep {

    Page07_followUs followUs = new Page07_followUs();

    @Given("the follow us icons on the main page are displayed")

    public void iconsAppear() {
        Assert.assertTrue(followUs.confirmDisplaying().isDisplayed());

        System.out.println("the icons are displayed");
    }

    @When("user clicks on the facebook icon")
    public void clickFacebook() {
        followUs.fbPageClick().click();
    }

    @Then("^user navigate to \"([^\"]*)\" on new window$")

    public void relatedPage(String url) throws InterruptedException {
        Thread.sleep(4000);
        ArrayList pages = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window((String) pages.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());

        Thread.sleep(3000);

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), url);
        Hooks.driver.close();

        Thread.sleep(1000);


        Hooks.driver.switchTo().window((String) pages.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());

        Thread.sleep(2000);


    }


    @When("user clicks on the Twitter icon")

    public void clickTwitter() {

        followUs.twitterPageClick().click();

    }

    @When("user clicks on the Youtube icon")
    public void clickYoutube() {

        followUs.youtubePageClick().click();

    }

    @When("user clicks on the rss icon")
    public void clickRss() {
        followUs.rssPageClick().click();

    }

    @Then("^user navigate to rss page \"([^\"]*)\" on new window$")

    public void rssPage(String url) throws InterruptedException {
        Thread.sleep(4000);

        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());

        Assert.assertTrue((Hooks.driver.getCurrentUrl().contains(url)));


    }







}
