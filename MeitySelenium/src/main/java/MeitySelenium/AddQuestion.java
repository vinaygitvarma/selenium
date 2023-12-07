package MeitySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddQuestion extends reuseableCode{
	WebDriver driver;
	Actions action;
	Select select;
	public AddQuestion(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
	}
	@FindBy(xpath="//a[@id=\"addquestion\"]")
	WebElement challengeAddQuestionButton;
	@FindBy(xpath="//input[@placeholder='Please Enter Question']")
	WebElement ChallengeAddquestioTextBox;
	@FindBy(xpath="//select[@id='selectfield_0']")
	WebElement challengeSelectQuestionType;
	@FindBy(xpath ="//button[@id='next_step_4']")
	WebElement challengeNext4;
	@FindBy(xpath ="//button[@id='next_step_5']")
	WebElement challengeNext5;
	@FindBy(xpath="//*[@id=\"dropdownMenuButton\"]")
	WebElement logouIcon;
	@FindBy(xpath="(//*[@class=\"dropdown-item\"])[2]")
	WebElement logout;
	public void addQuestion() throws InterruptedException {
		waitForElementToBeClickableWebelement(challengeAddQuestionButton);
		challengeAddQuestionButton.click();
		ChallengeAddquestioTextBox.click();
		action = new Actions(driver);
		action.sendKeys(ChallengeAddquestioTextBox, "what is ").build().perform();
		action.sendKeys(ChallengeAddquestioTextBox, "your nam").build().perform();
		action.sendKeys(ChallengeAddquestioTextBox, "e").build().perform();
				ChallengeAddquestioTextBox.click();
				select=new Select(challengeSelectQuestionType);
				select.selectByVisibleText("Long Answer");
				challengeNext4.click();
waitForElementToBeClickableWebelement(challengeNext5);
				challengeNext5.click();
				Thread.sleep(3000);
		        action.moveToElement(logouIcon).perform();
		        waitForElementToBeClickableWebelement(logout);
				logout.click();
				System.out.println("test");
			
	}

}
