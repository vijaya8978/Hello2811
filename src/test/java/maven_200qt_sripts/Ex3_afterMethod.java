package maven_200qt_sripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Ex3_afterMethod {
	@AfterMethod
	public void LaunchAUT() 
	  {
		  System.out.println("This is Launch the application");
	  }
	  @Test
	  public void Senddata()
	  {
		  System.out.println("we need to send data");
	  }
	  @Test
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
