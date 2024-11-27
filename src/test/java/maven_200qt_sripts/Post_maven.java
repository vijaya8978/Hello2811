package maven_200qt_sripts; 
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Post_maven {
	@Test
	public void Create()
	{
		HashMap hm=new HashMap();
		hm.put("Ename","vijaya");
		hm.put("Elocation","Hyderabad");
		hm.put("address","vizianagaram");
	given()
	.contentType("application/json")
	//.body(hm)
	.when()
	.post("https://reqres.in/api/users?page=2")
	.then()
	.statusCode(201)
	.log().all();
	
	
		
				
	}
	

}
