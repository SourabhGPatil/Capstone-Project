package com.restapi.TopJobsRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class DeleteByJobId {

	
	public void deletebyjobid() {
		RestAssured.baseURI = "http://localhost:8079/job/14";
		RequestSpecification http_request = RestAssured.given().log().all();
		Response response_request = http_request.request(Method.DELETE);
		//response code
		int StatusCode = response_request.getStatusCode();
		System.out.println("Status code "+StatusCode);
		System.out.println("Response"+response_request.getBody().asString());
		
		if (StatusCode != 200) {
			System.out.println("Delete operation is not performed");
		}
		else {
			System.out.println("Delete is working");
		}
	}
	
}
