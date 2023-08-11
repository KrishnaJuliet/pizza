package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources",
glue =  {"stepdefinition"},
dryRun =  false,
monochrome =  false,
plugin = "pretty")
public class pizza_testrunner {
	
}
