package maven_200qt_sripts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screeshot_example {
	WebDriver driver;
	public void LaunchAut()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     driver=new ChromeDriver();	
	     driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			/*
			 * TakesScreenshot ts=(TakesScreenshot)driver; File
			 * srcfile=ts.getScreenshotAs(OutputType.FILE); File trtfile=new
			 * File(System.getProperty("user.dir")+"\\Screenshot1\\fullpage.png");
			 * srcfile.renameTo(trtfile);
			 */
WebElement featuredProduct=	driver.findElement(By.xpath("//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default ']"));
File srcfile=featuredProduct.getScreenshotAs(OutputType.FILE); 
File trtfile=new File(System.getProperty("user.dir")+"\\Screenshot1\\fullpage1.png");
 srcfile.renameTo(trtfile);	
	}
	
	

	public static void main(String[] args)
	{
		Screeshot_example se=new Screeshot_example();
		se.LaunchAut();

	}

}
