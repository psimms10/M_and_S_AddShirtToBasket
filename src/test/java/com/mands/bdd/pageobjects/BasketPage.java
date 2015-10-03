package com.mands.bdd.pageobjects;

import com.mands.bdd.stepdefinitions.GenericStepDef;
import com.mands.bdd.support.Driver;
import org.openqa.selenium.By;

/**
 * Created by psimms on 03/10/2015.
 */
public class BasketPage extends GenericStepDef {

    public static final String BASKET_PAGE_CLASS_NAME = "basket";
    public static final String BASKET_SHIRT_ITEM_1_CSS = ".heading-product>a";
    public static final String BASKET_SHIRT_URL = "http://www.marksandspencer.com/pure-cotton-tailored-fit-marl-checked-shirt/p/p22408965";
    public static final String BASKET_PAGE_START_URL = "http://www.marksandspencer.com/OrderCalculate";

    public static boolean isPageLoaded () {
        // Wait for an element to be present
        if (!waitForElementToBePresent(By.className(BASKET_PAGE_CLASS_NAME))) return false;

        // Check URL start
        return driver.getCurrentUrl().startsWith(BASKET_PAGE_START_URL);

    }

    public static boolean isShirtInBasket()
    {
        // Ensure the Basket item is present
        if (!waitForElementToBePresent(By.cssSelector(BASKET_SHIRT_ITEM_1_CSS))) return false;
        // Retrieve the href for the 1st item in the basket.
        // If not run on test database should get a list of all items in basket and check that this is in the
        // list of elements
        String basketItemURL = Driver.driver.findElement(By.cssSelector(BASKET_SHIRT_ITEM_1_CSS)).getAttribute("href");
        // Now ensure that this URL is the expected one.
        if(!basketItemURL.startsWith(BASKET_SHIRT_URL)) return false;

        return true;
    }

}
