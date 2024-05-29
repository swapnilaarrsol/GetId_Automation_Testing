package pages;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BaseClass {	
		
		public static WebDriver driver;
		public void launchBrowser() throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
			HashMap<String, Object> profile = new HashMap<String, Object>();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			
			contentSettings.put("notifications", 1);
			profile.put("managed_default_content_settings", contentSettings);
			prefs.put("profile", profile);
			options.setExperimentalOption("prefs", prefs);	
			
			driver = new ChromeDriver(options);		
			driver.manage().window().maximize();
			driver.get("https://taj888.com/login");
			System.err.println("Open Url");
			Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
		}
		
		public static void launchBrowser1() throws InterruptedException {			
			driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://taj888.com/login");
			System.err.println("Open Url");
			Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
		}	
		
		public void tearDown() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();			
		}
}
