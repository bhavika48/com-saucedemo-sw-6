package com.saucedemo.pages;

import com.aventstack.extentreports.Status;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userNameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginLink;


    public void enterUserName() {
        log.info("Enter userName " +   " to userName field " + userNameField.toString());
        sendTextToElement(userNameField, "standard_user");

    }

    public void enterPassword() {
        log.info("Enter password " +  " to password field " + passwordField.toString());
        sendTextToElement(passwordField, "secret_sauce");

    }

    public void selectLogin() {
        log.info("Clicking on Login Link " + loginLink.toString());
        clickOnElement(loginLink);

    }
}





