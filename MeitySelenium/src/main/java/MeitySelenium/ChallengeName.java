package MeitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChallengeName extends reuseableCode{
	Select select;
	WebDriver driver;
	String challengename;
	
	public ChallengeName(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
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
	@FindBy(xpath="//select[@class=\"form-control ng-star-inserted\"]")
	WebElement challengeEditionSelect;
	@FindBy(xpath="//select[@class=\"form-control\"]")
	WebElement challengeNameSelect;
	@FindBy(xpath="//input[@formcontrolname=\"startRange\"]")
	WebElement editionStartDate;
	@FindBy(xpath="//input[@formcontrolname=\"endRange\"]")
	WebElement editionendDate;
	@FindBy(xpath="//input[@name=\"uploadedImage\"]")
	WebElement uploadFile;
	@FindBy(xpath = "//button[text()='Create Form']")
	WebElement challengeCreateForm;
	By waiter =By.xpath("//select[@class='form-control']");
	public void challengeName() throws InterruptedException {
		waitForElementToBeClickableWebelement(challengeText);
			challengeText.click();
			waitForElementToBeClickableWebelement(internalChallenges);
			internalChallenges.click();
			
			challengeCreationButton.click();
			waitForElementToBeClickableWebelement(challengeCreationName);
			challengename = randomString();
			String challengeDesc=randomString();
			
			challengeCreationName.sendKeys(challengename);
			challengeCreationDescription.sendKeys(challengeDesc);
			challengeCreationSubmit.click();
			waitForElementToBeClickable(waiter);
			challengeNameSelect.click();
			Thread.sleep(1000);
			select=new Select(challengeNameSelect);
			select.selectByVisibleText(challengename);
		
	}
	public void editionName() throws InterruptedException {
		edtionchallengeCreationSubmit.click();
		String editionname = randomString();
		String editionDesc=randomString();
		waitForElementToBeClickableWebelement(edtionchallengeCreationName);
		edtionchallengeCreationName.sendKeys(editionname);
		editionchallengeCreationDescription.sendKeys(editionDesc);
		
		editionStartDate.sendKeys(tommorowDate());
		editionendDate.sendKeys(endDate());
		uploadFile.sendKeys("/home/vamsivinayjampana/Documents/banner-6.jpg");
		edtionchallengeCreationButton.click();
		Thread.sleep(3000);
		waitForElementToBeClickableWebelement(challengeNameSelect);
		challengeNameSelect.click();
		select=new Select(challengeNameSelect);
		select.selectByVisibleText(challengename);
		waitForElementToBeClickableWebelement(challengeEditionSelect);
		challengeEditionSelect.click();
		select=new Select(challengeEditionSelect);
		select.selectByVisibleText(editionname);
	
}
	public Companydetails action() {
		waitForElementToBeClickableWebelement(challengeACtionsButton);
		
		challengeACtionsButton.click();
		waitForElementToBeClickableWebelement(challengeCreateForm);
		challengeCreateForm.click();
	Companydetails companyDetails=new Companydetails(driver);
	return companyDetails;
		
		
	}
	

}
	