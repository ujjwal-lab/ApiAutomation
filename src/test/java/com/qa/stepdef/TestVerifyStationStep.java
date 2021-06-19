/**
 * 
 */
package com.qa.stepdef;

import java.io.IOException;

import com.qa.utils.SingletonObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author ujjwal
 *
 */
public class TestVerifyStationStep extends SingletonObject {

	@When("User hit the {string}")
	public void user_hit_the(String getstation) throws IOException {

		getSinhleOb().getApicall().hitGetStationEp(getstation);

	}

	@Then("Verify {string} in response")
	public void verify_in_response(String payload) throws Exception {
		getSinhleOb().getApicall().verifyAddedStation(payload);
	}
}
