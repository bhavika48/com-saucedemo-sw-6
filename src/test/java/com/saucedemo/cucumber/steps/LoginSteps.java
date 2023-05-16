package com.saucedemo.cucumber.steps;


import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Jay Vaghani
 */
public class LoginSteps {

       @Given("^I am on homepage$")
       public void iAmOnHomepage() {
       }

       @When("^I enter \"([^\"]*)\" username$")
       public void iEnterUsername(String arg0){
              new LoginPage().enterUserName();

       }

       @And("^enter \"([^\"]*)\" password$")
       public void enterPassword(String arg0)  {
              new LoginPage().enterPassword();

       }

       @And("^I click on 'LOGIN' button$")
       public void iClickOnLOGINButton() {
              new LoginPage().selectLogin();
       }

       @Then("^I verify the text PRODUCTS$")
       public void iVerifyTheTextPRODUCTS() {
              String expectedMessage="Products";
              String actualMessage= new ProductsPage().getTextProducts();
              Assert.assertEquals(actualMessage,expectedMessage);
       }
}
