/**
 * 
 */
package com.qa.stepdef;

import java.io.IOException;

import com.qa.utils.SingletonObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Ujjwal
 *
 */
public class TestStationRegStep extends SingletonObject {

	String token = null;
	String body = null;

	@Given("User has a valid token")
	public void user_has_a_valid_token() throws IOException {

		getSinhleOb().getApicall().getValidToken();

	}

	@When("User hit the {string} endpoint with {string}")
	public void user_hit_the_endpoint_with(String pathep, String payload) throws IOException {
		getSinhleOb().getApicall().hitPostEndPoint(pathep, payload);
	}

	@Then("Verify the {int} code")
	public void verify_the_success_code(Integer status) {
		getSinhleOb().getApicall().verifyStatus(status);
	}
}
