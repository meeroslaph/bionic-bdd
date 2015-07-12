package com.bionic.jbehave;

import com.bionic.steps.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class ProductCatalogSteps {
    @Steps
    UserSteps userSteps;

    @Given("a guest user is on the Home page")
    public void givenTheUserIsOnTheHomePage() {
        userSteps.is_the_home_page();
    }

    @Then("they should see the product catalog")
    public void theyShouldSeeTheProductCatalog() {
        userSteps.should_see_product_catalog();
    }
}
