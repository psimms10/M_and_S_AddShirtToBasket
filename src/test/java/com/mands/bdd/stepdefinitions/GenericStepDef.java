package com.mands.bdd.stepdefinitions;

import com.mands.bdd.support.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by psimms on 03/10/2015.
 *
 * Methods that may be used from other specific step defs. Collected here for re-use.
 */
public class GenericStepDef extends Driver{
    /**
     * Load the given page. Used generic in case want other actions to be performed.
     * @param pageToLoad
     */
    public static boolean loadPage(String pageToLoad)
    {
        try {
            Driver.driver.get(pageToLoad);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Check if the given element is present on the page
     *
     * @param by The link to the element to be checked for
     * @return
     */
    public static boolean isElementPresent(By by)
    {
        try {
            Driver.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Loops around to check if the the element is present.
     * @param by  The link to the element to be checked for
     * @return Is element present by the timeout period
     */
    public static boolean waitForElementToBePresent(By by)
    {
        for (int second = 0; second <= 30; second++) {
            try { if (isElementPresent(by)) break; } catch (Exception e) {}
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /**
     * Enters text into the identified field
     * @param by  The link to the element to be checked for
     * @param text The text to enter
     * @return Has text been sent
     */
    public static boolean enterText(By by, String text) {
        try {
            Driver.driver.findElement(by).sendKeys(text);
            return true;
        }     catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * Clicks the element specified
     * @param by  The link to the element to be checked for
     * @return
     */
    public static boolean clickElement(By by) {
        try {
            Driver.driver.findElement(by).click();
            return true;
        }     catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }


}
