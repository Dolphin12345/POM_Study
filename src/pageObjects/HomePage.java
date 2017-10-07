package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	public String baseURL = "http://demo.guru99.com/V4/";
	public WebDriver driver= new FirefoxDriver();
	
	public void launchBrowser(){
		// Import Gecko Driver with the Selenium 3.x plus
		System.setProperty("webdriver.gecko.driver", "D:\\01_Dolphin\\Selenium_Software\\geckodriver.exe");
		driver.get(baseURL);
	}
	
//	WebDriver driver;
	By homePageUserName= By.xpath("//table//tr[@class='heading3']");
	
	public HomePage(WebDriver driver){
		this.driver= driver;
	}
	
	//Get the Username from HomePage
	public String getHomePageDashboardUsername(){
		return driver.findElement(homePageUserName).getText();
	}
}
