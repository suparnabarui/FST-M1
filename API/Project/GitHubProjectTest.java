package project;

import java.util.HashMap;

import org.apache.commons.collections.map.HashedMap;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class GitHubProjectTest {

	String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIPhyCn2aYtUTh4XyhCINbonU/WxaLpx4SRFhzgMmMGhF";

	int keyId ;
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	
	@BeforeClass 
	public void setUp() {
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://api.github.com/user/keys").
				addHeader("Content-Type", "application/json").
				addHeader("Authorization", "token ").
				addHeader("X-GitHub-Api-Version", "2022-11-28").
				build();
				
				
		responseSpec = new ResponseSpecBuilder().
				expectBody("title",Matchers.equalTo("TestKey")).
				expectBody("key",Matchers.equalTo(sshKey)).
				expectResponseTime(Matchers.lessThanOrEqualTo(3000L)).
				build();
		
	}
		
		@Test(priority =1)
		public void postRequest() {
			//create a request body
			HashMap <String,String> reqBody = new HashMap<String,String>();
			reqBody.put("title", "TestKey");
			reqBody.put("key", sshKey);
			
			//send request , save response 
			Response response = RestAssured.given()
					.spec(requestSpec)
					.body(reqBody).log().all()
				.when()
					.post();
			//extract id from response 
			keyId = response.then().extract().path("id");
			//assertions 
			response.then().
			statusCode(201).
			spec(responseSpec).log().all();			 
				
		}
			
		@Test(priority = 2)
	    public void getRequestTest() {
	    	// Send request, save response
	    	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
			when().get("/{keyId}").
			then().statusCode(200).spec(responseSpec);
	    }
	
		@Test(priority = 3)
	    public void deleteRequestTest() {
	    	// Send request, save response
	    	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
			when().delete("/{keyId}").
			then().statusCode(204).time(Matchers.lessThanOrEqualTo(3000L));
	    }
}
