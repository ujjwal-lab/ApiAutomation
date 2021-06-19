/**
 * 
 */
package com.qa.runnerpkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author Ujjwal
 * 
 *         this is a Runner class to execute feature files
 */

@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = { "com.qa.stepdef" }, tags = {
		"@testsuite" }, monochrome = true, plugin = { "html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json" })
public class Runner extends AbstractTestNGCucumberTests {

}
