package com.bionic.steps;

import com.bionic.pages.HomePage;
import com.bionic.pages.ProductPage;
import com.bionic.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.StringUtils;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class UserSteps extends ScenarioSteps {
    HomePage homePage;
    SearchResultPage searchResultPage;
    ProductPage productPage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void should_see_product_catalog() {
        assertTrue(homePage.catalogIsDisplayed());
    }

    @Step
    public void search_for(String product) {
        homePage.search(product);
    }

    @Step
    public void found_product_should_be(int position, String product, String category) {
        assertTrue(StringUtils.containsIgnoreCase(searchResultPage.getProductName(position), product));
        productPage = searchResultPage.openProduct(position);
        assertTrue(productPage.getCurrentCategory().equals(category));
    }
}