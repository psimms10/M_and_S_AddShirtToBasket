package com.mands.bdd;

import com.mands.bdd.support.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "~@manual,@pending",strict = true,format = {"html:target/cukes"})
public class RunCukeTestsIT {

    @BeforeClass
    public static void setup(){
        Driver.initialiseDriver();
    }

    @AfterClass
    public static void teardown(){
        Driver.driver.close();
    }

}
