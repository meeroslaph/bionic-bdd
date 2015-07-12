package com.bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.sokol.ua/")
public class HomePage extends PageObject {
    @FindBy(id = "catalog")
    private WebElementFacade productCatalog;

    @FindBy(id = "field-input-search")
    private WebElementFacade searchInput;

    @FindBy(id = "btn-search-top")
    private WebElementFacade btnSearch;

    public boolean catalogIsDisplayed() {
        return productCatalog.isCurrentlyVisible();
    }

    public SearchResultPage search(String keyword) {
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(keyword);
        btnSearch.click();
        return new SearchResultPage();
    }
}
