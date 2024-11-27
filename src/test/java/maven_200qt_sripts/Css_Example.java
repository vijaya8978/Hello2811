package maven_200qt_sripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Example {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
driver.manage().window().maximize();
	}

}
