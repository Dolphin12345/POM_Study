package fb_pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_fb {
	WebDriver driver;
	
	By username=By.id("email");
	By password=By.id("pass");
	By loginButton=By.id("loginbutton");
	
//	public LoginPage_fb(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//	}
	public LoginPage_fb(WebDriver driver){
		this.driver=driver;
	}
	public void typeUserName(String uid){
		driver.findElement(username).sendKeys(uid);
	}
	public void typePassword(String pass){
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnLoginButton(){
		driver.findElement(loginButton).click();
	}
}
