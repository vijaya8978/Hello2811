package maven_200qt_sripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_doubleClick {
	WebDriver driver;
public void Launch_Aut() throws InterruptedException
{
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();

	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
	driver.manage().window().maximize();
	//switchto frame
	driver.switchTo().frame("iframeResult");
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	WebElement doubleclck=driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.doubleClick(doubleclck).perform();
	
}

	public static void main(String[] args) throws InterruptedException {
		Mouse_doubleClick md= new Mouse_doubleClick();
		md.Launch_Aut();
		
		
		

	}

}
