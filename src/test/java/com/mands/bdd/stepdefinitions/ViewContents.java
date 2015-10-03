package com.mands.bdd.stepdefinitions;

import com.mands.bdd.pageobjects.BasketPage;
import com.mands.bdd.pageobjects.DetailedProductPage;
import com.mands.bdd.pageobjects.HeaderPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * This class has methods defined from the feature files and converts it into steps that are requried for the actions
 * to be performed. It is the interface between the business facing feature, and solution facing pages.
 */
public class ViewContents extends GenericStepDef {

    // This step visits a particular detailed product page for a shirt.
    // Ideally this should also load up one of these shirts in the test database to ensure we have a known
    // state. Even better it will simply be to add one of these shirts directly into the database.
    // Currently this test is incorrectly testing adding to the basket and that it is displayed in the basket.
    @Given("^I have added a shirt to my bag$")
    public void I_have_added_a_shirt_to_my_bag() throws Throwable {
        Assert.assertTrue("I_have_added_a_shirt_to_my_bag: Cannot add shirt to basket", DetailedProductPage.addShirtToBasket());

    }

    @When("^I view the contents of my bag$")
    public void I_view_the_contents_of_my_bag() throws Throwable {
        // Now select the basket in the Header
        Assert.assertTrue("I_view_the_contents_of_my_bag: Could not select the basket icon in the header", HeaderPage.selectBasket());
    }

    @Then("^I can see the contents of the bag include a shirt$")
    public void I_can_see_the_contents_of_the_bag_include_a_shirt() throws Throwable {
        // Express the Regexp above with the code you wish you had
        Assert.assertTrue("I_can_see_the_contents_of_the_bag_include_a_shirt: Basket Page failed to load", BasketPage.isPageLoaded());
        Assert.assertTrue("I_can_see_the_contents_of_the_bag_include_a_shirt: Expected shirt is not in the basket", BasketPage.isShirtInBasket());
    }
}
