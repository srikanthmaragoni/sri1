package king;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLL {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "E:\\drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
}
