package StepDefinition;

import PageFactory.PF_Functions;
import PageFactory.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewItems {

    @Given("Check if user navigate to {string} and it matches the {string} from page {string}")
    public void Checkifusernavigatetoanditmatchesthefrompage(String element, String expected, String page) {
        PF_Functions.AssertText(element, expected, page);
    }

    @When("Verify if the user able to click on {string} from page {string}")
    public void verifyIfTheUserAbleToClickOnFromPage(String addtoCartBtn, String page) {
        PF_Functions.clickOnElement(addtoCartBtn, page);
    }

    @Then("Verify {string} Product count matches to {string} from page {string}")
    public void verifyProductCountMatchesToFromPage(String cartIcon, String expectedcount, String page) {
        System.out.println("\nCart Count Check:");
        PF_Functions.AssertText(cartIcon, expectedcount, page);
    }

    @And("Check if User click on {string} from page {string}")
    public void checkIfUserClickOnFromPage(String addToCart, String page) {
        PF_Functions.clickOnElement(addToCart, page);
    }
}
