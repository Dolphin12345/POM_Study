package fb_pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage_fb {
	WebDriver driver;
	By menuLogout=By.id("userNavigationLabel");
//	By logoutButton=By.xpath("//a[contains(@data-gt,'menu_logout')]");
	By logoutButton=By.xpath(".//*[@id='js_2c']/div/div/ul/li[12]/a/span/span");
	
//	public LogoutPage_fb(WebDriver driver2) {
//		// TODO Auto-generated constructor stub
//	}
	public LogoutPage_fb(WebDriver driver){
		this.driver=driver;
	}
	public void clickOnLogOutButton(){
		driver.findElement(menuLogout).click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(logoutButton).click();
	}
}
