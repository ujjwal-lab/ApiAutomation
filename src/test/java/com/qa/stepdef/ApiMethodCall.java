/**
 * 
 */
package com.qa.stepdef;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import com.qa.utils.CommonMethod;
import com.qa.utils.Utilityclass;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


/**
 * @author ujjwal
 *
 */
public class ApiMethodCall {

	RequestSpecification request;
	Response response;
	String token = null;
	String body = null;

	public void getValidToken() throws IOException {
		RestAssured.baseURI = Utilityclass.loadUri();

		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		token = Utilityclass.getAuthToken();
	}

	public void hitPostEndPoint(String pathep, String payload) throws IOException {
		String path = Utilityclass.getApiEndpoint(pathep);
		body = Utilityclass.getPayloadfromFile(payload);
		response = request.when().body(body).queryParam("appid", token).log().all().post(path);

	}

	public void verifyStatus(Integer status) {

		System.out.println("Response code is " + response.getStatusCode());
		CommonMethod.compareStatusCode(status, response.getStatusCode());
	}

	public void getInvalidToken(String tkn) throws IOException {
		RestAssured.baseURI = Utilityclass.loadUri();

		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		token = tkn;
	}

	public void verifyResponseMessage(String msg) {
		String respmsg = JsonPath.from(response.asString()).get("message");
		System.out.println("Response msg is " + respmsg);
		CommonMethod.compareMessage(msg, respmsg);
	}

	public void hitGetStationEp(String getstation) throws IOException {

		String path = Utilityclass.getApiEndpoint(getstation);
		response = request.when().queryParam("appid", token).log().all().get(path);
	}

	public void verifyAddedStation(String data) throws Exception {

		body = Utilityclass.getPayloadfromFile(data);
		JSONObject js = new JSONObject(body);
		Boolean flag = false;
		System.out.println("Body data" + body);

		JSONArray jsonArray = new JSONArray(response.asString());
		for (int i = 0; i < jsonArray.length(); i++) {

			JSONObject jsonObject = jsonArray.getJSONObject(i);

			String locName = jsonObject.getString("name");
			String id = jsonObject.getString("external_id");

			System.out.println("Location name for " + i + locName);
			System.out.println("Location name for " + i + id);

			if (js.get("name").toString().equalsIgnoreCase(locName)
					&& js.get("external_id").toString().equalsIgnoreCase(id)) {
				flag = true;
				break;
			}

		}
		Assert.assertTrue(flag, "Location not added to System");
	}

}
