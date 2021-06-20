/**
 * 
 */
package com.qa.stepdef;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @author Ujjwal
 *
 */
public class TestNegativeStepDef {

	@Given("User has an invalid {string}")
	public void user_has_an_invalid(String tkn) throws IOException {

		BaseTest.intsance.getMethodCall().getInvalidToken(tkn);

	}

	@Then("check more outcomes like {string}")
	public void check_more_outcomes_like(String msg) {
		BaseTest.intsance.getMethodCall().verifyResponseMessage(msg);
	}

}
