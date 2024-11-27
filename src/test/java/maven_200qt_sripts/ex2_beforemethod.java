package maven_200qt_sripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex2_beforemethod {
	
	@BeforeMethod
	public void launchAUT()
	{
		System.out.println("launch the aut");
	}
	@Test
	public void senddata()
	{
		System.out.println("we need to send data");
	}
@Test
	public void credentials()
	{
		System.out.println("we need enter valid username and password");
	}@Test
	public void clickon_loginbutton()
	{
	System.out.println("click the login button");	
	}
}
