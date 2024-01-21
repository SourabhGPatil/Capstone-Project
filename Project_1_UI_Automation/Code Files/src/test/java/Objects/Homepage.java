package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	WebDriver driver;
	
	//Constructor
	public Homepage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//Scenario1
	By signInBtn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	public void scenario1() {
		driver.findElement(signInBtn).click();
	}
	
	//Scenario2
	By searchText = By.xpath("//*[@id=\"search_query_top\"]");
	By searchBtn = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button");
	
	public void searchQuery(String query) {
		driver.findElement(searchText).sendKeys(query);
		driver.findElement(searchBtn).click();
	}
	
	//Scenario3
	By productBtn = By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a");
	By addToCartBtn = By.xpath("//*[@id=\"add_to_cart\"]/button");
	
	public void clickOnProduct() {
		driver.findElement(productBtn).click();
	}
	
	public void addToCart() {
		driver.findElement(addToCartBtn).click();
	}
	
	
	//Scenario4
	By cartBtn = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
	By proceedCheckout1 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	By proceedCheckout2 = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	By termsOfServiceCheckBox = By.xpath("//*[@id=\"cgv\"]");
	By proceedCheckout3 = By.xpath("//*[@id=\"form\"]/p/button");
	By payByCheckOption = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
	By confirmOrderBtn = By.xpath("//*[@id=\"cart_navigation\"]/button");
	
	public void clickOnCart() {
		driver.findElement(cartBtn).click();
	}
	
	public void checkoutProcess() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(proceedCheckout1).click();
		Thread.sleep(4000);
		driver.findElement(proceedCheckout2).click();
		Thread.sleep(4000);
		driver.findElement(termsOfServiceCheckBox).click();
		driver.findElement(proceedCheckout3).click();
		Thread.sleep(4000);
		driver.findElement(payByCheckOption).click();
		Thread.sleep(4000);
		driver.findElement(confirmOrderBtn).click();
	}
	
	//Scenario5
	By contactUsBtn = By.xpath("//*[@id=\"contact-link\"]/a");
	By messageBox = By.xpath("//*[@id=\"message\"]");
	By sendBtn = By.xpath("//*[@id=\"submitMessage\"]");
	
	public void clickOnContactUs() throws InterruptedException {
		driver.findElement(contactUsBtn).click();
	}
	
	public void sendMsg(String msg) {
		driver.findElement(messageBox).sendKeys(msg);
		driver.findElement(sendBtn).click();
	}
	
	
	

	
	
}
