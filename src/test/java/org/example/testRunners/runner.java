package org.example.testRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src\\main\\resources\\featuresList",
        glue = {"org.example.stepDef"},
        plugin ={ "pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/cukes.xml",
                "rerun:target/cucumber-report/rerun.txt"},
        //dryRun = false,
        tags = "@smoke"
)public class runner extends AbstractTestNGCucumberTests {

}