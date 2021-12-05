package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\drivers/chromedriver.exe");
ChromeDriver c1= new ChromeDriver();
c1.get("https://www.instagram.com");
c1.close();
	}

}
