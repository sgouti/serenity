package com.uiautomation.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/nlbc/login.feature" }, glue = { "com.uiautomation.steps" })
public class LoginNLBCTest {
}
