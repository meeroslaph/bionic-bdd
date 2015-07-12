package com.bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {
    @FindBy(css = ".active-bg > a")
    private WebElementFacade currentCategory;

    public String getCurrentCategory() {
        return currentCategory.getText();
    }
}
