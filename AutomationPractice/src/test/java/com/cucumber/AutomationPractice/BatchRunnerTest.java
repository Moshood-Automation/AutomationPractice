package com.cucumber.AutomationPractice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		format = {"pretty","json:target/json/output.json","html:target/html/"},
		features = "src/test/resource",
		tags = {"@RegisterTest,@LoginTest,@AddAnItemToCartTest,@TwitterLogoTest,@CheckoutTest,@SearchTest"}
		
  )

public class BatchRunnerTest extends AbstractTestNGCucumberTests{

}
