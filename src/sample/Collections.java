package sample;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections {

	public static WebDriver driver;
	
	public static void setup(String application) {
		System.setProperty("webdriver.chrome.driver","E:\\drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(application);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public static void ElementListusage(String xpath) {
	System.out.println("List usage example");
	java.util.List<WebElement> precedingslibing=driver.findElements(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr[3]"));
	
	Iterator<WebElement> itr=precedingslibing.iterator();
	String value="";
	int i=1;
	HashMap<String,String>ElementValues=new HashMap<String,String>();
	while(itr.hasNext())
	{
	WebElement element=itr.next();
	value=element.getText();
	System.out.println("Element gettext:" +value);
	//ElementValues.put("Element"+i,value);
	//i++;	
	}
	//displayHashMapvalues(ElementValues);
	}
	public static void DropdownList(String xpath) {
		System.out.println("Dropdown elements list usage example");
		/*
		 * List<WebElement> Dropdownlist=driver.findElements(By.xpath(xpath));
		 * Iterator<WebElement> itr=Dropdownlist.iterator(); int i=1; String value="";
		 * while(itr.hasNext()); { WebElement element=itr.next();
		 * value=element.getText(); System.out.println("Element gettext:" +value); }
		 */
		
		}
		public static void SetUsage() {
			System.out.println("set usage example");
			System.out.println("window handle example");
			String parentwindowHandle=driver.getWindowHandle();
			System.out.println("parentwindowHandle:"+parentwindowHandle);
			Set<String>childwindowHandles=driver.getWindowHandles();
			String childwindow="";
			Iterator<String>itr=childwindowHandles.iterator();
			while(itr.hasNext())
			{
				childwindow=itr.next();
				System.out.println("childwindowHandle:"+childwindow);
				if(!parentwindowHandle.equals(childwindow))
				{
					driver.switchTo().window(childwindow);
					System.out.println("childwindowtitle:"+driver.getTitle());
				}
				else
					System.out.println("This is parent window,its title:"+driver.getTitle());
				driver.switchTo().defaultContent();
			}
			System.out.println("window title:"+driver.getTitle());
			}
			public static void displayHashMapvalues(HashMap<String,String>elementValues) {
			Set<Entry<String,String>> elementsset=elementValues.entrySet();
			Iterator<Entry<String,String>>Itr=elementsset.iterator();
			while(Itr.hasNext()){
				Entry<String,String> entry=Itr.next();
				System.out.println("Key:"+entry.getKey()+"value:"+entry.getValue());
			}	
			}
			public static void quitdriver() {
				driver.quit();
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String application="https://money.rediff.com/gainers";
String application2="https://www.naukri.com/nlogin/login";
String application3="https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
//setup(application);

String xpathList="//*[contains(text(),'Mohota Industries L')]/parent::td/ancestor::tr/preceding-slibing::tr";

String xpdropdownList="//*[@id='select-demo']";

/*ElementListusage(xpathList);
quitdriver();
*/

/*setup(application3);
DropdownList(xpdropdownList);
quitdriver();
*/
setup(application2);
SetUsage();
quitdriver();







	}

}
