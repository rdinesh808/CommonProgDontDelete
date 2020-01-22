package com.api.testing;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
public class APITesting_1 {
	@Test
	public void Test_01() {
		Response res = given().
		                     param("q", "login").when().get("https://beta.gsihealth.net/");
		System.out.println(res.getStatusCode());
	}
}
