package maven_200qt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	WebDriver driver;
	WebElement we;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	 }
	public void mouse()
	{
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement options=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act= new Actions(driver);
		act.moveToElement(desktop).moveToElement(options).perform();
		options.click();
	
	}

	public static void main(String[] args) throws InterruptedException {
		Mouse_Actions me=new Mouse_Actions();
		me.LaunchAUT();
		me.mouse();
				
		
	

	}

}
