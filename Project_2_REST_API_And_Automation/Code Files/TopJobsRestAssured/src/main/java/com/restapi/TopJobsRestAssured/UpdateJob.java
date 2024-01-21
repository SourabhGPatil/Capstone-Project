package com.restapi.TopJobsRestAssured;


import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class UpdateJob {
	
	public void updatebyjobid() {
		
		RestAssured.baseURI = "http://localhost:8079/job/14";
		RequestSpecification http_request = RestAssured.given().log().all();
		//creating req in json
		JSONObject jsob = new JSONObject();
		jsob.put("employerID","E0020");
		jsob.put("jobTitle","Mobile App Developer");
		jsob.put("qualifications","MS");
		jsob.put("employerID","E0006");
		jsob.put("employerName","KetchApp");
		jsob.put("compensation","500000");
		//header-adding
		http_request.header("Content-Type","application/json");
		http_request.body(jsob.toString());
		Response res = http_request.request(Method.PUT);
		System.out.println("Status code "+res.getStatusCode());
		System.out.println("Body "+res.getBody().asString());
		
	}

}

