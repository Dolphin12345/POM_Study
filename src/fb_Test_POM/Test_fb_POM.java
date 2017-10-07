package fb_Test_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fb_pageObject.LoginPage_fb;
import fb_pageObject.LogoutPage_fb;

public class Test_fb_POM {
	
	WebDriver driver;
	public String baseURL = "https://www.facebook.com/";
	
	@BeforeTest
	public void VerifyLaunchBrowser(){
		System.setProperty("webdriver.gecko.driver", "D:\\01_Dolphin\\Selenium_Software\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	
	@Test
	public void verifyLogin(){
		LoginPage_fb login= new LoginPage_fb(driver);
		login.typeUserName("testvietid001@gmail.com");
		login.typePassword("vietid1234");
		login.clickOnLoginButton();
	}
	
	@Test(dependsOnMethods= {"verifyLogin"})
	public void verifyLogout(){
		LogoutPage_fb logout= new LogoutPage_fb(driver);
		logout.clickOnLogOutButton();
	}
	
	@AfterTest
	public void aftertest() {
		  driver.quit();
	  }
}
