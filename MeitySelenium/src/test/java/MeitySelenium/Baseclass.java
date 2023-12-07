package MeitySelenium;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	WebDriver driver;
	LoginPage loginPage;
	
	Actions action;
	String uuid;
	public WebDriver driverIntializatoin() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		return driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		action=new Actions(driver);
		System.out.println("test");
		return driver;
	}
	@BeforeClass
	public LoginPage browserHIt() {
		driver =driverIntializatoin();
		loginPage=new LoginPage(driver);
		loginPage.url();
		return loginPage;
	}

}
