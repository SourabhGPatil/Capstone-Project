package com.restapiproject.TopJobs;

import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutCall {

	public static void main(String[] args) throws JSONException {
		RestAssured.baseURI="http://localhost:8074/job/10";
		RequestSpecification req=RestAssured.given().log().uri();
		JSONObject js=new JSONObject();
		js.put("jobID","10" );
		js.put("employerID", "E0007");
		js.put("employerName", "xyz");
		js.put("compensation", "200000");
		js.put("jobTitle", "Designer");
		js.put("qualifications", "12th");
		req.header("Content-Type","application/json");
		req.body(js.toString());
		Response res=req.request(Method.PUT);
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody().asPrettyString());

	}
}
