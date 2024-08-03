package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\psjey\\eclipse-workspace\\CucumberQuince\\src\\test\\resources\\features\\quincelogin.feature",glue="org.step")
public class testrunnerclass {

}
