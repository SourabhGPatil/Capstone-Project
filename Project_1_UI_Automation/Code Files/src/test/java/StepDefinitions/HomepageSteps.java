package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Objects.Homepage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;




public class HomepageSteps {
	static WebDriver driver;
	static Homepage homepage;
		
	
	

	@Before("@test1")
	public void Before() throws Exception {
		
		String browser = "Firefox";
				
		//create firefox instance
		if(browser.equalsIgnoreCase(browser)){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//create Chrome instance
		else if(browser.equalsIgnoreCase(browser)){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		//create Edge instance
		else if(browser.equalsIgnoreCase(browser)){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else{
			//If no browser is passed then run it by default on chrome
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Maximize the window
		driver.manage().window().maximize();
		System.out.println("The browser is open");	
	}
	
	
	@Given("User is on homepage")
	public void user_on_homepage() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("http://automationpractice.com/index.php");
	}
	
	@When("User clicks on Sign In button")
	public void user_click_sign_in() throws InterruptedException
	{
		homepage = new Homepage(driver);
		homepage.scenario1();		
	}
	
	@And("^User logins with email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_logins(String mail, String pwd)
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	}
	
	@Then("User must login to the website")
	public void login_success()
	{
		System.out.println("Logged in successfully");
	}
	
	
	
	//---SCENARIO 2---//
	@When("^User enters search query as \"([^\"]*)\"$")
	public void search_query(String query)
	{
		homepage.searchQuery(query);
	}
	
	@Then("Search query should be executed")
	public void search_query_success() {
		System.out.println("Searched successfully");
	}
	
	
	//---SCENARIO 3---//
	@When("User clicks on a product")
	public void clicks_on_product() {
		homepage.clickOnProduct();
	}
	
	@And("User adds the product to the cart")
	public void add_to_cart() {
		homepage.addToCart();
	}
	
	@Then("The product must be successfully added to the cart")
	public void addProduct_success() {
		System.out.println("Added product to the cart successfully");
	}
	
	
	//---SCENARIO 4---//
	@When("User clicks on the cart")
	public void click_on_cart() {
		homepage.clickOnCart();
	}
	
	@And("User proceeds to checkout")
	public void product_checkouts() throws InterruptedException {
		homepage.checkoutProcess();
	}
	
	@Then("The order is successfully placed")
	public void order_success() {
		System.out.println("Order placed successfully");
	}
	
	
	//---SCENARIO 5---//
	@When("User clicks on the Contact us button")
	public void user_clicks_contact_us() throws InterruptedException {
		homepage.clickOnContactUs();
		Thread.sleep(4000);
		
		//Message Form Automation
		WebElement headingDD = driver.findElement(By.id("id_contact"));  
		Select heading = new Select(headingDD);
		heading.selectByValue("2");
		
		WebElement orderRefDD = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/fieldset/div[1]/div[1]/div[2]/div/select"));
		Select orderRef = new Select(orderRefDD);
		orderRef.selectByValue("453342");
		
		WebElement productDD = driver.findElement(By.xpath("//*[@id=\"453342_order_products\"]"));
		Select product = new Select(productDD);
		product.selectByValue("1");
		
	}
	
	@And("^User fills the message form with message as \"([^\"]*)\" and submits it$")
	public void user_sends_msg(String msg)
	{
		homepage.sendMsg(msg);
	}
	
	@Then("The message is successfully sent to the team")
	public void contact_us_success() throws InterruptedException {
		System.out.println("Message sent successfully");
		Thread.sleep(4000);
		driver.close();
	}

}
