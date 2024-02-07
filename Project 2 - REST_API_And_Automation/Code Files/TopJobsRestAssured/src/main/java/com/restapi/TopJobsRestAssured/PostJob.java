package com.restapi.TopJobsRestAssured;


import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

@Test
public class PostJob {

	
	public void addanewJob(){
		
		RestAssured.baseURI = "http://localhost:8079/job/";
		RequestSpecification http_request = RestAssured.given().log().all();
		//creating req in json
		JSONObject jsob = new JSONObject();
		jsob.put("jobID","21");
		jsob.put("jobTitle","abc");
		jsob.put("qualifications","12 th pass");
		jsob.put("employerID","E0005");
		jsob.put("employerName","zzz");
		jsob.put("compensation","210000");
		
		//header-adding
		http_request.header("Content-Type","application/json");
		http_request.body(jsob.toString());

		Response res = http_request.request(Method.POST);
		System.out.println("Status code : "+res.getStatusCode());
		System.out.println("Body "+res.getBody().asPrettyString());

		ResponseBody res_body = res.getBody();
		PojoTopJobs convert = res_body.as(PojoTopJobs.class);
		try {
			Assert.assertEquals(21,convert.jobID);
			System.out.println("POST OPERATION SUCCESSFUL");
		}catch(Exception e) {
			System.out.println("POST OPERATION ERROR...");
		}
		
	}
}