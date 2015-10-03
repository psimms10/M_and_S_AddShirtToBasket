package com.mands.bdd.pageobjects;

import com.mands.bdd.stepdefinitions.GenericStepDef;
import com.mands.bdd.support.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by psimms on 03/10/2015.
 */
public class DetailedProductPage extends GenericStepDef {

    public static final String SHIRT_PRODUCT_PAGE = "http://www.marksandspencer.com/pure-cotton-tailored-fit-marl-checked-shirt/p/p22408965";
    public static final String SHIRT_ADD_TO_BASKET_ID = "basket_P22408965";
    public static final String SIZE_GRID_CSS = ".sizes.displayCell.grid-1d>tbody>tr>td>label";
    public static final String SIZE_XL = "XL";

    // Ideally this is inserting directly into test database to ensure setup is consistent for the case under test
    // However it could be used for a test to add an item to the basket.
    public static boolean addShirtToBasket ()
    {
        boolean retVal=true;
        // Load the product page for the shirt
        GenericStepDef.loadPage(SHIRT_PRODUCT_PAGE);

        // Wait for page to load (element to be present)
        if (!waitForElementToBePresent(By.id(SHIRT_ADD_TO_BASKET_ID))) return false;

        // Need to set the sie of the shirt in order to add to basket
        selectSize(By.cssSelector(SIZE_GRID_CSS), SIZE_XL);
        // Click Add shirt to basket
        if (!clickElement(By.id(SHIRT_ADD_TO_BASKET_ID))) return false;


        return retVal;
    }

    /**
     * Helper method to set the size of the item
     *
     * @param selector
     * @param size
     * @return
     */
    private static boolean selectSize( By selector, String size )
    {
        boolean sizeFound = false;
        // Need to set the size of the item
        List<WebElement> link = Driver.driver.findElements(selector);
        // Loop through the elements and check for matches against expected value
        for (WebElement ele : link) {
            // Select size
            if (ele.getText().equalsIgnoreCase(size)) {
                // Match is found so need to select it and can now Click and break out of the loop
                ele.click();
                sizeFound = true;
                break;
            }
        }

        return sizeFound;

    }
}
