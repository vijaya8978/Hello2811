package maven_200qt_sripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_handles {
	WebDriver driver;
	//WebElement we;
	
		
		public void LaunchAUT() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			//get the url
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			driver.manage().window().maximize();

		}
		
		public void send_data() throws InterruptedException
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(3000);
			
		}
		public void Recruitment() throws InterruptedException
		{
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Regana Vijaya laxmi");
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/input")).click();
		    Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/input")).click();
		     Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Bonula Vijaya laxmi");
		
		}
		public void jobTitle() throws InterruptedException
		{
 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
		
		
		
		
		Thread.sleep(3000);
		
		}
		
		
		
		
		public static void main(String[] args) throws InterruptedException {
			dropdown_handles obj=new dropdown_handles();
			
			obj.LaunchAUT();

			obj.send_data();
			obj.Recruitment();
			obj.jobTitle();

		}
	  
	






		

	}


