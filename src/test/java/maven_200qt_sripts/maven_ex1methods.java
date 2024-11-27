package maven_200qt_sripts;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class maven_ex1methods {
	@Test
	public void LaunchAUT()
	{
		System.out.println("this is launch method");
		
	}@Test
	public void senddata()
	{
		System.out.println("we need to senddata method");
		
	}@Test
	public void credentials()
	{
		System.out.println("Enter valid username and password");
	}@Test
	public void Clickon_loginButton()
	{
		System.out.println("click on login button");
	}

}
