package maven_200qt_sripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_examples {
	WebDriver driver;
	public void LaunchAut()
	{
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//System.out.println("display status of logo:"+logo.isDisplayed());
		
	}

	public static void main(String[] args) {
		Conditional_examples ce=new Conditional_examples();
		ce.LaunchAut();
		

	}

}
