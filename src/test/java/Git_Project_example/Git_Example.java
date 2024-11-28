package Git_Project_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Git_Example {
	WebDriver driver;
  @Test(priority=1)
  public void Setup() {
	  System.setProperty("WebDriver.Chrome.driver","C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
  @Test(priority=2)
  void Login()
  {
	  driver.get( "https://tutorialsninja.com/demo/");
	  driver.manage().window().maximize();
  }
  @Test(priority=3)
  void Desktop() throws InterruptedException
  {
	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']")).click();  
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Show AllDesktops']")).click();
  driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks (5)']")).click();
  driver.findElement(By.xpath("//img[@title='HP LP3065']")).click();
  driver.findElement(By.xpath("//button[@id='button-cart']")).click();
  
  }
}	
