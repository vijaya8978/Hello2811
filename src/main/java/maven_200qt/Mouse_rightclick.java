package maven_200qt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_rightclick {
	WebDriver driver;
	WebElement we;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	     
	     Actions act=new Actions(driver);
	     //Right click
	     act.contextClick(right).perform();
	     Thread.sleep(3000);
	     //click on anyone option from after rightclick
	     driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	     Thread.sleep(3000);
	     //close the alert window
	     driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws InterruptedException {
		Mouse_rightclick mr=new Mouse_rightclick();
		mr.LaunchAUT();
		

	}

}
