package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/emr.feature",glue= {"Definitions"},plugin = { "pretty" },monochrome = true
)

public class TestRunner {

}
