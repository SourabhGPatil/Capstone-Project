package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	WebDriver driver;
	
	// Constructor to initialize WebDriver
	public Homepage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	// Scenario 1: Click on Sign In Button
	By signInBtn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	public void scenario1() 
	{
		driver.findElement(signInBtn).click(); // Clicking on Sign In button
	}
	
	// Scenario 2: Perform a search with a given query
	By searchText = By.xpath("//*[@id=\"search_query_top\"]"); // Entering search query
	By searchBtn = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"); // Clicking on the search button
	
	public void searchQuery(String query) 
	{
		driver.findElement(searchText).sendKeys(query); // Entering search query
		driver.findElement(searchBtn).click(); // Clicking on the search button
	}
	
	// Scenario 3: Click on a product and add it to the cart
	By productBtn = By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a");
	By addToCartBtn = By.xpath("//*[@id=\"add_to_cart\"]/button"); 
	
	public void clickOnProduct() 
	{
		driver.findElement(productBtn).click(); // Clicking on a product
	}
	
	public void addToCart() 
	{
		driver.findElement(addToCartBtn).click(); // Adding the product to the cart
	}
	
	
	// Scenario 4: Checkout process
	By cartBtn = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
	By proceedCheckout1 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	By proceedCheckout2 = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	By termsOfServiceCheckBox = By.xpath("//*[@id=\"cgv\"]");
	By proceedCheckout3 = By.xpath("//*[@id=\"form\"]/p/button");
	By payByCheckOption = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
	By confirmOrderBtn = By.xpath("//*[@id=\"cart_navigation\"]/button");
	
	public void clickOnCart() 
	{
		driver.findElement(cartBtn).click(); // Clicking on the cart button
	}
	
	public void checkoutProcess() throws InterruptedException 
	{
		Thread.sleep(4000); // Adding a delay for demonstration purposes (not recommended in real tests)
		driver.findElement(proceedCheckout1).click(); // Proceeding to checkout step 1
		Thread.sleep(4000);
		driver.findElement(proceedCheckout2).click(); // Proceeding to checkout step 2
		Thread.sleep(4000);
		driver.findElement(termsOfServiceCheckBox).click(); // Agreeing to terms of service
		driver.findElement(proceedCheckout3).click(); // Proceeding to checkout step 3
		Thread.sleep(4000);
		driver.findElement(payByCheckOption).click(); // Choosing to pay by check
		Thread.sleep(4000);
		driver.findElement(confirmOrderBtn).click(); // Confirming the order
	}
	
	// Scenario 5: Click on Contact Us button and send a message
	By contactUsBtn = By.xpath("//*[@id=\"contact-link\"]/a");
	By messageBox = By.xpath("//*[@id=\"message\"]");
	By sendBtn = By.xpath("//*[@id=\"submitMessage\"]");
	
	public void clickOnContactUs() throws InterruptedException 
	{
		driver.findElement(contactUsBtn).click(); 
	}
	
	public void sendMsg(String msg) 
	{
		driver.findElement(messageBox).sendKeys(msg); // Entering the message in the message box
		driver.findElement(sendBtn).click(); // Clicking on the send button
	}	
}
