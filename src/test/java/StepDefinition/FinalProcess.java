package StepDefinition;

import PageFactory.PF_Functions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FinalProcess {
    @Given("Check if user redirect to page {string} and it matches the {string} from page {string}")
    public void checkIfUserRedirectToPageAndItMatchesTheFromPage(String Finalelement, String expectedData, String page) {
        
        System.out.println("\nRedirect to "+ expectedData+ "Screen");
        PF_Functions.AssertText(Finalelement, expectedData, page);
    }

    @Then("Check to ensure that the message displayed on the {string} matches the expected message {string} in the {string}")
    public void checkToEnsureThatTheMessageDisplayedOnTheMatchesTheExpectedMessageInThe(String msgElement, String expectedMsg, String page) {
        
        System.out.println("\nValidate Final Message");
        PF_Functions.AssertText(msgElement, expectedMsg, page);
    }

    @And("Check if Click on {string} navigates to the Home {string} and it matches the {string} from page {string}")
    public void checkIfClickOnNavigatesToTheHomeAndItMatchesTheFromPage(String homePageBtn, String element, String expected, String page) {
        
        PF_Functions.clickOnElement(homePageBtn, page);
        System.out.println("\nRedirect back to Product Screen");
        PF_Functions.AssertText(element, expected, page);
    }
}
