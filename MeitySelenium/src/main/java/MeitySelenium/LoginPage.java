package MeitySelenium;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	ChallengeName challe;
	WebDriver driver;
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement userName;
	@FindBy(xpath ="//input[@id=\"input-password\"]")
	WebElement passWord;
	@FindBy(xpath ="//button[@class=\"appearance-filled full-width size-large shape-rectangle status-primary nb-transition login-button\"]")
	WebElement buTton;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ChallengeName loginSuccess(String usernawme,String password) {
		userName.sendKeys(usernawme);
			passWord.sendKeys(password);
			buTton.click();
			challe=new ChallengeName(driver);
			return challe;
	}
	public void url() {
		driver.get("http://13.233.29.114/meityadmin/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}
	
//	public reuseableCode loginButton( ){			
//	reuseableCode reuseableCode=new reuseableCode();
//	return reuseableCode;
//		
//	}

}
