package maven_200qt_sripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Table_example {
	WebDriver driver;
	public void Launch_Aut() throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	public void page() throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Portland");
		sel.selectByValue("San Diego");
		Thread.sleep(3000);
		List<WebElement>options=sel.getOptions();
		System.out.println("the options are:"+options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		WebElement we1=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select sel1=new Select(we1);
		sel1.selectByVisibleText("London");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(3000);
	}
	public void handletable()
	{
		int td1=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
	
		
		System.out.println("the rows are:"+td1);
		int td2=driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println("The columns are:"+td2);
		//String flightname=driver.findElement(By.xpath("")).getText();
	}
	public void flightsel()
	{
		driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[1]")).click();
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("vijaya");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//select[@id='cardType']")).click();
		driver.findElement(By.xpath("//option[@value='amex']")).click();
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("pogiri");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		Table_example ce=new Table_example();
		ce.Launch_Aut();  
		ce.page();
		ce.handletable();
		ce.flightsel();
		
	}

}
