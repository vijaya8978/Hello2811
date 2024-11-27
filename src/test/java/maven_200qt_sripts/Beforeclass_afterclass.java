package maven_200qt_sripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeclass_afterclass {
	@BeforeClass
	public void LaunchAUT() 
	  {
		  System.out.println("This is Launch the application");
	  }
	  @Test
	  public void Senddata()
	  {
		  System.out.println("we need to send data");
	  }
	  @AfterClass
	  public void Credentials()
	  {
		  System.out.println("Enter valid Username and password");
	  }
	  @Test
	  public void ClickOn_LoginButton()
	  {
		  System.out.println("Click on login button");
	  }


}
