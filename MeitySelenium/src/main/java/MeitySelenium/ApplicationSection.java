package MeitySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationSection extends reuseableCode{
WebDriver driver;
	public ApplicationSection(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	@FindBy(xpath ="//button[@id='next_step_3']")
	WebElement challengeNext3;
	@FindBy(xpath="//*[text()=' OPPORTUNITY ']")
	WebElement challengeAdditionSection;
	@FindBy(xpath="//*[text()='Application Section']")
	WebElement applicatio;
	public AddQuestion applicatioSection() throws InterruptedException {
		waitForElementToBevisibleWebelement(applicatio);
		scrollToElement(applicatio);
		waitForElementToBeClickableWebelement(challengeAdditionSection);
		challengeAdditionSection.click();
		challengeNext3.click();
		AddQuestion addQuestion= new AddQuestion(driver);
		return addQuestion;
	}
	

}
