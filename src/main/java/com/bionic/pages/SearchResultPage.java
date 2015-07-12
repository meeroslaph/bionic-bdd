package com.bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultPage extends PageObject {
    @FindBy(css = ".search-result > *")
    private List<WebElementFacade> resultProducts;
    private By productName = By.cssSelector(".title>a");

    public String getProductName(int position) {
        return resultProducts.get(position).findElement(productName).getText();
    }

    public ProductPage openProduct(int position) {
        resultProducts.get(position).findElement(productName).click();
        return new ProductPage();
    }
}
