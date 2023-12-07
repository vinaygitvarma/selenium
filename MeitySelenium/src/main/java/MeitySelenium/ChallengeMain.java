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

 

public class ChallengeMain {
	WebDriver driver;
	challengeLocators challengeLocato;
	String uuid;
	String uuid1;
	String uuid2;
	Actions action;
	LocalDate currentDate = LocalDate.now().plusDays(2);

 

	// Format the date as day, month, year
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String formattedDate = currentDate.format(formatter);
      LocalDate tomorrow = LocalDate.now().plusDays(1);

 

      // Format the date as dd/MM/yyyy
      DateTimeFormatter formattertommorrow = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String tommorrowDate = tomorrow.format(formattertommorrow);
	@Test
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "/home/vamsivinayjampana/Downloads/chromedriver_linux64 (3)/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		challengeLocato=new challengeLocators(driver);
		action=new Actions(driver);
		driver.get("http://13.233.29.114/meityadmin/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		uuid = RandomStringUtils.randomAlphanumeric(3);

	}
	@Test(dependsOnMethods = {"tchalle"})

 

	public void closeBrowser() {

 

	 System.out.println("QUIT");

 

	driver.quit();

 

	}
	@Test
	public void tchalle() throws InterruptedException {
		challengeLocato.userName("superadmin@gmail.com");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(formattedDate);
		System.out.println(formattedDate);
		challengeLocato.passWord("Flower123#");
		challengeLocato.loginButton();
		challengeLocato.challengeTextTap();
		challengeLocato.internalChallengesButton();
		challengeLocato.challengeCreationButtonM();
		challengeLocato.challengeCreationName("CHALLENGE"+uuid);
		challengeLocato.challengeCreationDescription("DESC"+uuid);
		Thread.sleep(1000);
		challengeLocato.challengeCreationSubmit();
		challengeLocato.challengeCreationSelectM("CHALLENGE"+uuid);

		challengeLocato.edtionchallengeCreationButtonM();
		uuid1 = RandomStringUtils.randomAlphanumeric(3);
		challengeLocato.editionchallengeCreationNameM("EDITION"+uuid1);
		uuid2 = RandomStringUtils.randomAlphanumeric(3);
		challengeLocato.edtionedtionchallengeCreationDescriptionM("EDITION"+uuid2);
		challengeLocato.edtionstartdateM(tommorrowDate);
		challengeLocato.editionEndDateM(formattedDate);
		challengeLocato.edtionUploadFile("/home/vamsivinayjampana/Documents/banner-6.jpg");
		challengeLocato.editionchallengeCreationSubmitM();
		Thread.sleep(5000);
		challengeLocato.challengeCreationSelectM("CHALLENGE"+uuid);
		Thread.sleep(3000);
		challengeLocato.challengeEdtionCreationSelectM("EDITION"+uuid1);
		Thread.sleep(1000);
		challengeLocato.challengeActionM();
		Thread.sleep(1000);
		challengeLocato.challengeCreateFormM();
		Thread.sleep(3000);
		challengeLocato.challengeRegionSelectM("Global");
		challengeLocato.challengeTimezoneM("IST");
		Thread.sleep(2000);
		challengeLocato.challengeIndustryM();
		Thread.sleep(2000);
		challengeLocato.challengeIndustrySlectM();
		challengeLocato.challengeIndustryM();
		challengeLocato.challengeSectorM();
		challengeLocato.challengeSectorSlectM();
		challengeLocato.challengeSectorM();
		challengeLocato.challnegeDescriptionMM("qwerty");
		challengeLocato.challengeEligilibityM("pointer");
		challengeLocato.challengeKeyword("test");
		challengeLocato.challengeAddtionalFile("/home/vamsivinayjampana/Downloads/d4ea6f4b-46e6-41d3-bd88-5ae3f2247448.docx");
		action.scrollToElement(challengeLocato.challengeNext).perform();
		challengeLocato.challengeNextM();
		challengeLocato.challenegEnableButtonsM();
		action.scrollToElement(challengeLocato.challengeNext2).perform();
		challengeLocato.challengeButton2M();
		Thread.sleep(2000);	
		challengeLocato.challengeScrollM();
		challengeLocato.challengeAdditionSectionM();
		action.scrollToElement(challengeLocato.challengeNext3).perform();
		challengeLocato.challengeButton3M();
		Thread.sleep(2000);
		challengeLocato.challengeAddQuestionMM();
//		Scanner input = new Scanner(System.in);
//
//	    System.out.print("Enter your question: ");
//
//	    // takes input from the keyboardJavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('This is an alert!');");
//	    String name = "ddd";
//	   
		challengeLocato.ChallengeAddquestioTextBoxM("name");

		challengeLocato.challengeSelectQuestionTypeM("Long Answer");
		action.scrollToElement(challengeLocato.challengeNext4).perform();
		challengeLocato.challengeButton4M();
		Thread.sleep(2000);
		action.scrollToElement(challengeLocato.challengeNext5).perform();
		challengeLocato.challengeButton5M();
		Thread.sleep(7000);
		challengeLocato.challengeLogoutIconn();
		Thread.sleep(2000);
		challengeLocato.challengeLogout();
		System.out.println("challenge CREate");
		Thread.sleep(1000);



	}

}