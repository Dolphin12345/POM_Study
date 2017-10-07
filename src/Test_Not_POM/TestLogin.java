package Test_Not_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLogin {
	WebDriver driver;
	By homePageUserName= By.xpath("//table//tr[@class='heading3']");
	
	@Test
	public void HomePage(WebDriver driver){
		this.driver= driver;
	}
	
	// Get the Username from Home page
	public String getHomePageDashoardUserName(){
		return driver.findElement(homePageUserName).getText();
	}
}
