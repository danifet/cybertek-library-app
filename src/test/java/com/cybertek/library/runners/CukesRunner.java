package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = "html: target/reports/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cybertek/library/step_definitions",
        tags = "@Librarian2"


)

public class CukesRunner {


}
