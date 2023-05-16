package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class ProductSteps {


    @When("^I enter \"([^\"]*)\" username$")
    public void iEnterUsername(String arg0) {
        new LoginPage().enterUserName();

    }

    @And("^I enter \"([^\"]*)\" password$")
    public void iEnterPassword(String arg0) {
        new LoginPage().enterPassword();

    }

    @And("^enter \"([^\"]*)\" password$")
    public void enterPassword(String arg0) {
        new LoginPage().enterPassword();

    }

    @Then("^I verify that six products are displayed on page$")
    public void iVerifyThatSixProductsAreDisplayedOnPage() {
        ArrayList<String> products = new ProductsPage().getListOfProductsName();
        int expNo = 6;
        int actNo = products.size();
        Assert.assertEquals(actNo, expNo);
    }
}
