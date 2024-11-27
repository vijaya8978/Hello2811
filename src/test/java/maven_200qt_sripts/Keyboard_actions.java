package maven_200qt_sripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {
	WebDriver driver;
	public void Launch_Aut() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement start=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		 WebElement stop=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		//Thread.sleep(3000);
        System.out.println("the start element values are:"+start.getLocation());
		Actions act=new Actions(driver);
       // act.dragAndDropBy(start, 100, 289).perform();
        System.out.println("After moving:"+start.getLocation());
       
        System.out.println("stop elements are:"+stop.getLocation());
        //act.dragAndDropBy(stop, -100, 250).perform();
	}
	

	public static void main(String[] args) throws InterruptedException {
		Keyboard_actions ka=new Keyboard_actions();
		ka.Launch_Aut();
		//Thread.sleep(3000);



	}

}
