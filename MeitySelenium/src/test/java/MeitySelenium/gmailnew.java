package MeitySelenium;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmailnew {
	WebDriver driver;
	@Test
	public void setup() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/home/vamsivinayjampana/Downloads/chromedriver_linux64 (3)/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(100000);
		for(int a=0;a<6000;a++) {
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Mark as read']//div[@class='asa']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id=':lz'])[1]")).click();
		Thread.sleep(2000);
		}
	
	}

}
