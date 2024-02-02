package org.selenium.stepdef;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.selenium.util.SeleniumUtil;

public class hooks {
    private static final Logger LOGGER = LogManager.getLogger(hooks.class);
    public static Scenario scenario;
    private static String scenarioName;
    public static ExtentTest extenttest;
    public WebDriver driver=null;

    @BeforeAll()
    public void BeforeTest(){

    }

    @Before()
    public void Setup(Scenario scenario) {
        LOGGER.info("Inside Setup method");


    }

    @BeforeStep()
    public void BeforeStep(){

    }

    @AfterStep()
    public void AfterStep(){

    }

    @After()
    public void TearDown(Scenario scenario) {
        LOGGER.info("Inside Teardown method");

        if (scenario.isFailed()) {
            LOGGER.debug("################### i am inside screen shot after fail ####################");
            final byte[] screenshot = ((TakesScreenshot) SeleniumUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","");
            scenario.log("after all Step");
           // SeleniumUtil.failTestStep(SeleniumUtil.getDriver(), GlobalStepDefinition.getExtentTest(), "The Step is failed");

        }
        if (SeleniumUtil.getDriver() != null) {

            SeleniumUtil.closeBrowser();
            SeleniumUtil.setDriver(null);
            SeleniumUtil.driverStatus=false;
        }


    }


    @AfterAll()
    public void AfterAllTestExecution(){

    }
}
