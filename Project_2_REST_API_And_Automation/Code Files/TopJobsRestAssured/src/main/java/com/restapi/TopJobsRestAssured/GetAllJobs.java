package com.restapi.TopJobsRestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class GetAllJobs {
	
	
	public void getalljobs() {
		RestAssured.baseURI = "http://localhost:8079/job";
		RequestSpecification http_request = RestAssured.given().log().all();
		Response response_request = http_request.request(Method.GET);
		int StatusCode = response_request.getStatusCode();
		System.out.println("Status"+StatusCode);
		System.out.println("Response"+response_request.getBody().asString());
		Assert.assertEquals(StatusCode,200);
		System.out.println("Assert Passed");
	}

}

