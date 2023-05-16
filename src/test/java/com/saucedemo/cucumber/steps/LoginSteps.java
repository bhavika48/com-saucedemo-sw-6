package com.saucedemo.cucumber.steps;


import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps {

       @Given("^I am on homepage$")
       public void iAmOnHomepage() {
       }

       @When("^I enter \"([^\"]*)\" username$")
       public void iEnterUsername(String username){
              new LoginPage().enterUserName(username);
       }

       @And("^I enter \"([^\"]*)\" password$")
       public void iEnterPassword(String password)  {
              new LoginPage().enterPassword(password);
       }

       @And("^I click on 'LOGIN' button$")
       public void iClickOnLOGINButton() {
              new LoginPage().clickOnLoginButton();
       }
}
