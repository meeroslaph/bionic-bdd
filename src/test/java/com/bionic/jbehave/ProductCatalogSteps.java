package com.bionic.jbehave;

import com.bionic.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class ProductCatalogSteps {
    @Steps
    EndUserSteps endUser;

    @Given("a guest user is on the Home page")
    public void givenTheUserIsOnTheHomePage() {
    }

    @Then("they should see the product catalog")
    public void theyShouldSeeTheProductCatalog() {

    }
}
