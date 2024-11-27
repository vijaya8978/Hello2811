package maven_200qt_sripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile{
	WebDriver driver;
	public void Launch_aut()
	{
		System.setProperty("Webddriver.chrome.driver","C:\\Users\\VIJJU\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.davidwalsh.name/demo/multiple-file-upload.php");
	    driver.manage().window().maximize();
	    // single file uploaded
		/*
		 * driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(
		 * "D:\\Github\\practice.txt");
		 * if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals(
		 * "practice.txt"))
		 * 
		 * { System.out.println("file is succesfully uploaded");
		 * 
		 * } else { System.out.println("file upload failed"); }
		 */
	    //multiple file uploaded
	    String file1="D:\\Github\\practice.txt";
	    String file2=" D:\\Github\\firstfile_github.txt";
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	  
	    
	}
	

	public static void main(String[] args) {
		
		Uploadfile uf=new Uploadfile();
		uf.Launch_aut();

	}

}
