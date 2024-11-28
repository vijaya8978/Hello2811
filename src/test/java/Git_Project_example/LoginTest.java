package Git_Project_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginTest {
	WebDriver driver;
	
	LoginTest(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	
	By txtusname =By.xpath("//input[@placeholder='Username']");
	
	By txtpwd=By.xpath("//input[@placeholder='Password']"); 
	By logbtn=By.xpath("//button[normalize-space()='Login']");
	
	public void setusname(String user)
	{
		driver.findElement( txtusname).sendKeys(user);
		
		
	}
	
	public void setpwd(String pwd)
	{
		driver.findElement(txtpwd).sendKeys(pwd);
	}
	
	public void cliklogin()
	{
		driver.findElement(logbtn).click();
	}

}
