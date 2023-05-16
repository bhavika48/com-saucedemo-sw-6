package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.ProductsPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

public class ProductSteps {

    @Then("^I verify the text PRODUCTS$")
    public void iVerifyTheTextPRODUCTS() {
        String expectedMessage="Products";
        String actualMessage= new ProductsPage().getTextProducts();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Then("^I verify that six products are displayed on page$")
    public void iVerifyThatSixProductsAreDisplayedOnPage() {
        ArrayList<String> products = new ProductsPage().getListOfProductsName();
        int expNo = 6;
        int actNo = products.size();
        Assert.assertEquals(actNo, expNo);
    }
}
