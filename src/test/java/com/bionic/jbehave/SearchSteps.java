package com.bionic.jbehave;

import com.bionic.steps.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SearchSteps {
    @Steps
    UserSteps userSteps;

    @Given("a guest user is on the Home page")
    public void givenTheUserIsOnTheHomePage() {
        userSteps.is_the_home_page();
    }

    @When("they search for '$product'")
    public void whenTheySearchFor(String product) {
        userSteps.search_for(product);
    }

    @Then("the product on '$position' position should be '$product' from '$category'")
    public void theFirstAvailableProductShouldBe(int position, String product, String category) {
        userSteps.found_product_should_be(position - 1, product, category);
    }
}
