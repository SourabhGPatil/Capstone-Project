package com.restapiproject.TopJobs;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetCall {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:8074/job";
		RequestSpecification req=RestAssured.given().log().uri();
		Response res =req.request(Method.GET);
		
		  int statuscode=res.getStatusCode(); System.out.println(statuscode);
		  System.out.println(res.getBody().asPrettyString());
		  Assert.assertEquals(statuscode, 200); 
		
		 	}

}