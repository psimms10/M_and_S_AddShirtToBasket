package com.mands.bdd.pageobjects;

import com.mands.bdd.stepdefinitions.GenericStepDef;
import org.openqa.selenium.By;

/**
 * Created by psimms on 03/10/2015.
 */
public class HeaderPage extends GenericStepDef {

    public static final String HEADER_BASKET_ICON_CSS = ".basket-icon";

    public static boolean selectBasket ()
    {
        // Is element available
        // Wait for page to load (element to be present)
        if (!waitForElementToBePresent(By.cssSelector(HEADER_BASKET_ICON_CSS))) return false;

        // Element is present so click
        if (!clickElement(By.cssSelector(HEADER_BASKET_ICON_CSS))) return false;

        return true;
    }
}
