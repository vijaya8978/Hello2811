package Git_Project_example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pageobj_exp {
	WebDriver driver;
	
	
	@BeforeClass
	void setup()
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void Login()
	{
		LoginTest lg=new LoginTest(driver);
		lg.setusname("Admin");
		lg.setpwd("admin123");
		lg.cliklogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	
	
	

	

}
