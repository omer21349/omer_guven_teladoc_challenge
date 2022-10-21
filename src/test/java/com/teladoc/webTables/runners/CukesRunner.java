package com.teladoc.webTables.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features ="src/test/resources/features",
        glue = "com/teladoc/webTables/step_definitions",
        dryRun = false,
        tags = "@webTable"
)
public class CukesRunner {

}
