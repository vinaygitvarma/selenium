package MeitySelenium;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reuseableCode {
	WebDriver driver;
	By waiter =By.xpath("//select[@class='form-control']");
	public reuseableCode(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	public String randomString() {
		String random=RandomStringUtils.randomAlphanumeric(3);
		return random;
	}
	public String tommorowDate() {
		DateTimeFormatter formattertommorrow = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 LocalDate tomorrow = LocalDate.now().plusDays(1);
	      String tommorrowDate = tomorrow.format(formattertommorrow);
	      return tommorrowDate;
	}
	public String endDate() {
	LocalDate currentDate = LocalDate.now().plusDays(2);
	// Format the date as day, month, year
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String formattedDate = currentDate.format(formatter);
      return formattedDate;
     
}
	public void waitForElementToBeClickable(By locator){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	public void waitForElementToBeClickableWebelement(WebElement locator){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	public void waitForElementToBevisibleWebelement(WebElement locator){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	public void scrollToElement(WebElement ele) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
}
