package MeitySelenium;

import org.testng.annotations.Test;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class challenge extends Baseclass{
	ChallengeName challe;
	@Test
	public void tchalle() throws InterruptedException {
	challe=loginPage.loginSuccess("superadmin@gmail.com","Flower123#");
	Thread.sleep(2000);
	challe.challengeName();
	challe.editionName();

	}
	
	@Test
	public void companydetails() throws InterruptedException {
		Companydetails companydetails =challe.action();
		companydetails.companyDetails();
		ApplicationSection applicationSection=companydetails.enableButtons();
		AddQuestion addQuestion=applicationSection.applicatioSection();
		addQuestion.addQuestion();	 
	}
	
	
	
}