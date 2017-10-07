package fb_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public String baseURL = "https://www.facebook.com/";
	private WebDriver driver;
//	public WebDriver driver= new FirefoxDriver();
	
	public void launchBrowser(WebDriver driver){
		this.driver=driver;
	}
	public void launchBrowser(){
		driver= new FirefoxDriver();
		// Import Gecko Driver with the Selenium 3.x plus
		System.setProperty("webdriver.gecko.driver", "D:\\01_Dolphin\\Selenium_Software\\geckodriver.exe");
		driver.get(baseURL);
	}
}
