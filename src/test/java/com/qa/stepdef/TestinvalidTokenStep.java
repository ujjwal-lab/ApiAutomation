/**
 * 
 */
package com.qa.stepdef;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilspackage.SingletonObject;

/**
 * @author Ujjwal
 *
 */
public class TestinvalidTokenStep extends SingletonObject{


	@Given("User has an invalid {string}")
	public void user_has_an_invalid(String tkn) throws IOException {

		getSinhleOb().getApicall().getInvalidToken(tkn);

	}

	@Then("check more outcomes like {string}")
	public void check_more_outcomes_like(String msg) {
		getSinhleOb().getApicall().verifyResponseMessage(msg);
	}
}
