package com.bionic.steps;

import com.bionic.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class UserSteps extends ScenarioSteps {
    HomePage homePage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void should_see_product_catalog() {
        assertTrue(homePage.catalogIsDisplayed());
    }
}
