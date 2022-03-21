package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Users\\HP\\eclipse-workspace\\Cucumber_Project1\\src\\main\\java\\feature",
glue="stepdefinitions",
tags= "@tag1 or @tag2",
monochrome=true,
dryRun = false,

plugin = {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","junit:target/cucumber-reports/Cucumber.xml"})

public class RunnerClass {

}
