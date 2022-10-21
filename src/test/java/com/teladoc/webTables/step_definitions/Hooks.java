package com.teladoc.webTables.step_definitions;

import com.teladoc.webTables.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void tearDownScenario(Scenario scenario){
        if(scenario.isFailed()) {
            byte[] screenShoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShoot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }

}
