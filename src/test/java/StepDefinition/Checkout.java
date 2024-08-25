package StepDefinition;

import PageFactory.PF_Functions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
    @Given("Check if user navigates to page {string} and it matches the {string} from page {string}")
    public void checkIfUserNavigatesToPageAndItMatchesTheFromPage(String checkoutElement, String expectedTitle, String page) {
        System.out.println("\nNavigating to Checkout Page");
        PF_Functions.AssertText(checkoutElement, expectedTitle, page);


    }

    @When("Check if User enter {string} on {string} from page {string}")
    public void checkIfUserEnterOnFromPage(String data, String element, String page) {
        PF_Functions.sendKeys(data, element, page);
    }

    @And("Check User is able to click on {string} from page {string}")
    public void checkUserIsAbleToClickOnFromPage(String element, String page) {
        PF_Functions.clickOnElement(element, page);
    }

    @Then("Check if {string} and it matches the {string} from page {string}")
    public void checkIfAndItMatchesTheFromPage(String totalAmtElement, String expectedAmt, String page) {
        System.out.println("\nVerify Total Amount");
        PF_Functions.AssertText(totalAmtElement, expectedAmt, page);
    }
}
