package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getData {
	@Test
	public void testResponsecode()
	{
		Response rsp1= RestAssured.get("http://restapi.demoqa.com/utilities/weather/city/London");
		
		System.out.println(rsp1.statusCode());
		
		System.out.println(rsp1.asString());
		
		//String response= rsp1.asString();
	}

}
