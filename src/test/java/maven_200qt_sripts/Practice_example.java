package maven_200qt_sripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_example {
	WebDriver driver;
	WebElement we;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	 }
	
	

	public static void main(String[] args) throws InterruptedException {
		Practice_example p=new Practice_example();
		p.LaunchAUT();
		 
		 }

}
