package maven_200qt_sripts;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class Get_maven1 {
	@Test

	public void Get_Request()
	{

		given()
		.header("content_type","application/json")

		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();	


	}



}
