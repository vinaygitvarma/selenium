package MeitySelenium;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class challengeLocators {
	JavascriptExecutor jsExecutor;
	Select select;
	WebDriver driver;
	Actions action;
	@FindBy(xpath="//input[@name=\"uploadedImage\"]")
	WebElement uploadFile;
	@FindBy(xpath="//input[@formcontrolname=\"startRange\"]")
	WebElement editionStartDate;
	@FindBy(xpath="//input[@formcontrolname=\"endRange\"]")
	WebElement editionendDate;
	@FindBy(xpath="//select[@class=\"form-control ng-star-inserted\"]")
	WebElement challengeEditionSelect;
	@FindBy(xpath="//select[@class=\"form-control\"]")
	WebElement challengeNameSelect;
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement userName;
	@FindBy(xpath ="//input[@id=\"input-password\"]")
	WebElement passWord;
	@FindBy(xpath ="//button[@class=\"appearance-filled full-width size-large shape-rectangle status-primary nb-transition login-button\"]")
	WebElement buTton;
	@FindBy(xpath="//span[@class=\"menu-title ng-tns-c85-13\"]")
	WebElement challengeText;
	@FindBy(xpath="//span[@class=\"menu-title ng-tns-c85-14\"]")
	WebElement internalChallenges;
	@FindBy(xpath="//button[@class=\"btn bg-transparent text-white border-white font-weight-bold\"]")
	WebElement challengeCreationButton;
	@FindBy(xpath="//*[@name=\"challengeName\"]")
	WebElement challengeCreationName;
	@FindBy(xpath="(//input[@id='input-name'])[7]")
	WebElement challengeCreationDescription;
	@FindBy(xpath="(//button[@class=\"btn custombtn\"])[3]")
	WebElement challengeCreationSubmit;
	@FindBy(xpath="(//button[@class='btn custombtn'][normalize-space()='Save'])[1]")
	WebElement edtionchallengeCreationButton;
	@FindBy(xpath="(//input[@id='input-name'])[1]")
	WebElement edtionchallengeCreationName;
	@FindBy(xpath="(//input[@id='input-name'])[2]")
	WebElement editionchallengeCreationDescription;
	@FindBy(xpath="//button[@data-target=\"#exampleModalCenter\"]")
	WebElement edtionchallengeCreationSubmit;
	@FindBy(xpath = "(//*[@id='dropdownMenuButton'])[2]")
	WebElement challengeACtionsButton;
	@FindBy(xpath = "//button[text()='Create Form']")
	WebElement challengeCreateForm;
	@FindBy(xpath ="//button[@id='next_step_1']")
	WebElement challengeNext;
	@FindBy(xpath ="//button[@id='next_step_2']")
	WebElement challengeNext2;
	@FindBy(xpath ="//button[@id='next_step_3']")
	WebElement challengeNext3;
	@FindBy(xpath ="//button[@id='next_step_4']")
	WebElement challengeNext4;
	@FindBy(xpath ="//button[@id='next_step_5']")
	WebElement challengeNext5;
	@FindBy(xpath ="(//select[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[1]")
	WebElement challengeRegion;
	@FindBy(xpath ="//select[@formcontrolname='timeZone']")
	WebElement ChallengeTimeZone;
	@FindBy(xpath ="(//*[@class='dropdown-btn'])[2]")
	WebElement challengeSector;
	@FindBy(xpath="(//*[text()='Online Classified'])[1]")
	WebElement challengeSectorSelect;
	@FindBy(xpath ="(//*[@class='dropdown-btn'])[1]")
	WebElement challengeIndustry;
	@FindBy(xpath="//*[text()='Advertising']")
	WebElement challengeIndustrySelect;
	@FindBy(xpath ="(//div[@aria-label=\"Editor editing area: main\"])[1]")
	WebElement challengeDEscription;
	@FindBy(xpath ="(//div[@aria-label=\"Editor editing area: main\"])[2]")
	WebElement challengeEligibility;
	@FindBy(xpath ="//input[@id='txt']")
	WebElement challengeKeyword;
	@FindBy(xpath ="//input[@id='inputGroupFile03']")
	WebElement challengeAdditionalDocument;
	@FindBy(xpath="//*[text()=' OPPORTUNITY ']")
	WebElement challengeAdditionSection;
	@FindBy(xpath="(//*[@data-name=\"checkmark\"])[2]")
	WebElement challScroll;
	@FindBy(xpath="//a[@id=\"addquestion\"]")
	WebElement challengeAddQuestionButton;
	@FindBy(xpath="//input[@placeholder='Please Enter Question']")
	WebElement ChallengeAddquestioTextBox;
	@FindBy(xpath="//select[@id='selectfield_0']")
	WebElement challengeSelectQuestionType;
	@FindBy(xpath="//span[@class=\"slider round\"]")
	List<WebElement> challengeEnableButtons;
	@FindBy(xpath="//*[@id=\"dropdownMenuButton\"]")
	WebElement logouIcon;
	@FindBy(xpath="(//*[@class=\"dropdown-item\"])[2]")
	WebElement logout;
	
	
	public challengeLocators(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		jsExecutor = (JavascriptExecutor) driver;
		action = new Actions(driver);
		PageFactory.initElements(driver, this);

	}
	public void userName(String usernawme) {
		userName.sendKeys(usernawme);
	}
	public void passWord(String password) {
		passWord.sendKeys(password);
	}
	public void loginButton() {
		buTton.click();
	}
	public void challengeTextTap() {
		challengeText.click();
	}
	public void internalChallengesButton() {
		internalChallenges.click();
	}
	public void challengeCreationButtonM() {
		challengeCreationButton.click();
	}
	public void challengeCreationName(String name) {
		challengeCreationName.sendKeys(name);;
	}
	public void challengeCreationDescription(String desc) {
		challengeCreationDescription.sendKeys(desc);
	}
	public void challengeCreationSubmit() {
		challengeCreationSubmit.click();
	}
	public void challengeCreationSelectM(String visibleselect) {
		//jsExecutor.executeScript("arguments[0].scrollIntoView(true);", servcies);
		//System.out.println(servcies.getText());
		//Thread.sleep(3000);
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']")));
		challengeNameSelect.click();
		select=new Select(challengeNameSelect);
		select.selectByVisibleText(visibleselect);
	}
	public void challengeEdtionCreationSelectM(String visibleselect) {
		WebElement second = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']")));
		challengeEditionSelect.click();
		select=new Select(challengeEditionSelect);
		select.selectByVisibleText(visibleselect);
	}
	public void editionchallengeCreationNameM(String name) {
		edtionchallengeCreationName.sendKeys(name);
	}
	public void edtionedtionchallengeCreationDescriptionM(String desc) {
		editionchallengeCreationDescription.sendKeys(desc);
	}
	public void edtionstartdateM(String stratDate) {
		editionStartDate.sendKeys(stratDate);
	}
	public void editionEndDateM(String endDate) {
		editionendDate.sendKeys(endDate);
	}

	public void editionchallengeCreationSubmitM() {
		edtionchallengeCreationButton.click();
	}
	public void edtionchallengeCreationButtonM() {
		edtionchallengeCreationSubmit.click();
	}
	public void edtionUploadFile(String file) {
		uploadFile.sendKeys(file);
	}
	public void challengeActionM() {
		challengeACtionsButton.click();
	}
	public void challengeCreateFormM() {
		challengeCreateForm.click();
	}
	public void challengeNextM() {
		challengeNext.click();
	}
	public void challengeRegionSelectM(String visibleselect) {
		select=new Select(challengeRegion);
		select.selectByVisibleText(visibleselect);
		challengeRegion.click();
	}
	public void challengeTimezoneM(String visibleselect) {
		select=new Select(ChallengeTimeZone);
		select.selectByVisibleText(visibleselect);
		ChallengeTimeZone.click();
	}
	public void challengeIndustryM() {
		challengeIndustry.click();
	}
	public void challengeIndustrySlectM() {
		challengeIndustrySelect.click();
	}
	public void challengeSectorM() {
		challengeSector.click();
	}
	public void challengeSectorSlectM() {
		challengeSectorSelect.click();
	}
	public void challnegeDescriptionMM(String name) {
		challengeDEscription.sendKeys(name);
	}
	public void challengeEligilibityM(String name) {
		challengeEligibility.sendKeys(name);
	}
	public void challengeKeyword(String name) {
		challengeKeyword.sendKeys(name);
	}
	public void challengeAddtionalFile(String file) {
		challengeAdditionalDocument.sendKeys(file);
	}
	public void challenegEnableButtonsM() {
		for(int a=0;a<24;a++) {
			challengeEnableButtons.get(a).click();
		}

	}
	public void challengeButton2M() {
		challengeNext2.click();
	}
	public void challengeButton3M() {
		challengeNext3.click();
	}
	public void challengeButton4M() {
		challengeNext4.click();
	}
	public void challengeButton5M() {
		challengeNext5.click();
	}
	public void challengeAddQuestionMM() {
		challengeAddQuestionButton.click();
	}
	public void ChallengeAddquestioTextBoxM(String name) throws InterruptedException {
		
		//		 action.keyDown(Keys.SHIFT)
		//         .sendKeys("a")
		//         .build()
		//         .perform();
//		//		 
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('This is an alert!');");
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
////        wait.until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
////        Thread.sleep(2000);
//		//Store the alert in a variable
//		Alert alert = driver.switchTo().alert();
//
//		//Store the alert in a variable for reus
//
//		//Press the Cancel button
//		alert.accept();
		ChallengeAddquestioTextBox.click();
		action.sendKeys(ChallengeAddquestioTextBox, "what is your name").build().perform();
				ChallengeAddquestioTextBox.click();
				

				

	}
	public void challengeScrollM() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", challScroll);
	}
	public void challengeAdditionSectionM() {

		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=' OPPORTUNITY ']")));
		challengeAdditionSection.click();
	}
	public void challengeSelectQuestionTypeM(String visibleselect) {
		select=new Select(challengeSelectQuestionType);
		select.selectByVisibleText(visibleselect);
	}
	public void challengeLogoutIconn() {
		new Actions(driver)
        .moveToElement(logouIcon).perform();
	}
	public void challengeLogout() {
		logout.click();
		System.out.println("test");
	}

}
