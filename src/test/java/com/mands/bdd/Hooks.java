package com.mands.bdd;


import com.mands.bdd.support.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Driver{

    @Before
    public void beforeScenario(){
        Driver.driver.manage().window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario){

    }


}
