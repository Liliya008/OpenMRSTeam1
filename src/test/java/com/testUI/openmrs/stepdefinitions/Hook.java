package com.testUI.openmrs.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {
    WebDriver driver= DriverHelper.getDriver();

    @Before
    public void setup(){
        driver.get(ConfigReader.readProperty("QA_URL"));
    }
    @After
    public void tearDown(Scenario scenario){
        BrowserUtils.getScreenShotForCucumber(driver,scenario);
      driver.quit();
    }
}
