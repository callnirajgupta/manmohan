package org.selenium.action;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurefile/",tags="@singup",plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"},glue = "org.selenium.stepdef" ,monochrome=true,dryRun=false, snippets = CAMELCASE)
public class Runner {


}
