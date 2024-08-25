package StepDefinition;//package StepDefinition;

import PageFactory.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    @After
    public static void tearDown(Scenario scenario) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) PageDriver.driver;
        byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", screenshot.toString());
    }
}