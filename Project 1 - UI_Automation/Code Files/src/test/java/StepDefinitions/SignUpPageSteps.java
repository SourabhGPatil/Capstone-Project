package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import Objects.SignUpPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPageSteps {
	static WebDriver signUpDriver;
	static SignUpPage signuppage;
	
	
	
	@Before("@SignUpPageTest1")
	public void beforeSignup() throws Exception {
		String browser = "Firefox";
		
		if(browser.equalsIgnoreCase(browser)){
			//create firefox instance
			WebDriverManager.firefoxdriver().setup();
			signUpDriver = new FirefoxDriver();
		}
		
		//create Chrome instance
		else if(browser.equalsIgnoreCase(browser)){
			
			WebDriverManager.chromedriver().setup();
			signUpDriver = new ChromeDriver();
		}
		
		//create Edge instance
		else if(browser.equalsIgnoreCase(browser)){
			WebDriverManager.edgedriver().setup();
			signUpDriver = new EdgeDriver();
		}
		
		else{
			//If no browser is passed then run it by default on chrome
			throw new Exception("Incorrect Browser");
		}
		

		signUpDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		signUpDriver.manage().window().maximize();
	}
	
	//--------SCENARIO 1------------//
	@Given("User is on the signup page")
	public void signup1_step() throws InterruptedException {
		Thread.sleep(4000);
		signUpDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@When("User creates an account with the email {string}")
	public void signup2_step(String mail) {
		signuppage = new SignUpPage(signUpDriver);
		signuppage.signup1(mail);
	}
	
	@Then("User signup is successful")
	public void signup3_step() {
		System.out.println("Signed up successfully");
	}
	
	
	//--------SCENARIO 2------------//
	@Given("User is on the Registraion Form")
	public void user_on_register_form() {
		System.out.println("FORM FILLING PROCESS");
	}
	
	@When("^User enters First Name as \"([^\"]*)\" Last Name as \"([^\"]*)\" Password as \"([^\"]*)\" Company as \"([^\"]*)\" Address as \"([^\"]*)\" City as \"([^\"]*)\" Zip as \"([^\"]*)\" Home Phone as \"([^\"]*)\" Mobile Phone as \"([^\"]*)\" Address Alias as \"([^\"]*)\"$")
	public void form_filling(String fname, String lname, String pwd, String company, String address, String city, String zip, String hphone, String mphone, String alias) {
		//Title
		WebElement title = signUpDriver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		//First Name
		WebElement firstname = signUpDriver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		//Last Name
		WebElement lastname = signUpDriver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		//Password
		WebElement password = signUpDriver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		//Date of Birth Drop Down List Elements
		Select dobD = new Select(signUpDriver.findElement(By.xpath("//*[@id=\"days\"]")));
		Select dobM = new Select(signUpDriver.findElement(By.xpath("//*[@id=\"months\"]")));
		Select dobY = new Select(signUpDriver.findElement(By.xpath("//*[@id=\"years\"]")));
		//Company
		WebElement cmpny = signUpDriver.findElement(By.xpath("//*[@id=\"company\"]"));
		//Address
		WebElement addrs = signUpDriver.findElement(By.xpath("//*[@id=\"address1\"]"));
		//City
		WebElement cit = signUpDriver.findElement(By.xpath("//*[@id=\"city\"]"));
		//State
		Select state = new Select(signUpDriver.findElement(By.xpath("//*[@id=\"id_state\"]")));
		//ZIP Code
		WebElement zipCode = signUpDriver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		//Home Number
		WebElement homeNo = signUpDriver.findElement(By.xpath("//*[@id=\"phone\"]"));
		//Mobile Number
		WebElement mobileNo = signUpDriver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		//Address Alias
		WebElement addAlias = signUpDriver.findElement(By.xpath("//*[@id=\"alias\"]"));
		//Register Button
		WebElement registerBtn = signUpDriver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
		
		//ACTIONS
		title.click();
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		password.sendKeys(pwd);
		dobD.selectByValue("20");
		dobM.selectByValue("6");
		dobY.selectByValue("2000");
		cmpny.sendKeys(company);
		addrs.sendKeys(address);
		cit.sendKeys(city);
		state.selectByValue("28");
		zipCode.sendKeys(zip);
		homeNo.sendKeys(hphone);
		mobileNo.sendKeys(mphone);
		addAlias.clear();
		addAlias.sendKeys(alias);
		registerBtn.click();
	}
	
	@Then("User is successfully registered")
	public void user_registered() {
		System.out.println("User Registered successfully");
	}
	
	
	//--------SCENARIO 3------------//
	@When("User clicks on the sign out button")
	public void clicks_on_signout() throws InterruptedException {
		Thread.sleep(4000);
		signuppage.clickOnSignout();
	}
	
	@Then("User must be signed out from the account")
	public void signout_success() {
		System.out.println("User signed out successfully");
	}
	
	//--------SCENARIO 4------------//
	@When("User clicks on the Forgot Password option")
	public void user_clicks_on_frgt_pwd() {
		signuppage.clickOnForgotPwd();
	}
	
	@And("User completes the Retrieve Password process with the email {string}")
	public void user_completes_frgt_pwd_process(String mail) throws InterruptedException {
		signuppage.completeForgotPwdProcess(mail);
	}
	
	@Then("User successfully retrieves the password")
	public void retrieve_pwd_sucess() {
		System.out.println("User retrieved the password successfully");
	}
	
	//--------SCENARIO 5------------//
	@When("User enters the email {string}")
	public void user_enters_mail_in_newsletter(String mail) {
		signuppage.enterMailForNewsletter(mail);
	}
	
	@And("User clicks on the proceed button")
	public void user_clicks_on_proceed() {
		signuppage.clickOnProceedBtn();
	}
	
	@Then("User will successfully be subscribed to the newsletter")
	public void newsletter_success() throws InterruptedException {
		System.out.println("Subscribed to the newsletter successfully");
		Thread.sleep(4000);
		signUpDriver.close();
	}
}
