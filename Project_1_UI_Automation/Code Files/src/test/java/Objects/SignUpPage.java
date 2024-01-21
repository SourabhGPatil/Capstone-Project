package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	
	WebDriver signUpDriver;
	
	//Constructor
	public SignUpPage(WebDriver signUpDriver) {
		super();
		this.signUpDriver = signUpDriver;
	}
	
	//Scenario1
	By signUpMailField = By.xpath("//*[@id=\"email_create\"]");
	By createAccountBtn = By.xpath("//*[@id=\"SubmitCreate\"]");
	
	public void signup1(String mail) {
		signUpDriver.findElement(signUpMailField).sendKeys(mail);
		signUpDriver.findElement(createAccountBtn).click();
	}
	
	//Scenario3
	By signOutBtn_onUserProfilePage = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");
	public void clickOnSignout() {
		signUpDriver.findElement(signOutBtn_onUserProfilePage).click();
	}
	
	//Scenario4
	By forgotPwdOption = By.xpath("//*[@id=\"login_form\"]/div/p[1]/a");
	By forgotPwdEmail = By.xpath("//*[@id=\"email\"]");
	By retrievePwdBtn = By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button");
	
	public void clickOnForgotPwd() {
		signUpDriver.findElement(forgotPwdOption).click();
	}
	
	public void completeForgotPwdProcess(String mail) throws InterruptedException {
		Thread.sleep(3000);
		signUpDriver.findElement(forgotPwdEmail).sendKeys(mail);
		signUpDriver.findElement(retrievePwdBtn).click();
	}
	
	//Scenario 5
	By newsletterMailBox = By.xpath("//*[@id=\"newsletter-input\"]");
	By proceedBtn = By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button");
	
	public void enterMailForNewsletter(String mail) {
		signUpDriver.findElement(newsletterMailBox).sendKeys(mail);
	}
	
	
	public void clickOnProceedBtn() {
		signUpDriver.findElement(proceedBtn).click();
	}

}
