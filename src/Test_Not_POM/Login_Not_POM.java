package Test_Not_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Not_POM {
	WebDriver driver;
	public String baseURL = "https://www.facebook.com/";
	
	@BeforeTest
	public void LaunchBrowser(){
		System.setProperty("webdriver.gecko.driver", "D:\\01_Dolphin\\Selenium_Software\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	@Test
	public void LoginPage() throws InterruptedException{
		driver.findElement(By.id("email")).sendKeys("testvietid001@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vietid1234");
//		driver.findElement(By.name("Log In")).click();
//		driver.findElement(By.xpath(".//*[text()='Log In']")).click();
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login successfully");
//		Thread.sleep(5000);
	}
	@Test(dependsOnMethods= {"LoginPage"}) 
	public void LogoutPage(){
		
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
//		driver.findElement(By.linkText("Log out")).click();
//		driver.findElement(By.id("show_me_how_logout")).click();
//		driver.findElement(By.xpath(".//*[@id='js_3c']/div/div/ul/li[12]/a/span/span")).click();
//		driver.findElement(By.xpath(".//*[starts-with(@id,':show_me_how_logout')]")).click();
//		driver.findElement(By.id("logoutMenu")).click();
//		driver.findElement(By.linkText("Log out")).click();
//		driver.findElement(By.id("show_me_how_logout_1")).click();
//		driver.findElement(By.className("_54nh")).click();		
//      driver.findElement(By.partialLinkText("Log Out")).click();
//		driver.findElement(By.xpath("//input[@value='Log Out']")).click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String script = "var forms = document.getElementsByTagName('form');for (var i = 0; i < forms.length; i++) { if(forms[i].getAttribute('action')=='https://www.facebook.com/logout.php'){forms[i].submit();}}";
//		js.executeScript(script);
		
		driver.findElement(By.xpath(".//*[text()='Log out']")).click();
        
//		driver.findElement(By.xpath("//a[contains(@data-gt,'menu_logout')]")).click();
		
        System.out.println("Log out successfully");
	}
	
	@AfterTest
	public void aftertest() {
		  driver.quit();
	  }
}
