package maven_200qt_sripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_dragnddrop {
	WebDriver driver;
public void Launch_Aut() throws InterruptedException
{
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();

	
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	WebElement source=driver.findElement(By.xpath("//div[@id='box5']"));
	WebElement destination=driver.findElement(By.xpath("//div[@id='box106']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.dragAndDrop(source, destination).perform();
	Thread.sleep(3000);
	
}

	public static void main(String[] args) throws InterruptedException {
		
		Mouse_dragnddrop md=new Mouse_dragnddrop();
		md.Launch_Aut();

	}

}
