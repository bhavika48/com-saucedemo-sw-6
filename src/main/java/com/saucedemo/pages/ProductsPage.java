package com.saucedemo.pages;



import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.ArrayList;

/**
 * Created by Jay Vaghani
 */
public class ProductsPage extends Utility {


    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//span[@class='title']" )
    WebElement productsText;

    public String getTextProducts() {
        log.info("Get text from product " + productsText.toString());
        return getTextFromElement(productsText);

    }


    public ArrayList<String> getListOfProductsName() {
        log.info("Get list of products " + productsText.toString());
        ArrayList<String> products = getListOfTextByElement(By.xpath("//div[@class='inventory_item_name']"));
        return products;
    }


}




