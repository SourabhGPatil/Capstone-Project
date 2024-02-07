package com.restapiproject.TopJobs;

import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCall {

	public static void main(String[] args) throws JSONException {
		RestAssured.baseURI="http://localhost:8074/job/";
		RequestSpecification req=RestAssured.given().log().uri();
		JSONObject js=new JSONObject();
		js.put("jobID","10" );
		js.put("employerID", "E0004");
		js.put("employerName", "xyz");
		js.put("compensation", "200000");
		js.put("jobTitle", "Designer");
		js.put("qualifications", "12th");
		req.header("Accept","application/json");
		req.body(js.toString());
		Response res=req.request(Method.POST);
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody().asPrettyString());
		/*
		 * "jobID": 9, "employerID": null, "employerName": null, "compensation": 0.0,
		 * "jobTitle": null, "qualifications": null
		 */

	}

}
