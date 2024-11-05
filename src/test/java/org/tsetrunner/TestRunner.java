package org.tsetrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",dryRun=false,glue="org.steps",monochrome=false)
//tags= {"@smoke and @sanity"}) if weusing tag in hooks don't use here
public class TestRunner {

}
