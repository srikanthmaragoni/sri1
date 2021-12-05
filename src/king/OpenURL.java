package king;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

     public class OpenURL {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\drivers/chromedriver.exe");
		driver =new ChromeDriver();
         
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
	}
	

}
