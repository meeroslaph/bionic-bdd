package com.bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.sokol.ua/")
public class HomePage extends PageObject {
    @FindBy(id = "catalog")
    private WebElementFacade productCatalog;

    public boolean catalogIsDisplayed() {
        return productCatalog.isCurrentlyVisible();
    }
}
