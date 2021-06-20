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




	@Given("User has a valid token")
	public void user_has_a_valid_token() throws IOException {

		BaseTest.intsance.getMethodCall().getValidToken();

	}

	@When("User hit the {string} endpoint with {string}")
	public void user_hit_the_endpoint_with(String pathep, String payload) throws IOException {
		BaseTest.intsance.getMethodCall().hitPostEndPoint(pathep, payload);
	}

	@Then("Verify the {int} code")
	public void verify_the_success_code(Integer status) {
		BaseTest.intsance.getMethodCall().verifyStatus(status);
	}

	@When("User hit the {string}")
	public void user_hit_the(String getstation) throws IOException {

		BaseTest.intsance.getMethodCall().hitGetStationEp(getstation);

	}

	@Then("Verify {string} in response")
	public void verify_in_response(String payload) throws Exception {
		BaseTest.intsance.getMethodCall().verifyAddedStation(payload);
	}

}
