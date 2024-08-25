package StepDefinition;

import PageFactory.PF_Functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
    @Given("Check if user navigate to page {string} and it matches the {string} from page {string}")
    public void checkIfUserNavigateToPageAndItMatchesTheFromPage(String cartElement, String expectedElement, String page) {
        
        System.out.println("\nNavigating to Cart Page");
        PF_Functions.AssertText(cartElement, expectedElement, page);

    }

    @When("Verify if user added {string} into the cart must named as {string} from page {string}")
    public void verifyIfUserAddedIntoTheCartMustNamedAsFromPage(String productElement, String expectedProduct, String page) {
        
        System.out.println("\nVerification of Products added to the cart");
        PF_Functions.AssertText(productElement, expectedProduct, page);

    }

    @Then("Check if User able to click on {string} from page {string}")
    public void checkIfUserAbleToClickOnFromPage(String checkoutElement, String page) {
        PF_Functions.clickOnElement(checkoutElement, page);
        
    }
}
