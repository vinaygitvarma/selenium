package MeitySelenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bsh.This;

public class Companydetails extends reuseableCode {
WebDriver driver;
Select select;
@FindBy(xpath="//span[@class=\"slider round\"]")
List<WebElement> challengeEnableButtons;
@FindBy(xpath ="(//*[@class='dropdown-btn'])[2]")
WebElement challengeSector;
@FindBy(xpath="(//*[text()='Online Classified'])[1]")
WebElement challengeSectorSelect;
@FindBy(xpath ="(//*[@class='dropdown-btn'])[1]")
WebElement challengeIndustry;
@FindBy(xpath ="(//select[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[1]")
WebElement challengeRegion;
@FindBy(xpath ="//select[@formcontrolname='timeZone']")
WebElement ChallengeTimeZone;
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
	public Companydetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	
	public void companyDetails() {
		waitForElementToBevisibleWebelement(ChallengeTimeZone);
		select=new Select(challengeRegion);
		select.selectByVisibleText("Global");
		challengeRegion.click();
		select=new Select(ChallengeTimeZone);
		select.selectByVisibleText("IST");
		ChallengeTimeZone.click();
		challengeIndustry.click();
		challengeIndustrySelect.click();
		challengeIndustry.click();
			challengeSector.click();
		
			challengeSectorSelect.click();
			challengeSector.click();
			String challengeDesc=randomString();
			String challengeEligibilitys=randomString();
			String challengekey=randomString();
			challengeDEscription.sendKeys(challengeDesc);
			challengeEligibility.sendKeys(challengeEligibilitys);
			challengeKeyword.sendKeys(challengekey);
			challengeAdditionalDocument.sendKeys("/home/vamsivinayjampana/Downloads/d4ea6f4b-46e6-41d3-bd88-5ae3f2247448.docx");
			challengeNext.click();
		
	}
	public ApplicationSection enableButtons() {
		for(int a=0;a<24;a++) {
			waitForElementToBevisibleWebelement(challengeEnableButtons.get(a));
			challengeEnableButtons.get(a).click();
		}
		challengeNext2.click();
		ApplicationSection applicationSection=new ApplicationSection(driver);
		return applicationSection;
	}
}
