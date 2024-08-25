package StepDefinition;

import PageFactory.PF_Functions;
import PageFactory.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {

    @Given("Start Browser")
    public void startBrowser() {
        PageDriver.launchDriver();
    }


    @Given("Navigate to {string} from page {string} by  Google Chrome")
    public void navigateToFromPageByGoogleChrome(String url, String page) {
        
        PageDriver.getURL(url, page);
        System.out.println("\n");
    }

    @And("User enter {string} on {string} from page {string}")
    public void userEnterOnFromPageByGoogleChrome(String username, String usernameField, String page) throws InterruptedException {
    
        PF_Functions.sendKeys(username, usernameField, page);
    }

    @Then("User click on {string} from page {string}")
    public void userClickOnFromPage(String loginbtn, String page) throws InterruptedException {
        
        PF_Functions.clickOnElement(loginbtn, page);

    }
}
