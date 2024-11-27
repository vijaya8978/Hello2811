package maven_200qt_sripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_OrangeHRM {
	WebDriver driver;
	WebElement we;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	 }
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();
		Thread.sleep(3000);
		
		
	}
	public void job() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Chief Executive Officer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Software Engineer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Rahul Patil']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		 driver.findElement(By.xpath("//span[normalize-space()='Interview Passed']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("John Doe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("John Doe");
		Thread.sleep(3000);
	}
		public void Dropdown() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("2024-03-18");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("2024-03-27");
			Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[3]")).click();

		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(3000);
	}


	
	public static void main(String[] args) throws InterruptedException {
		Dropdown_OrangeHRM obj=new Dropdown_OrangeHRM();
		
		obj.LaunchAUT();
		obj.login();
		obj.job();
		obj.Dropdown();
		
	}
		

	}


