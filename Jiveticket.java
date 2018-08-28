package jivepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jiveticket {
	WebDriver driver = null ;
	@FindBy(id = "name")
	WebElement nameUser;
	@FindBy(id = "email")
	WebElement emailId;
	@FindBy(id = "company")
	WebElement companyName;
	@FindBy(id = "phone")
	WebElement phoneNumber;
	@FindBy(id = "subject")
	WebElement subjectText;
	@FindBy(css = "#ticketForm > div:nth-child(8) > textarea")
	WebElement messageText;
	@FindBy(css = "#ticketForm > div:nth-child(8) > textarea")
	WebElement finishedForm;
	@FindBy(id= "alertify-logs")
	WebElement InvalidMsg;
	
	public Jiveticket(WebDriver driver) {
		
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	public String DefaultForm () {
		nameUser.sendKeys("An@!~./;'[-9");
		emailId.sendKeys("anonymous@gmail.com");
		companyName.sendKeys("Jive");
		phoneNumber.sendKeys("9999999999");
		subjectText.sendKeys("Abcd");
		messageText.sendKeys("Yes");
		 return finishedForm.getAttribute("Value");	 
	}
	public String DefaultError () {
		nameUser.sendKeys("");
		emailId.sendKeys("anonymous@gmail.com");
		companyName.sendKeys("Jive");
		phoneNumber.sendKeys("9999999999");
		subjectText.sendKeys("Abcd");
		messageText.sendKeys("Yes");
		submit.click();
		return InvalidMsg.getText();
	}
	
}