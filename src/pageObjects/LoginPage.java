package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By user99GuruName= By.name("uid");
	By password99Guru= By.name("password");
	By titleText= By.className("barone");
	By login= By.name("btnLogin");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//Set username into textbox
	public void setUserName(String strUserName){
		driver.findElement(user99GuruName).sendKeys(strUserName);
	}
	//Set password into password textbox
	public void setPassword(String strPassword){
		driver.findElement(password99Guru).sendKeys(strPassword);
	}
	//Click on Login button
	public void clickLogin(){
		driver.findElement(login).click();
	}
	
	//Get the title of Login page
	public String getLoginTitle(){
		return driver.findElement(titleText).getText();
	}
	
	public void loginToGuru99(String strUserName, String strPassword){
		// Fill username
		this.setUserName(strUserName);
		// Fill password
		this.setPassword(strPassword);
		//Click on the Login button
		this.clickLogin();
	}
	
}
