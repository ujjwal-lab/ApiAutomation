/**
 * 
 */
package com.qa.stepdef;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Ujjwal
 *
 */
public class TestStepDef {

	ApiMethodCall apiOb = new ApiMethodCall();

	@Given("User has an invalid {string}")
	public void user_has_an_invalid(String tkn) throws IOException {

		apiOb.getInvalidToken(tkn);

	}

	@Then("check more outcomes like {string}")
	public void check_more_outcomes_like(String msg) {
		apiOb.verifyResponseMessage(msg);
	}

	@Given("User has a valid token")
	public void user_has_a_valid_token() throws IOException {

		apiOb.getValidToken();

	}

	@When("User hit the {string} endpoint with {string}")
	public void user_hit_the_endpoint_with(String pathep, String payload) throws IOException {
		apiOb.hitPostEndPoint(pathep, payload);
	}

	@Then("Verify the {int} code")
	public void verify_the_success_code(Integer status) {
		apiOb.verifyStatus(status);
	}

	@When("User hit the {string}")
	public void user_hit_the(String getstation) throws IOException {

		apiOb.hitGetStationEp(getstation);

	}

	@Then("Verify {string} in response")
	public void verify_in_response(String payload) throws Exception {
		apiOb.verifyAddedStation(payload);
	}

}
